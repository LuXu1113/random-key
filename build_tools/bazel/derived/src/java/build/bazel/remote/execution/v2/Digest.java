// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/execution/v2/remote_execution.proto

package build.bazel.remote.execution.v2;

/**
 * <pre>
 * A content digest. A digest for a given blob consists of the size of the blob
 * and its hash. The hash algorithm to use is defined by the server.
 * The size is considered to be an integral part of the digest and cannot be
 * separated. That is, even if the `hash` field is correctly specified but
 * `size_bytes` is not, the server MUST reject the request.
 * The reason for including the size in the digest is as follows: in a great
 * many cases, the server needs to know the size of the blob it is about to work
 * with prior to starting an operation with it, such as flattening Merkle tree
 * structures or streaming it to a worker. Technically, the server could
 * implement a separate metadata store, but this results in a significantly more
 * complicated implementation as opposed to having the client specify the size
 * up-front (or storing the size along with the digest in every message where
 * digests are embedded). This does mean that the API leaks some implementation
 * details of (what we consider to be) a reasonable server implementation, but
 * we consider this to be a worthwhile tradeoff.
 * When a `Digest` is used to refer to a proto message, it always refers to the
 * message in binary encoded form. To ensure consistent hashing, clients and
 * servers MUST ensure that they serialize messages according to the following
 * rules, even if there are alternate valid encodings for the same message:
 * * Fields are serialized in tag order.
 * * There are no unknown fields.
 * * There are no duplicate fields.
 * * Fields are serialized according to the default semantics for their type.
 * Most protocol buffer implementations will always follow these rules when
 * serializing, but care should be taken to avoid shortcuts. For instance,
 * concatenating two messages to merge them may produce duplicate fields.
 * </pre>
 *
 * Protobuf type {@code build.bazel.remote.execution.v2.Digest}
 */
