// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/remoteexecution/v1test/remote_execution.proto

package com.google.devtools.remoteexecution.v1test;

public interface FindMissingBlobsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.remoteexecution.v1test.FindMissingBlobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The instance of the execution system to operate against. A server may
   * support multiple instances of the execution system (with their own workers,
   * storage, caches, etc.). The server MAY require use of this field to select
   * between them in an implementation-defined fashion, otherwise it can be
   * omitted.
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   * @return The instanceName.
   */
  java.lang.String getInstanceName();
  /**
   * <pre>
   * The instance of the execution system to operate against. A server may
   * support multiple instances of the execution system (with their own workers,
   * storage, caches, etc.). The server MAY require use of this field to select
   * between them in an implementation-defined fashion, otherwise it can be
   * omitted.
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   * @return The bytes for instanceName.
   */
  com.google.protobuf.ByteString
      getInstanceNameBytes();

  /**
   * <pre>
   * A list of the blobs to check.
   * </pre>
   *
   * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
   */
  java.util.List<com.google.devtools.remoteexecution.v1test.Digest> 
      getBlobDigestsList();
  /**
   * <pre>
   * A list of the blobs to check.
   * </pre>
   *
   * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
   */
  com.google.devtools.remoteexecution.v1test.Digest getBlobDigests(int index);
  /**
   * <pre>
   * A list of the blobs to check.
   * </pre>
   *
   * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
   */
  int getBlobDigestsCount();
  /**
   * <pre>
   * A list of the blobs to check.
   * </pre>
   *
   * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
   */
  java.util.List<? extends com.google.devtools.remoteexecution.v1test.DigestOrBuilder> 
      getBlobDigestsOrBuilderList();
  /**
   * <pre>
   * A list of the blobs to check.
   * </pre>
   *
   * <code>repeated .google.devtools.remoteexecution.v1test.Digest blob_digests = 2;</code>
   */
  com.google.devtools.remoteexecution.v1test.DigestOrBuilder getBlobDigestsOrBuilder(
      int index);
}
