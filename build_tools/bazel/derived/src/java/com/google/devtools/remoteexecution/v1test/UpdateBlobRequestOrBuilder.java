// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/remoteexecution/v1test/remote_execution.proto

package com.google.devtools.remoteexecution.v1test;

public interface UpdateBlobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.remoteexecution.v1test.UpdateBlobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The digest of the blob. This MUST be the digest of `data`.
   * </pre>
   *
   * <code>.google.devtools.remoteexecution.v1test.Digest content_digest = 1;</code>
   * @return Whether the contentDigest field is set.
   */
  boolean hasContentDigest();
  /**
   * <pre>
   * The digest of the blob. This MUST be the digest of `data`.
   * </pre>
   *
   * <code>.google.devtools.remoteexecution.v1test.Digest content_digest = 1;</code>
   * @return The contentDigest.
   */
  com.google.devtools.remoteexecution.v1test.Digest getContentDigest();
  /**
   * <pre>
   * The digest of the blob. This MUST be the digest of `data`.
   * </pre>
   *
   * <code>.google.devtools.remoteexecution.v1test.Digest content_digest = 1;</code>
   */
  com.google.devtools.remoteexecution.v1test.DigestOrBuilder getContentDigestOrBuilder();

  /**
   * <pre>
   * The raw binary data.
   * </pre>
   *
   * <code>bytes data = 2;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
