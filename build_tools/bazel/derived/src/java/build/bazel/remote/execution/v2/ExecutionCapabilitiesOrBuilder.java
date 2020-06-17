// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/execution/v2/remote_execution.proto

package build.bazel.remote.execution.v2;

public interface ExecutionCapabilitiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:build.bazel.remote.execution.v2.ExecutionCapabilities)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Remote execution may only support a single digest function.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.DigestFunction.Value digest_function = 1;</code>
   * @return The enum numeric value on the wire for digestFunction.
   */
  int getDigestFunctionValue();
  /**
   * <pre>
   * Remote execution may only support a single digest function.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.DigestFunction.Value digest_function = 1;</code>
   * @return The digestFunction.
   */
  build.bazel.remote.execution.v2.DigestFunction.Value getDigestFunction();

  /**
   * <pre>
   * Whether remote execution is enabled for the particular server/instance.
   * </pre>
   *
   * <code>bool exec_enabled = 2;</code>
   * @return The execEnabled.
   */
  boolean getExecEnabled();

  /**
   * <pre>
   * Supported execution priority range.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.PriorityCapabilities execution_priority_capabilities = 3;</code>
   * @return Whether the executionPriorityCapabilities field is set.
   */
  boolean hasExecutionPriorityCapabilities();
  /**
   * <pre>
   * Supported execution priority range.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.PriorityCapabilities execution_priority_capabilities = 3;</code>
   * @return The executionPriorityCapabilities.
   */
  build.bazel.remote.execution.v2.PriorityCapabilities getExecutionPriorityCapabilities();
  /**
   * <pre>
   * Supported execution priority range.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.PriorityCapabilities execution_priority_capabilities = 3;</code>
   */
  build.bazel.remote.execution.v2.PriorityCapabilitiesOrBuilder getExecutionPriorityCapabilitiesOrBuilder();

  /**
   * <pre>
   * Supported node properties.
   * </pre>
   *
   * <code>repeated string supported_node_properties = 4;</code>
   * @return A list containing the supportedNodeProperties.
   */
  java.util.List<java.lang.String>
      getSupportedNodePropertiesList();
  /**
   * <pre>
   * Supported node properties.
   * </pre>
   *
   * <code>repeated string supported_node_properties = 4;</code>
   * @return The count of supportedNodeProperties.
   */
  int getSupportedNodePropertiesCount();
  /**
   * <pre>
   * Supported node properties.
   * </pre>
   *
   * <code>repeated string supported_node_properties = 4;</code>
   * @param index The index of the element to return.
   * @return The supportedNodeProperties at the given index.
   */
  java.lang.String getSupportedNodeProperties(int index);
  /**
   * <pre>
   * Supported node properties.
   * </pre>
   *
   * <code>repeated string supported_node_properties = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the supportedNodeProperties at the given index.
   */
  com.google.protobuf.ByteString
      getSupportedNodePropertiesBytes(int index);
}