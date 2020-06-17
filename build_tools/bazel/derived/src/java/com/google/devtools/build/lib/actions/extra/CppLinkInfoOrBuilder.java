// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/protobuf/extra_actions_base.proto

package com.google.devtools.build.lib.actions.extra;

public interface CppLinkInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:blaze.CppLinkInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string input_file = 1;</code>
   * @return A list containing the inputFile.
   */
  java.util.List<java.lang.String>
      getInputFileList();
  /**
   * <code>repeated string input_file = 1;</code>
   * @return The count of inputFile.
   */
  int getInputFileCount();
  /**
   * <code>repeated string input_file = 1;</code>
   * @param index The index of the element to return.
   * @return The inputFile at the given index.
   */
  java.lang.String getInputFile(int index);
  /**
   * <code>repeated string input_file = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the inputFile at the given index.
   */
  com.google.protobuf.ByteString
      getInputFileBytes(int index);

  /**
   * <code>optional string output_file = 2;</code>
   * @return Whether the outputFile field is set.
   */
  boolean hasOutputFile();
  /**
   * <code>optional string output_file = 2;</code>
   * @return The outputFile.
   */
  java.lang.String getOutputFile();
  /**
   * <code>optional string output_file = 2;</code>
   * @return The bytes for outputFile.
   */
  com.google.protobuf.ByteString
      getOutputFileBytes();

  /**
   * <code>optional string interface_output_file = 3;</code>
   * @return Whether the interfaceOutputFile field is set.
   */
  boolean hasInterfaceOutputFile();
  /**
   * <code>optional string interface_output_file = 3;</code>
   * @return The interfaceOutputFile.
   */
  java.lang.String getInterfaceOutputFile();
  /**
   * <code>optional string interface_output_file = 3;</code>
   * @return The bytes for interfaceOutputFile.
   */
  com.google.protobuf.ByteString
      getInterfaceOutputFileBytes();

  /**
   * <code>optional string link_target_type = 4;</code>
   * @return Whether the linkTargetType field is set.
   */
  boolean hasLinkTargetType();
  /**
   * <code>optional string link_target_type = 4;</code>
   * @return The linkTargetType.
   */
  java.lang.String getLinkTargetType();
  /**
   * <code>optional string link_target_type = 4;</code>
   * @return The bytes for linkTargetType.
   */
  com.google.protobuf.ByteString
      getLinkTargetTypeBytes();

  /**
   * <code>optional string link_staticness = 5;</code>
   * @return Whether the linkStaticness field is set.
   */
  boolean hasLinkStaticness();
  /**
   * <code>optional string link_staticness = 5;</code>
   * @return The linkStaticness.
   */
  java.lang.String getLinkStaticness();
  /**
   * <code>optional string link_staticness = 5;</code>
   * @return The bytes for linkStaticness.
   */
  com.google.protobuf.ByteString
      getLinkStaticnessBytes();

  /**
   * <code>repeated string link_stamp = 6;</code>
   * @return A list containing the linkStamp.
   */
  java.util.List<java.lang.String>
      getLinkStampList();
  /**
   * <code>repeated string link_stamp = 6;</code>
   * @return The count of linkStamp.
   */
  int getLinkStampCount();
  /**
   * <code>repeated string link_stamp = 6;</code>
   * @param index The index of the element to return.
   * @return The linkStamp at the given index.
   */
  java.lang.String getLinkStamp(int index);
  /**
   * <code>repeated string link_stamp = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the linkStamp at the given index.
   */
  com.google.protobuf.ByteString
      getLinkStampBytes(int index);

  /**
   * <code>repeated string build_info_header_artifact = 7;</code>
   * @return A list containing the buildInfoHeaderArtifact.
   */
  java.util.List<java.lang.String>
      getBuildInfoHeaderArtifactList();
  /**
   * <code>repeated string build_info_header_artifact = 7;</code>
   * @return The count of buildInfoHeaderArtifact.
   */
  int getBuildInfoHeaderArtifactCount();
  /**
   * <code>repeated string build_info_header_artifact = 7;</code>
   * @param index The index of the element to return.
   * @return The buildInfoHeaderArtifact at the given index.
   */
  java.lang.String getBuildInfoHeaderArtifact(int index);
  /**
   * <code>repeated string build_info_header_artifact = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the buildInfoHeaderArtifact at the given index.
   */
  com.google.protobuf.ByteString
      getBuildInfoHeaderArtifactBytes(int index);

  /**
   * <pre>
   * The list of command line options used for running the linking tool.
   * </pre>
   *
   * <code>repeated string link_opt = 8;</code>
   * @return A list containing the linkOpt.
   */
  java.util.List<java.lang.String>
      getLinkOptList();
  /**
   * <pre>
   * The list of command line options used for running the linking tool.
   * </pre>
   *
   * <code>repeated string link_opt = 8;</code>
   * @return The count of linkOpt.
   */
  int getLinkOptCount();
  /**
   * <pre>
   * The list of command line options used for running the linking tool.
   * </pre>
   *
   * <code>repeated string link_opt = 8;</code>
   * @param index The index of the element to return.
   * @return The linkOpt at the given index.
   */
  java.lang.String getLinkOpt(int index);
  /**
   * <pre>
   * The list of command line options used for running the linking tool.
   * </pre>
   *
   * <code>repeated string link_opt = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the linkOpt at the given index.
   */
  com.google.protobuf.ByteString
      getLinkOptBytes(int index);
}
