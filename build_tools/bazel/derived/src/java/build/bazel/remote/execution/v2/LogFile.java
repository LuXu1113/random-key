// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/execution/v2/remote_execution.proto

package build.bazel.remote.execution.v2;

/**
 * <pre>
 * A `LogFile` is a log stored in the CAS.
 * </pre>
 *
 * Protobuf type {@code build.bazel.remote.execution.v2.LogFile}
 */
public  final class LogFile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:build.bazel.remote.execution.v2.LogFile)
    LogFileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogFile.newBuilder() to construct.
  private LogFile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogFile() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LogFile();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LogFile(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            build.bazel.remote.execution.v2.Digest.Builder subBuilder = null;
            if (digest_ != null) {
              subBuilder = digest_.toBuilder();
            }
            digest_ = input.readMessage(build.bazel.remote.execution.v2.Digest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(digest_);
              digest_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            humanReadable_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_LogFile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_LogFile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.bazel.remote.execution.v2.LogFile.class, build.bazel.remote.execution.v2.LogFile.Builder.class);
  }

  public static final int DIGEST_FIELD_NUMBER = 1;
  private build.bazel.remote.execution.v2.Digest digest_;
  /**
   * <pre>
   * The digest of the log contents.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
   * @return Whether the digest field is set.
   */
  public boolean hasDigest() {
    return digest_ != null;
  }
  /**
   * <pre>
   * The digest of the log contents.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
   * @return The digest.
   */
  public build.bazel.remote.execution.v2.Digest getDigest() {
    return digest_ == null ? build.bazel.remote.execution.v2.Digest.getDefaultInstance() : digest_;
  }
  /**
   * <pre>
   * The digest of the log contents.
   * </pre>
   *
   * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
   */
  public build.bazel.remote.execution.v2.DigestOrBuilder getDigestOrBuilder() {
    return getDigest();
  }

  public static final int HUMAN_READABLE_FIELD_NUMBER = 2;
  private boolean humanReadable_;
  /**
   * <pre>
   * This is a hint as to the purpose of the log, and is set to true if the log
   * is human-readable text that can be usefully displayed to a user, and false
   * otherwise. For instance, if a command-line client wishes to print the
   * server logs to the terminal for a failed action, this allows it to avoid
   * displaying a binary file.
   * </pre>
   *
   * <code>bool human_readable = 2;</code>
   * @return The humanReadable.
   */
  public boolean getHumanReadable() {
    return humanReadable_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (digest_ != null) {
      output.writeMessage(1, getDigest());
    }
    if (humanReadable_ != false) {
      output.writeBool(2, humanReadable_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (digest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDigest());
    }
    if (humanReadable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, humanReadable_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof build.bazel.remote.execution.v2.LogFile)) {
      return super.equals(obj);
    }
    build.bazel.remote.execution.v2.LogFile other = (build.bazel.remote.execution.v2.LogFile) obj;

    if (hasDigest() != other.hasDigest()) return false;
    if (hasDigest()) {
      if (!getDigest()
          .equals(other.getDigest())) return false;
    }
    if (getHumanReadable()
        != other.getHumanReadable()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasDigest()) {
      hash = (37 * hash) + DIGEST_FIELD_NUMBER;
      hash = (53 * hash) + getDigest().hashCode();
    }
    hash = (37 * hash) + HUMAN_READABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHumanReadable());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.bazel.remote.execution.v2.LogFile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.LogFile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.LogFile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.LogFile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.LogFile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.LogFile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.LogFile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.LogFile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.LogFile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.LogFile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.LogFile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.LogFile parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(build.bazel.remote.execution.v2.LogFile prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A `LogFile` is a log stored in the CAS.
   * </pre>
   *
   * Protobuf type {@code build.bazel.remote.execution.v2.LogFile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:build.bazel.remote.execution.v2.LogFile)
      build.bazel.remote.execution.v2.LogFileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_LogFile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_LogFile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.bazel.remote.execution.v2.LogFile.class, build.bazel.remote.execution.v2.LogFile.Builder.class);
    }

    // Construct using build.bazel.remote.execution.v2.LogFile.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (digestBuilder_ == null) {
        digest_ = null;
      } else {
        digest_ = null;
        digestBuilder_ = null;
      }
      humanReadable_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_LogFile_descriptor;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.LogFile getDefaultInstanceForType() {
      return build.bazel.remote.execution.v2.LogFile.getDefaultInstance();
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.LogFile build() {
      build.bazel.remote.execution.v2.LogFile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.LogFile buildPartial() {
      build.bazel.remote.execution.v2.LogFile result = new build.bazel.remote.execution.v2.LogFile(this);
      if (digestBuilder_ == null) {
        result.digest_ = digest_;
      } else {
        result.digest_ = digestBuilder_.build();
      }
      result.humanReadable_ = humanReadable_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.bazel.remote.execution.v2.LogFile) {
        return mergeFrom((build.bazel.remote.execution.v2.LogFile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.bazel.remote.execution.v2.LogFile other) {
      if (other == build.bazel.remote.execution.v2.LogFile.getDefaultInstance()) return this;
      if (other.hasDigest()) {
        mergeDigest(other.getDigest());
      }
      if (other.getHumanReadable() != false) {
        setHumanReadable(other.getHumanReadable());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      build.bazel.remote.execution.v2.LogFile parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (build.bazel.remote.execution.v2.LogFile) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private build.bazel.remote.execution.v2.Digest digest_;
    private com.google.protobuf.SingleFieldBuilderV3<
        build.bazel.remote.execution.v2.Digest, build.bazel.remote.execution.v2.Digest.Builder, build.bazel.remote.execution.v2.DigestOrBuilder> digestBuilder_;
    /**
     * <pre>
     * The digest of the log contents.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
     * @return Whether the digest field is set.
     */
    public boolean hasDigest() {
      return digestBuilder_ != null || digest_ != null;
    }
    /**
     * <pre>
     * The digest of the log contents.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
     * @return The digest.
     */
    public build.bazel.remote.execution.v2.Digest getDigest() {
      if (digestBuilder_ == null) {
        return digest_ == null ? build.bazel.remote.execution.v2.Digest.getDefaultInstance() : digest_;
      } else {
        return digestBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The digest of the log contents.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
     */
    public Builder setDigest(build.bazel.remote.execution.v2.Digest value) {
      if (digestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        digest_ = value;
        onChanged();
      } else {
        digestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the log contents.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
     */
    public Builder setDigest(
        build.bazel.remote.execution.v2.Digest.Builder builderForValue) {
      if (digestBuilder_ == null) {
        digest_ = builderForValue.build();
        onChanged();
      } else {
        digestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the log contents.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
     */
    public Builder mergeDigest(build.bazel.remote.execution.v2.Digest value) {
      if (digestBuilder_ == null) {
        if (digest_ != null) {
          digest_ =
            build.bazel.remote.execution.v2.Digest.newBuilder(digest_).mergeFrom(value).buildPartial();
        } else {
          digest_ = value;
        }
        onChanged();
      } else {
        digestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the log contents.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
     */
    public Builder clearDigest() {
      if (digestBuilder_ == null) {
        digest_ = null;
        onChanged();
      } else {
        digest_ = null;
        digestBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The digest of the log contents.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
     */
    public build.bazel.remote.execution.v2.Digest.Builder getDigestBuilder() {
      
      onChanged();
      return getDigestFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The digest of the log contents.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
     */
    public build.bazel.remote.execution.v2.DigestOrBuilder getDigestOrBuilder() {
      if (digestBuilder_ != null) {
        return digestBuilder_.getMessageOrBuilder();
      } else {
        return digest_ == null ?
            build.bazel.remote.execution.v2.Digest.getDefaultInstance() : digest_;
      }
    }
    /**
     * <pre>
     * The digest of the log contents.
     * </pre>
     *
     * <code>.build.bazel.remote.execution.v2.Digest digest = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        build.bazel.remote.execution.v2.Digest, build.bazel.remote.execution.v2.Digest.Builder, build.bazel.remote.execution.v2.DigestOrBuilder> 
        getDigestFieldBuilder() {
      if (digestBuilder_ == null) {
        digestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            build.bazel.remote.execution.v2.Digest, build.bazel.remote.execution.v2.Digest.Builder, build.bazel.remote.execution.v2.DigestOrBuilder>(
                getDigest(),
                getParentForChildren(),
                isClean());
        digest_ = null;
      }
      return digestBuilder_;
    }

    private boolean humanReadable_ ;
    /**
     * <pre>
     * This is a hint as to the purpose of the log, and is set to true if the log
     * is human-readable text that can be usefully displayed to a user, and false
     * otherwise. For instance, if a command-line client wishes to print the
     * server logs to the terminal for a failed action, this allows it to avoid
     * displaying a binary file.
     * </pre>
     *
     * <code>bool human_readable = 2;</code>
     * @return The humanReadable.
     */
    public boolean getHumanReadable() {
      return humanReadable_;
    }
    /**
     * <pre>
     * This is a hint as to the purpose of the log, and is set to true if the log
     * is human-readable text that can be usefully displayed to a user, and false
     * otherwise. For instance, if a command-line client wishes to print the
     * server logs to the terminal for a failed action, this allows it to avoid
     * displaying a binary file.
     * </pre>
     *
     * <code>bool human_readable = 2;</code>
     * @param value The humanReadable to set.
     * @return This builder for chaining.
     */
    public Builder setHumanReadable(boolean value) {
      
      humanReadable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is a hint as to the purpose of the log, and is set to true if the log
     * is human-readable text that can be usefully displayed to a user, and false
     * otherwise. For instance, if a command-line client wishes to print the
     * server logs to the terminal for a failed action, this allows it to avoid
     * displaying a binary file.
     * </pre>
     *
     * <code>bool human_readable = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHumanReadable() {
      
      humanReadable_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:build.bazel.remote.execution.v2.LogFile)
  }

  // @@protoc_insertion_point(class_scope:build.bazel.remote.execution.v2.LogFile)
  private static final build.bazel.remote.execution.v2.LogFile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.bazel.remote.execution.v2.LogFile();
  }

  public static build.bazel.remote.execution.v2.LogFile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogFile>
      PARSER = new com.google.protobuf.AbstractParser<LogFile>() {
    @java.lang.Override
    public LogFile parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LogFile(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LogFile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogFile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.bazel.remote.execution.v2.LogFile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
