#ifndef RANDOM_KEY_INCLUDE_BASE64_H_
#define RANDOM_KEY_INCLUDE_BASE64_H_

#include <string>
#include "absl/strings/string_view.h"

namespace random_key {

std::string base64_encode(absl::string_view s, bool url);
std::string base64_decode(absl::string_view s);

}

#endif // RANDOM_KEY_INCLUDE_BASE64_H_
