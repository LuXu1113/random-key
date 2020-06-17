#ifndef RANDOM_KEY_INCLUDE_THREAD_POOL_H_
#define RANDOM_KEY_INCLUDE_THREAD_POOL_H_

#include <memory>
#include <vector>
#include <queue>
#include <thread>
#include <mutex>
#include <condition_variable>
#include <future>
#include <functional>

namespace random_key {

class ThreadPool {
 public:
  ThreadPool() = delete;
  ThreadPool(const ThreadPool&) = delete;
  ThreadPool(const int num_of_workers);
  ~ThreadPool();

  template<class F, class... Args>
  auto add_job(F&& f, Args&&... args)
    -> std::future<typename std::result_of<F(Args...)>::type>;

  void join();

 private:
  std::vector<std::thread> workers_;
  std::queue<std::function<void()> > jobs_;

  std::mutex queue_mutex_;
  std::condition_variable condition_;
  bool stop_;
};

template<class F, class ... Args>
auto ThreadPool::add_job(F&& f, Args&&... args)
  -> std::future<typename std::result_of<F(Args...)>::type> {
  using return_type = typename std::result_of<F(Args...)>::type;

  auto task = std::make_shared<std::packaged_task<return_type()> >(
    std::bind(std::forward<F>(f), std::forward<Args>(args)...)
  );

  std::future<return_type> res = task->get_future();
  {
    std::unique_lock<std::mutex> lock(queue_mutex_);

    if (!stop_) {
      jobs_.emplace([task]() {
        (*task)();
      });
    }
  }
  condition_.notify_one();
  return res;
}

} //namespace random_key

#endif // RANDOM_KEY_INCLUDE_THREAD_POOL_H_

