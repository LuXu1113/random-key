#include "include/thread_pool.h"

namespace random_key {

ThreadPool::ThreadPool(int num_of_workers) :
  workers_(),
  jobs_(),
  queue_mutex_(),
  condition_(),
  stop_(false) {
  for (int i = 0; i < num_of_workers; ++i) {
    workers_.emplace_back([this] {
      for (;;) {
        std::function<void()> task;

        {
          std::unique_lock<std::mutex> lock(this->queue_mutex_);
          this->condition_.wait(lock, [this] {
            return (this->stop_) || !(this->jobs_.empty());
          });
          if (this->stop_ && this->jobs_.empty()) {
            return;
          }
          task = std::move(this->jobs_.front());
          this->jobs_.pop();
        }

        task();
      }
    });
  }
}

ThreadPool::~ThreadPool() {
  if (!stop_) {
    this->join();
  }
}

void ThreadPool::join() {
  {
    std::unique_lock<std::mutex> lock(queue_mutex_);
    stop_ = true;
  }

  condition_.notify_all();

  for (std::thread &worker: workers_) {
    worker.join();
  }
}

} // namespace random_key

