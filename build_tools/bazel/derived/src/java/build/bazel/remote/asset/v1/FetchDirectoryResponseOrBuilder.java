// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/asset/v1/remote_asset.proto

package build.bazel.remote.asset.v1;

public interface FetchDirectoryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.bazel.remote.asset.v1.FetchDirectoryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If the status has a code other than `OK`, it indicates that the operation
   * was unable to be completed for reasons outside the servers' control.
   * The possible fetch errors include:
   * * `DEADLINE_EXCEEDED`: The operation could not be completed within the
   *   specified timeout.
   * * `NOT_FOUND`: The requested asset was not found at the specified location.
   * * `PERMISSION_DENIED`: The request was rejected by a remote server, or
   *   requested an asset from a disallowed origin.
   * * `ABORTED`: The operation could not be completed, typically due to a
   *   failed consistency check.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * If the status has a code other than `OK`, it indicates that the operation
   * was unable to be completed for reasons outside the servers' control.
   * The possible fetch errors include:
   * * `DEADLINE_EXCEEDED`: The operation could not be completed within the
   *   specified timeout.
   * * `NOT_FOUND`: The requested asset was not found at the specified location.
   * * `PERMISSION_DENIED`: The request was rejected by a remote server, or
   *   requested an asset from a disallowed origin.
   * * `ABORTED`: The operation could not be completed, typically due to a
   *   failed consistency check.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   * @return The status.
   */
  com.google.rpc.Status getStatus();
  /**
   * <pre>
   * If the status has a code other than `OK`, it indicates that the operation
   * was unable to be completed for reasons outside the servers' control.
   * The possible fetch errors include:
   * * `DEADLINE_EXCEEDED`: The operation could not be completed within the
   *   specified timeout.
   * * `NOT_FOUND`: The requested asset was not found at the specified location.
   * * `PERMISSION_DENIED`: The request was rejected by a remote server, or
   *   requested an asset from a disallowed origin.
   * * `ABORTED`: The operation could not be completed, typically due to a
   *   failed consistency check.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * The uri from the request that resulted in a successful retrieval, or from
   * which the error indicated in `status` was obtained.
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * The uri from the request that resulted in a successful retrieval, or from
   * which the error indicated in `status` was obtained.
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * Any qualifiers known to the server and of interest to clients.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.asset.v1.Qualifier qualifiers = 3;</code>
   */
  java.util.List<build.bazel.remote.asset.v1.Qualifier> 
      getQualifiersList();
  /**
   * <pre>
   * Any qualifiers known to the server and of interest to clients.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.asset.v1.Qualifier qualifiers = 3;</code>
   */
  build.bazel.remote.asset.v1.Qualifier getQualifiers(int index);
  /**
   * <pre>
   * Any qualifiers known to the server and of interest to clients.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.asset.v1.Qualifier qualifiers = 3;</code>
   */
  int getQualifiersCount();
  /**
   * <pre>
   * Any qualifiers known to the server and of interest to clients.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.asset.v1.Qualifier qualifiers = 3;</code>
   */
  java.util.List<? extends build.bazel.remote.asset.v1.QualifierOrBuilder> 
      getQualifiersOrBuilderList();
  /**
   * <pre>
   * Any qualifiers known to the server and of interest to clients.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.asset.v1.Qualifier qualifiers = 3;</code>
   */
  build.bazel.remote.asset.v1.QualifierOrBuilder getQualifiersOrBuilder(
      int index);

  /**
   * <pre>
   * A minimum timestamp the content is expected to be available through.
   * Servers *MAY* omit this field, if not known with confidence.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expires_at = 4;</code>
   * @return Whether the expiresAt field is set.
   */
  boolean hasExpiresAt();
  /**
   * <pre>
   * A minimum timestamp the content is expected to be available through.
   * Servers *MAY* omit this field, if not known with confidence.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expires_at = 4;</code>
   * @return The expiresAt.
   */
  com.google.protobuf.Timestamp getExpiresAt();
  /**
   * <pre>
   * A minimum timestamp the content is expected to be available through.
   * Servers *MAY* omit this field, if not known with confidence.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expires_at = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpiresAtOrBuilder();

  /**
   * <pre>
   * The result of the fetch, if the status had code `OK`.
   * the root digest of a directory tree, suitable for fetching via
   * [ContentAddressableStorage.GetTree].
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest root_directory_digest = 5;</code>
   * @return Whether the rootDirectoryDigest field is set.
   */
  boolean hasRootDirectoryDigest();
  /**
   * <pre>
   * The result of the fetch, if the status had code `OK`.
   * the root digest of a directory tree, suitable for fetching via
   * [ContentAddressableStorage.GetTree].
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest root_directory_digest = 5;</code>
   * @return The rootDirectoryDigest.
   */
  build.bazel.remote.execution.v2.Digest getRootDirectoryDigest();
  /**
   * <pre>
   * The result of the fetch, if the status had code `OK`.
   * the root digest of a directory tree, suitable for fetching via
   * [ContentAddressableStorage.GetTree].
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest root_directory_digest = 5;</code>
   */
  build.bazel.remote.execution.v2.DigestOrBuilder getRootDirectoryDigestOrBuilder();
}
