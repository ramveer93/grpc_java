package com.library.proto;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Library.proto")
public final class LibraryGrpc {

  private LibraryGrpc() {}

  public static final String SERVICE_NAME = "Library";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.library.proto.LibraryOuterClass.BookRequest,
      com.library.proto.LibraryOuterClass.BookResponse> getAddBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addBook",
      requestType = com.library.proto.LibraryOuterClass.BookRequest.class,
      responseType = com.library.proto.LibraryOuterClass.BookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.library.proto.LibraryOuterClass.BookRequest,
      com.library.proto.LibraryOuterClass.BookResponse> getAddBookMethod() {
    io.grpc.MethodDescriptor<com.library.proto.LibraryOuterClass.BookRequest, com.library.proto.LibraryOuterClass.BookResponse> getAddBookMethod;
    if ((getAddBookMethod = LibraryGrpc.getAddBookMethod) == null) {
      synchronized (LibraryGrpc.class) {
        if ((getAddBookMethod = LibraryGrpc.getAddBookMethod) == null) {
          LibraryGrpc.getAddBookMethod = getAddBookMethod = 
              io.grpc.MethodDescriptor.<com.library.proto.LibraryOuterClass.BookRequest, com.library.proto.LibraryOuterClass.BookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Library", "addBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.library.proto.LibraryOuterClass.BookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.library.proto.LibraryOuterClass.BookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LibraryMethodDescriptorSupplier("addBook"))
                  .build();
          }
        }
     }
     return getAddBookMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LibraryStub newStub(io.grpc.Channel channel) {
    return new LibraryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LibraryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LibraryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LibraryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LibraryFutureStub(channel);
  }

  /**
   */
  public static abstract class LibraryImplBase implements io.grpc.BindableService {

    /**
     */
    public void addBook(com.library.proto.LibraryOuterClass.BookRequest request,
        io.grpc.stub.StreamObserver<com.library.proto.LibraryOuterClass.BookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddBookMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.library.proto.LibraryOuterClass.BookRequest,
                com.library.proto.LibraryOuterClass.BookResponse>(
                  this, METHODID_ADD_BOOK)))
          .build();
    }
  }

  /**
   */
  public static final class LibraryStub extends io.grpc.stub.AbstractStub<LibraryStub> {
    private LibraryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LibraryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LibraryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LibraryStub(channel, callOptions);
    }

    /**
     */
    public void addBook(com.library.proto.LibraryOuterClass.BookRequest request,
        io.grpc.stub.StreamObserver<com.library.proto.LibraryOuterClass.BookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LibraryBlockingStub extends io.grpc.stub.AbstractStub<LibraryBlockingStub> {
    private LibraryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LibraryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LibraryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LibraryBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.library.proto.LibraryOuterClass.BookResponse addBook(com.library.proto.LibraryOuterClass.BookRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddBookMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LibraryFutureStub extends io.grpc.stub.AbstractStub<LibraryFutureStub> {
    private LibraryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LibraryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LibraryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LibraryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.library.proto.LibraryOuterClass.BookResponse> addBook(
        com.library.proto.LibraryOuterClass.BookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_BOOK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LibraryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LibraryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_BOOK:
          serviceImpl.addBook((com.library.proto.LibraryOuterClass.BookRequest) request,
              (io.grpc.stub.StreamObserver<com.library.proto.LibraryOuterClass.BookResponse>) responseObserver);
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

  private static abstract class LibraryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LibraryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.library.proto.LibraryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Library");
    }
  }

  private static final class LibraryFileDescriptorSupplier
      extends LibraryBaseDescriptorSupplier {
    LibraryFileDescriptorSupplier() {}
  }

  private static final class LibraryMethodDescriptorSupplier
      extends LibraryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LibraryMethodDescriptorSupplier(String methodName) {
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
      synchronized (LibraryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LibraryFileDescriptorSupplier())
              .addMethod(getAddBookMethod())
              .build();
        }
      }
    }
    return result;
  }
}