public  final class Digest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:build.bazel.remote.execution.v2.Digest)
    DigestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Digest.newBuilder() to construct.
  private Digest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Digest() {
    hash_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Digest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Digest(
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
            java.lang.String s = input.readStringRequireUtf8();

            hash_ = s;
            break;
          }
          case 16: {

            sizeBytes_ = input.readInt64();
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
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_Digest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_Digest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.bazel.remote.execution.v2.Digest.class, build.bazel.remote.execution.v2.Digest.Builder.class);
  }

  public static final int HASH_FIELD_NUMBER = 1;
  private volatile java.lang.Object hash_;
  /**
   * <pre>
   * The hash. In the case of SHA-256, it will always be a lowercase hex string
   * exactly 64 characters long.
   * </pre>
   *
   * <code>string hash = 1;</code>
   * @return The hash.
   */
  public java.lang.String getHash() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hash_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The hash. In the case of SHA-256, it will always be a lowercase hex string
   * exactly 64 characters long.
   * </pre>
   *
   * <code>string hash = 1;</code>
   * @return The bytes for hash.
   */
  public com.google.protobuf.ByteString
      getHashBytes() {
    java.lang.Object ref = hash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIZE_BYTES_FIELD_NUMBER = 2;
  private long sizeBytes_;
  /**
   * <pre>
   * The size of the blob, in bytes.
   * </pre>
   *
   * <code>int64 size_bytes = 2;</code>
   * @return The sizeBytes.
   */
  public long getSizeBytes() {
    return sizeBytes_;
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
    if (!getHashBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hash_);
    }
    if (sizeBytes_ != 0L) {
      output.writeInt64(2, sizeBytes_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHashBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hash_);
    }
    if (sizeBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, sizeBytes_);
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
    if (!(obj instanceof build.bazel.remote.execution.v2.Digest)) {
      return super.equals(obj);
    }
    build.bazel.remote.execution.v2.Digest other = (build.bazel.remote.execution.v2.Digest) obj;

    if (!getHash()
        .equals(other.getHash())) return false;
    if (getSizeBytes()
        != other.getSizeBytes()) return false;
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
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    hash = (37 * hash) + SIZE_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSizeBytes());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.bazel.remote.execution.v2.Digest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.Digest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.Digest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.Digest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.Digest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.Digest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.Digest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.Digest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.Digest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.Digest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.Digest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.Digest parseFrom(
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
  public static Builder newBuilder(build.bazel.remote.execution.v2.Digest prototype) {
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
   * A content digest. A digest for a given blob consists of the size of the blob
   * and its hash. The hash algorithm to use is defined by the server.
   * The size is considered to be an integral part of the digest and cannot be
   * separated. That is, even if the `hash` field is correctly specified but
   * `size_bytes` is not, the server MUST reject the request.
   * The reason for including the size in the digest is as follows: in a great
   * many cases, the server needs to know the size of the blob it is about to work
   * with prior to starting an operation with it, such as flattening Merkle tree
   * structures or streaming it to a worker. Technically, the server could
   * implement a separate metadata store, but this results in a significantly more
   * complicated implementation as opposed to having the client specify the size
   * up-front (or storing the size along with the digest in every message where
   * digests are embedded). This does mean that the API leaks some implementation
   * details of (what we consider to be) a reasonable server implementation, but
   * we consider this to be a worthwhile tradeoff.
   * When a `Digest` is used to refer to a proto message, it always refers to the
   * message in binary encoded form. To ensure consistent hashing, clients and
   * servers MUST ensure that they serialize messages according to the following
   * rules, even if there are alternate valid encodings for the same message:
   * * Fields are serialized in tag order.
   * * There are no unknown fields.
   * * There are no duplicate fields.
   * * Fields are serialized according to the default semantics for their type.
   * Most protocol buffer implementations will always follow these rules when
   * serializing, but care should be taken to avoid shortcuts. For instance,
   * concatenating two messages to merge them may produce duplicate fields.
   * </pre>
   *
   * Protobuf type {@code build.bazel.remote.execution.v2.Digest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:build.bazel.remote.execution.v2.Digest)
      build.bazel.remote.execution.v2.DigestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_Digest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_Digest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.bazel.remote.execution.v2.Digest.class, build.bazel.remote.execution.v2.Digest.Builder.class);
    }

    // Construct using build.bazel.remote.execution.v2.Digest.newBuilder()
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
      hash_ = "";

      sizeBytes_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_Digest_descriptor;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.Digest getDefaultInstanceForType() {
      return build.bazel.remote.execution.v2.Digest.getDefaultInstance();
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.Digest build() {
      build.bazel.remote.execution.v2.Digest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.Digest buildPartial() {
      build.bazel.remote.execution.v2.Digest result = new build.bazel.remote.execution.v2.Digest(this);
      result.hash_ = hash_;
      result.sizeBytes_ = sizeBytes_;
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
      if (other instanceof build.bazel.remote.execution.v2.Digest) {
        return mergeFrom((build.bazel.remote.execution.v2.Digest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.bazel.remote.execution.v2.Digest other) {
      if (other == build.bazel.remote.execution.v2.Digest.getDefaultInstance()) return this;
      if (!other.getHash().isEmpty()) {
        hash_ = other.hash_;
        onChanged();
      }
      if (other.getSizeBytes() != 0L) {
        setSizeBytes(other.getSizeBytes());
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
      build.bazel.remote.execution.v2.Digest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (build.bazel.remote.execution.v2.Digest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object hash_ = "";
    /**
     * <pre>
     * The hash. In the case of SHA-256, it will always be a lowercase hex string
     * exactly 64 characters long.
     * </pre>
     *
     * <code>string hash = 1;</code>
     * @return The hash.
     */
    public java.lang.String getHash() {
      java.lang.Object ref = hash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The hash. In the case of SHA-256, it will always be a lowercase hex string
     * exactly 64 characters long.
     * </pre>
     *
     * <code>string hash = 1;</code>
     * @return The bytes for hash.
     */
    public com.google.protobuf.ByteString
        getHashBytes() {
      java.lang.Object ref = hash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The hash. In the case of SHA-256, it will always be a lowercase hex string
     * exactly 64 characters long.
     * </pre>
     *
     * <code>string hash = 1;</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hash_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The hash. In the case of SHA-256, it will always be a lowercase hex string
     * exactly 64 characters long.
     * </pre>
     *
     * <code>string hash = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      
      hash_ = getDefaultInstance().getHash();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The hash. In the case of SHA-256, it will always be a lowercase hex string
     * exactly 64 characters long.
     * </pre>
     *
     * <code>string hash = 1;</code>
     * @param value The bytes for hash to set.
     * @return This builder for chaining.
     */
    public Builder setHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hash_ = value;
      onChanged();
      return this;
    }

    private long sizeBytes_ ;
    /**
     * <pre>
     * The size of the blob, in bytes.
     * </pre>
     *
     * <code>int64 size_bytes = 2;</code>
     * @return The sizeBytes.
     */
    public long getSizeBytes() {
      return sizeBytes_;
    }
    /**
     * <pre>
     * The size of the blob, in bytes.
     * </pre>
     *
     * <code>int64 size_bytes = 2;</code>
     * @param value The sizeBytes to set.
     * @return This builder for chaining.
     */
    public Builder setSizeBytes(long value) {
      
      sizeBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The size of the blob, in bytes.
     * </pre>
     *
     * <code>int64 size_bytes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSizeBytes() {
      
      sizeBytes_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:build.bazel.remote.execution.v2.Digest)
  }

  // @@protoc_insertion_point(class_scope:build.bazel.remote.execution.v2.Digest)
  private static final build.bazel.remote.execution.v2.Digest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.bazel.remote.execution.v2.Digest();
  }

  public static build.bazel.remote.execution.v2.Digest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Digest>
      PARSER = new com.google.protobuf.AbstractParser<Digest>() {
    @java.lang.Override
    public Digest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Digest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Digest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Digest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.bazel.remote.execution.v2.Digest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

