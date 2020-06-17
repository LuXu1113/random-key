#include "include/base64.h"

namespace random_key {

// ref: https://github.com/ReneNyffenegger/cpp-base64/blob/master/base64.cpp

static const char* base64_chars[2] = {
  "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  "abcdefghijklmnopqrstuvwxyz"
  "0123456789"
  "+/",
  "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  "abcdefghijklmnopqrstuvwxyz"
  "0123456789"
  "-_"
};

static unsigned int pos_of_char(const char chr) {
  if (chr >= 'A' && chr <= 'Z') {
    return chr - 'A';
  } else if (chr >= 'a' && chr <= 'z') {
    return chr - 'a' + ('Z' - 'A') + 1;
  } else if (chr >= '0' && chr <= '9') {
    return chr - '0' + ('Z' - 'A') + ('z' - 'a') + 2;
  } else if (chr == '+' || chr == '-') {
    return 62; // Be liberal with input and accept both url ('-') and non-url ('+') base 64 characters (
  } else if (chr == '/' || chr == '_') {
    return 63; // Ditto for '/' and '_'
  }
  return 0;
}

static std::string encode(const char *bytes_to_encode, size_t in_len, bool url) {
  size_t len_encoded = (in_len + 2) / 3 * 4;

  unsigned char trailing_char = url ? '.' : '=';
  const char* base64_chars_ = base64_chars[url];

  std::string ret;
  ret.reserve(len_encoded);

  unsigned int pos = 0;
  while (pos < in_len) {
    ret.push_back(base64_chars_[(bytes_to_encode[pos + 0] & 0xfc) >> 2]);

    if (pos + 1 < in_len) {
      ret.push_back(base64_chars_[((bytes_to_encode[pos + 0] & 0x03) << 4) + ((bytes_to_encode[pos + 1] & 0xf0) >> 4)]);

      if (pos + 2 < in_len) {
        ret.push_back(base64_chars_[((bytes_to_encode[pos + 1] & 0x0f) << 2) + ((bytes_to_encode[pos + 2] & 0xc0) >> 6)]);
        ret.push_back(base64_chars_[bytes_to_encode[pos + 2] & 0x3f]);
      } else {
        ret.push_back(base64_chars_[(bytes_to_encode[pos + 1] & 0x0f) << 2]);
        ret.push_back(trailing_char);
      }
    } else {
      ret.push_back(base64_chars_[(bytes_to_encode[pos + 0] & 0x03) << 4]);
      ret.push_back(trailing_char);
      ret.push_back(trailing_char);
    }

    pos += 3;
  }

  return ret;
}

static std::string decode(const char *bytes_to_decode, size_t in_len) {
  if (!in_len) {
    return std::string("");
  }

  std::string ret;

  size_t pos = 0;
  while (pos < in_len) {
    unsigned int pos_of_char_1 = 0;
    if (pos + 1 < in_len) {
      pos_of_char_1 = pos_of_char(bytes_to_decode[pos + 1]);
    }
    ret.push_back(((pos_of_char(bytes_to_decode[pos + 0])) << 2) + ((pos_of_char_1 & 0x30) >> 4));

    if (pos + 2 < in_len && bytes_to_decode[pos + 2] != '=' && bytes_to_decode[pos + 2] != '.') {
      // accept URL-safe base 64 strings, too, so check for '.' also.
      unsigned int pos_of_char_2 = pos_of_char(bytes_to_decode[pos + 2]);
      ret.push_back(static_cast<std::string::value_type>(((pos_of_char_1 & 0x0f) << 4) + ((pos_of_char_2 & 0x3c) >> 2)));

      if (pos + 3 < in_len && bytes_to_decode[pos + 3] != '=' && bytes_to_decode[pos + 3] != '.') {
        ret.push_back(static_cast<std::string::value_type>(((pos_of_char_2 & 0x03) << 6) + pos_of_char(bytes_to_decode[pos + 3])));
      }
    }

    pos += 4;
  }

  return ret;
}

std::string base64_encode(absl::string_view s, bool url) {
  return encode(s.begin(), s.length(), url);
}

std::string base64_decode(absl::string_view s) {
  return decode(s.begin(), s.length());
}

}

