// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/semver/semver.proto

package build.bazel.semver;

public final class SemverProto {
  private SemverProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_build_bazel_semver_SemVer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_build_bazel_semver_SemVer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037build/bazel/semver/semver.proto\022\022build" +
      ".bazel.semver\"I\n\006SemVer\022\r\n\005major\030\001 \001(\005\022\r" +
      "\n\005minor\030\002 \001(\005\022\r\n\005patch\030\003 \001(\005\022\022\n\nprerelea" +
      "se\030\004 \001(\tBF\n\022build.bazel.semverB\013SemverPr" +
      "otoP\001Z\006semver\242\002\003SMV\252\002\022Build.Bazel.Semver" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_build_bazel_semver_SemVer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_build_bazel_semver_SemVer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_build_bazel_semver_SemVer_descriptor,
        new java.lang.String[] { "Major", "Minor", "Patch", "Prerelease", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
