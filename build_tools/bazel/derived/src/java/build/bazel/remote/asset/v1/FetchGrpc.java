package build.bazel.remote.asset.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The Fetch service resolves or fetches assets referenced by URI and
 * Qualifiers, returning a Digest for the content in
 * [ContentAddressableStorage][build.bazel.remote.execution.v2.ContentAddressableStorage].
 * As with other services in the Remote Execution API, any call may return an
 * error with a [RetryInfo][google.rpc.RetryInfo] error detail providing
 * information about when the client should retry the request; clients SHOULD
 * respect the information provided.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: build/bazel/remote/asset/v1/remote_asset.proto")
public final class FetchGrpc {

  private FetchGrpc() {}

  public static final String SERVICE_NAME = "build.bazel.remote.asset.v1.Fetch";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFetchBlobMethod()} instead. 
  public static final io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.FetchBlobRequest,
      build.bazel.remote.asset.v1.FetchBlobResponse> METHOD_FETCH_BLOB = getFetchBlobMethodHelper();

  private static volatile io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.FetchBlobRequest,
      build.bazel.remote.asset.v1.FetchBlobResponse> getFetchBlobMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.FetchBlobRequest,
      build.bazel.remote.asset.v1.FetchBlobResponse> getFetchBlobMethod() {
    return getFetchBlobMethodHelper();
  }

  private static io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.FetchBlobRequest,
      build.bazel.remote.asset.v1.FetchBlobResponse> getFetchBlobMethodHelper() {
    io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.FetchBlobRequest, build.bazel.remote.asset.v1.FetchBlobResponse> getFetchBlobMethod;
    if ((getFetchBlobMethod = FetchGrpc.getFetchBlobMethod) == null) {
      synchronized (FetchGrpc.class) {
        if ((getFetchBlobMethod = FetchGrpc.getFetchBlobMethod) == null) {
          FetchGrpc.getFetchBlobMethod = getFetchBlobMethod = 
              io.grpc.MethodDescriptor.<build.bazel.remote.asset.v1.FetchBlobRequest, build.bazel.remote.asset.v1.FetchBlobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "build.bazel.remote.asset.v1.Fetch", "FetchBlob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  build.bazel.remote.asset.v1.FetchBlobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  build.bazel.remote.asset.v1.FetchBlobResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FetchMethodDescriptorSupplier("FetchBlob"))
                  .build();
          }
        }
     }
     return getFetchBlobMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getFetchDirectoryMethod()} instead. 
  public static final io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.FetchDirectoryRequest,
      build.bazel.remote.asset.v1.FetchDirectoryResponse> METHOD_FETCH_DIRECTORY = getFetchDirectoryMethodHelper();

  private static volatile io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.FetchDirectoryRequest,
      build.bazel.remote.asset.v1.FetchDirectoryResponse> getFetchDirectoryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.FetchDirectoryRequest,
      build.bazel.remote.asset.v1.FetchDirectoryResponse> getFetchDirectoryMethod() {
    return getFetchDirectoryMethodHelper();
  }

  private static io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.FetchDirectoryRequest,
      build.bazel.remote.asset.v1.FetchDirectoryResponse> getFetchDirectoryMethodHelper() {
    io.grpc.MethodDescriptor<build.bazel.remote.asset.v1.FetchDirectoryRequest, build.bazel.remote.asset.v1.FetchDirectoryResponse> getFetchDirectoryMethod;
    if ((getFetchDirectoryMethod = FetchGrpc.getFetchDirectoryMethod) == null) {
      synchronized (FetchGrpc.class) {
        if ((getFetchDirectoryMethod = FetchGrpc.getFetchDirectoryMethod) == null) {
          FetchGrpc.getFetchDirectoryMethod = getFetchDirectoryMethod = 
              io.grpc.MethodDescriptor.<build.bazel.remote.asset.v1.FetchDirectoryRequest, build.bazel.remote.asset.v1.FetchDirectoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "build.bazel.remote.asset.v1.Fetch", "FetchDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  build.bazel.remote.asset.v1.FetchDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  build.bazel.remote.asset.v1.FetchDirectoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FetchMethodDescriptorSupplier("FetchDirectory"))
                  .build();
          }
        }
     }
     return getFetchDirectoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FetchStub newStub(io.grpc.Channel channel) {
    return new FetchStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FetchBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FetchBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FetchFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FetchFutureStub(channel);
  }

  /**
   * <pre>
   * The Fetch service resolves or fetches assets referenced by URI and
   * Qualifiers, returning a Digest for the content in
   * [ContentAddressableStorage][build.bazel.remote.execution.v2.ContentAddressableStorage].
   * As with other services in the Remote Execution API, any call may return an
   * error with a [RetryInfo][google.rpc.RetryInfo] error detail providing
   * information about when the client should retry the request; clients SHOULD
   * respect the information provided.
   * </pre>
   */
  public static abstract class FetchImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Resolve or fetch referenced assets, making them available to the caller and
     * other consumers in the [ContentAddressableStorage][build.bazel.remote.execution.v2.ContentAddressableStorage].
     * Servers *MAY* fetch content that they do not already have cached, for any
     * URLs they support.
     * Servers *SHOULD* ensure that referenced files are present in the CAS at the
     * time of the response, and (if supported) that they will remain available
     * for a reasonable period of time. The TTLs of the referenced blobs *SHOULD*
     * be increased if necessary and applicable.
     * In the event that a client receives a reference to content that is no
     * longer present, it *MAY* re-issue the request with
     * `oldest_content_accepted` set to a more recent timestamp than the original
     * attempt, to induce a re-fetch from origin.
     * Servers *MAY* cache fetched content and reuse it for subsequent requests,
     * subject to `oldest_content_accepted`.
     * Servers *MAY* support the complementary [Push][build.bazel.remote.asset.v1.Push]
     * API and allow content to be directly inserted for use in future fetch
     * responses.
     * Servers *MUST* ensure Fetch'd content matches all the specified
     * qualifiers except in the case of previously Push'd resources, for which
     * the server *MAY* trust the pushing client to have set the qualifiers
     * correctly, without validation.
     * Servers not implementing the complementary [Push][build.bazel.remote.asset.v1.Push]
     * API *MUST* reject requests containing qualifiers it does not support.
     * Servers **MAY** transform assets as part of the fetch. For example a
     * tarball fetched by [FetchDirectory][build.bazel.remote.asset.v1.Fetch.FetchDirectory]
     * might be unpacked, or a Git repository
     * fetched by [FetchBlob][build.bazel.remote.asset.v1.Fetch.FetchBlob]
     * might be passed through `git-archive`.
     * Errors handling the requested assets will be returned as gRPC Status errors
     * here; errors outside the server's control will be returned inline in the
     * `status` field of the response (see comment there for details).
     * The possible RPC errors include:
     * * `INVALID_ARGUMENT`: One or more arguments were invalid, such as a
     *   qualifier that is not supported by the server.
     * * `RESOURCE_EXHAUSTED`: There is insufficient quota of some resource to
     *   perform the requested operation. The client may retry after a delay.
     * * `UNAVAILABLE`: Due to a transient condition the operation could not be
     *   completed. The client should retry.
     * * `INTERNAL`: An internal error occurred while performing the operation.
     *   The client should retry.
     * * `DEADLINE_EXCEEDED`: The fetch could not be completed within the given
     *   RPC deadline. The client should retry for at least as long as the value
     *   provided in `timeout` field of the request.
     * In the case of unsupported qualifiers, the server *SHOULD* additionally
     * send a [BadRequest][google.rpc.BadRequest] error detail where, for each
     * unsupported qualifier, there is a `FieldViolation` with a `field` of
     * `qualifiers.name` and a `description` of `"{qualifier}" not supported`
     * indicating the name of the unsupported qualifier.
     * </pre>
     */
    public void fetchBlob(build.bazel.remote.asset.v1.FetchBlobRequest request,
        io.grpc.stub.StreamObserver<build.bazel.remote.asset.v1.FetchBlobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchBlobMethodHelper(), responseObserver);
    }

    /**
     */
    public void fetchDirectory(build.bazel.remote.asset.v1.FetchDirectoryRequest request,
        io.grpc.stub.StreamObserver<build.bazel.remote.asset.v1.FetchDirectoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchDirectoryMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFetchBlobMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                build.bazel.remote.asset.v1.FetchBlobRequest,
                build.bazel.remote.asset.v1.FetchBlobResponse>(
                  this, METHODID_FETCH_BLOB)))
          .addMethod(
            getFetchDirectoryMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                build.bazel.remote.asset.v1.FetchDirectoryRequest,
                build.bazel.remote.asset.v1.FetchDirectoryResponse>(
                  this, METHODID_FETCH_DIRECTORY)))
          .build();
    }
  }

  /**
   * <pre>
   * The Fetch service resolves or fetches assets referenced by URI and
   * Qualifiers, returning a Digest for the content in
   * [ContentAddressableStorage][build.bazel.remote.execution.v2.ContentAddressableStorage].
   * As with other services in the Remote Execution API, any call may return an
   * error with a [RetryInfo][google.rpc.RetryInfo] error detail providing
   * information about when the client should retry the request; clients SHOULD
   * respect the information provided.
   * </pre>
   */
  public static final class FetchStub extends io.grpc.stub.AbstractStub<FetchStub> {
    private FetchStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FetchStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FetchStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FetchStub(channel, callOptions);
    }

    /**
     * <pre>
     * Resolve or fetch referenced assets, making them available to the caller and
     * other consumers in the [ContentAddressableStorage][build.bazel.remote.execution.v2.ContentAddressableStorage].
     * Servers *MAY* fetch content that they do not already have cached, for any
     * URLs they support.
     * Servers *SHOULD* ensure that referenced files are present in the CAS at the
     * time of the response, and (if supported) that they will remain available
     * for a reasonable period of time. The TTLs of the referenced blobs *SHOULD*
     * be increased if necessary and applicable.
     * In the event that a client receives a reference to content that is no
     * longer present, it *MAY* re-issue the request with
     * `oldest_content_accepted` set to a more recent timestamp than the original
     * attempt, to induce a re-fetch from origin.
     * Servers *MAY* cache fetched content and reuse it for subsequent requests,
     * subject to `oldest_content_accepted`.
     * Servers *MAY* support the complementary [Push][build.bazel.remote.asset.v1.Push]
     * API and allow content to be directly inserted for use in future fetch
     * responses.
     * Servers *MUST* ensure Fetch'd content matches all the specified
     * qualifiers except in the case of previously Push'd resources, for which
     * the server *MAY* trust the pushing client to have set the qualifiers
     * correctly, without validation.
     * Servers not implementing the complementary [Push][build.bazel.remote.asset.v1.Push]
     * API *MUST* reject requests containing qualifiers it does not support.
     * Servers **MAY** transform assets as part of the fetch. For example a
     * tarball fetched by [FetchDirectory][build.bazel.remote.asset.v1.Fetch.FetchDirectory]
     * might be unpacked, or a Git repository
     * fetched by [FetchBlob][build.bazel.remote.asset.v1.Fetch.FetchBlob]
     * might be passed through `git-archive`.
     * Errors handling the requested assets will be returned as gRPC Status errors
     * here; errors outside the server's control will be returned inline in the
     * `status` field of the response (see comment there for details).
     * The possible RPC errors include:
     * * `INVALID_ARGUMENT`: One or more arguments were invalid, such as a
     *   qualifier that is not supported by the server.
     * * `RESOURCE_EXHAUSTED`: There is insufficient quota of some resource to
     *   perform the requested operation. The client may retry after a delay.
     * * `UNAVAILABLE`: Due to a transient condition the operation could not be
     *   completed. The client should retry.
     * * `INTERNAL`: An internal error occurred while performing the operation.
     *   The client should retry.
     * * `DEADLINE_EXCEEDED`: The fetch could not be completed within the given
     *   RPC deadline. The client should retry for at least as long as the value
     *   provided in `timeout` field of the request.
     * In the case of unsupported qualifiers, the server *SHOULD* additionally
     * send a [BadRequest][google.rpc.BadRequest] error detail where, for each
     * unsupported qualifier, there is a `FieldViolation` with a `field` of
     * `qualifiers.name` and a `description` of `"{qualifier}" not supported`
     * indicating the name of the unsupported qualifier.
     * </pre>
     */
    public void fetchBlob(build.bazel.remote.asset.v1.FetchBlobRequest request,
        io.grpc.stub.StreamObserver<build.bazel.remote.asset.v1.FetchBlobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchBlobMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchDirectory(build.bazel.remote.asset.v1.FetchDirectoryRequest request,
        io.grpc.stub.StreamObserver<build.bazel.remote.asset.v1.FetchDirectoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchDirectoryMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Fetch service resolves or fetches assets referenced by URI and
   * Qualifiers, returning a Digest for the content in
   * [ContentAddressableStorage][build.bazel.remote.execution.v2.ContentAddressableStorage].
   * As with other services in the Remote Execution API, any call may return an
   * error with a [RetryInfo][google.rpc.RetryInfo] error detail providing
   * information about when the client should retry the request; clients SHOULD
   * respect the information provided.
   * </pre>
   */
  public static final class FetchBlockingStub extends io.grpc.stub.AbstractStub<FetchBlockingStub> {
    private FetchBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FetchBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FetchBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FetchBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Resolve or fetch referenced assets, making them available to the caller and
     * other consumers in the [ContentAddressableStorage][build.bazel.remote.execution.v2.ContentAddressableStorage].
     * Servers *MAY* fetch content that they do not already have cached, for any
     * URLs they support.
     * Servers *SHOULD* ensure that referenced files are present in the CAS at the
     * time of the response, and (if supported) that they will remain available
     * for a reasonable period of time. The TTLs of the referenced blobs *SHOULD*
     * be increased if necessary and applicable.
     * In the event that a client receives a reference to content that is no
     * longer present, it *MAY* re-issue the request with
     * `oldest_content_accepted` set to a more recent timestamp than the original
     * attempt, to induce a re-fetch from origin.
     * Servers *MAY* cache fetched content and reuse it for subsequent requests,
     * subject to `oldest_content_accepted`.
     * Servers *MAY* support the complementary [Push][build.bazel.remote.asset.v1.Push]
     * API and allow content to be directly inserted for use in future fetch
     * responses.
     * Servers *MUST* ensure Fetch'd content matches all the specified
     * qualifiers except in the case of previously Push'd resources, for which
     * the server *MAY* trust the pushing client to have set the qualifiers
     * correctly, without validation.
     * Servers not implementing the complementary [Push][build.bazel.remote.asset.v1.Push]
     * API *MUST* reject requests containing qualifiers it does not support.
     * Servers **MAY** transform assets as part of the fetch. For example a
     * tarball fetched by [FetchDirectory][build.bazel.remote.asset.v1.Fetch.FetchDirectory]
     * might be unpacked, or a Git repository
     * fetched by [FetchBlob][build.bazel.remote.asset.v1.Fetch.FetchBlob]
     * might be passed through `git-archive`.
     * Errors handling the requested assets will be returned as gRPC Status errors
     * here; errors outside the server's control will be returned inline in the
     * `status` field of the response (see comment there for details).
     * The possible RPC errors include:
     * * `INVALID_ARGUMENT`: One or more arguments were invalid, such as a
     *   qualifier that is not supported by the server.
     * * `RESOURCE_EXHAUSTED`: There is insufficient quota of some resource to
     *   perform the requested operation. The client may retry after a delay.
     * * `UNAVAILABLE`: Due to a transient condition the operation could not be
     *   completed. The client should retry.
     * * `INTERNAL`: An internal error occurred while performing the operation.
     *   The client should retry.
     * * `DEADLINE_EXCEEDED`: The fetch could not be completed within the given
     *   RPC deadline. The client should retry for at least as long as the value
     *   provided in `timeout` field of the request.
     * In the case of unsupported qualifiers, the server *SHOULD* additionally
     * send a [BadRequest][google.rpc.BadRequest] error detail where, for each
     * unsupported qualifier, there is a `FieldViolation` with a `field` of
     * `qualifiers.name` and a `description` of `"{qualifier}" not supported`
     * indicating the name of the unsupported qualifier.
     * </pre>
     */
    public build.bazel.remote.asset.v1.FetchBlobResponse fetchBlob(build.bazel.remote.asset.v1.FetchBlobRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchBlobMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public build.bazel.remote.asset.v1.FetchDirectoryResponse fetchDirectory(build.bazel.remote.asset.v1.FetchDirectoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchDirectoryMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Fetch service resolves or fetches assets referenced by URI and
   * Qualifiers, returning a Digest for the content in
   * [ContentAddressableStorage][build.bazel.remote.execution.v2.ContentAddressableStorage].
   * As with other services in the Remote Execution API, any call may return an
   * error with a [RetryInfo][google.rpc.RetryInfo] error detail providing
   * information about when the client should retry the request; clients SHOULD
   * respect the information provided.
   * </pre>
   */
  public static final class FetchFutureStub extends io.grpc.stub.AbstractStub<FetchFutureStub> {
    private FetchFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FetchFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FetchFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FetchFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Resolve or fetch referenced assets, making them available to the caller and
     * other consumers in the [ContentAddressableStorage][build.bazel.remote.execution.v2.ContentAddressableStorage].
     * Servers *MAY* fetch content that they do not already have cached, for any
     * URLs they support.
     * Servers *SHOULD* ensure that referenced files are present in the CAS at the
     * time of the response, and (if supported) that they will remain available
     * for a reasonable period of time. The TTLs of the referenced blobs *SHOULD*
     * be increased if necessary and applicable.
     * In the event that a client receives a reference to content that is no
     * longer present, it *MAY* re-issue the request with
     * `oldest_content_accepted` set to a more recent timestamp than the original
     * attempt, to induce a re-fetch from origin.
     * Servers *MAY* cache fetched content and reuse it for subsequent requests,
     * subject to `oldest_content_accepted`.
     * Servers *MAY* support the complementary [Push][build.bazel.remote.asset.v1.Push]
     * API and allow content to be directly inserted for use in future fetch
     * responses.
     * Servers *MUST* ensure Fetch'd content matches all the specified
     * qualifiers except in the case of previously Push'd resources, for which
     * the server *MAY* trust the pushing client to have set the qualifiers
     * correctly, without validation.
     * Servers not implementing the complementary [Push][build.bazel.remote.asset.v1.Push]
     * API *MUST* reject requests containing qualifiers it does not support.
     * Servers **MAY** transform assets as part of the fetch. For example a
     * tarball fetched by [FetchDirectory][build.bazel.remote.asset.v1.Fetch.FetchDirectory]
     * might be unpacked, or a Git repository
     * fetched by [FetchBlob][build.bazel.remote.asset.v1.Fetch.FetchBlob]
     * might be passed through `git-archive`.
     * Errors handling the requested assets will be returned as gRPC Status errors
     * here; errors outside the server's control will be returned inline in the
     * `status` field of the response (see comment there for details).
     * The possible RPC errors include:
     * * `INVALID_ARGUMENT`: One or more arguments were invalid, such as a
     *   qualifier that is not supported by the server.
     * * `RESOURCE_EXHAUSTED`: There is insufficient quota of some resource to
     *   perform the requested operation. The client may retry after a delay.
     * * `UNAVAILABLE`: Due to a transient condition the operation could not be
     *   completed. The client should retry.
     * * `INTERNAL`: An internal error occurred while performing the operation.
     *   The client should retry.
     * * `DEADLINE_EXCEEDED`: The fetch could not be completed within the given
     *   RPC deadline. The client should retry for at least as long as the value
     *   provided in `timeout` field of the request.
     * In the case of unsupported qualifiers, the server *SHOULD* additionally
     * send a [BadRequest][google.rpc.BadRequest] error detail where, for each
     * unsupported qualifier, there is a `FieldViolation` with a `field` of
     * `qualifiers.name` and a `description` of `"{qualifier}" not supported`
     * indicating the name of the unsupported qualifier.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<build.bazel.remote.asset.v1.FetchBlobResponse> fetchBlob(
        build.bazel.remote.asset.v1.FetchBlobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchBlobMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<build.bazel.remote.asset.v1.FetchDirectoryResponse> fetchDirectory(
        build.bazel.remote.asset.v1.FetchDirectoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchDirectoryMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_BLOB = 0;
  private static final int METHODID_FETCH_DIRECTORY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FetchImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FetchImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FETCH_BLOB:
          serviceImpl.fetchBlob((build.bazel.remote.asset.v1.FetchBlobRequest) request,
              (io.grpc.stub.StreamObserver<build.bazel.remote.asset.v1.FetchBlobResponse>) responseObserver);
          break;
        case METHODID_FETCH_DIRECTORY:
          serviceImpl.fetchDirectory((build.bazel.remote.asset.v1.FetchDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<build.bazel.remote.asset.v1.FetchDirectoryResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FetchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FetchBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return build.bazel.remote.asset.v1.RemoteAssetProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Fetch");
    }
  }

  private static final class FetchFileDescriptorSupplier
      extends FetchBaseDescriptorSupplier {
    FetchFileDescriptorSupplier() {}
  }

  private static final class FetchMethodDescriptorSupplier
      extends FetchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FetchMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FetchGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FetchFileDescriptorSupplier())
              .addMethod(getFetchBlobMethodHelper())
              .addMethod(getFetchDirectoryMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
