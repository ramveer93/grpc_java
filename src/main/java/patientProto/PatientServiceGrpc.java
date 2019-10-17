package patientProto;

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
    comments = "Source: PatientService.proto")
public final class PatientServiceGrpc {

  private PatientServiceGrpc() {}

  public static final String SERVICE_NAME = "PatientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<patientProto.PatientServiceOuterClass.PatientRequest,
      patientProto.PatientServiceOuterClass.PatientResponse> getGetPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPatient",
      requestType = patientProto.PatientServiceOuterClass.PatientRequest.class,
      responseType = patientProto.PatientServiceOuterClass.PatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<patientProto.PatientServiceOuterClass.PatientRequest,
      patientProto.PatientServiceOuterClass.PatientResponse> getGetPatientMethod() {
    io.grpc.MethodDescriptor<patientProto.PatientServiceOuterClass.PatientRequest, patientProto.PatientServiceOuterClass.PatientResponse> getGetPatientMethod;
    if ((getGetPatientMethod = PatientServiceGrpc.getGetPatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getGetPatientMethod = PatientServiceGrpc.getGetPatientMethod) == null) {
          PatientServiceGrpc.getGetPatientMethod = getGetPatientMethod = 
              io.grpc.MethodDescriptor.<patientProto.PatientServiceOuterClass.PatientRequest, patientProto.PatientServiceOuterClass.PatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PatientService", "getPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  patientProto.PatientServiceOuterClass.PatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  patientProto.PatientServiceOuterClass.PatientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("getPatient"))
                  .build();
          }
        }
     }
     return getGetPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<patientProto.PatientServiceOuterClass.Patient,
      patientProto.PatientServiceOuterClass.AddDeletePatientResponse> getAddPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addPatient",
      requestType = patientProto.PatientServiceOuterClass.Patient.class,
      responseType = patientProto.PatientServiceOuterClass.AddDeletePatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<patientProto.PatientServiceOuterClass.Patient,
      patientProto.PatientServiceOuterClass.AddDeletePatientResponse> getAddPatientMethod() {
    io.grpc.MethodDescriptor<patientProto.PatientServiceOuterClass.Patient, patientProto.PatientServiceOuterClass.AddDeletePatientResponse> getAddPatientMethod;
    if ((getAddPatientMethod = PatientServiceGrpc.getAddPatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getAddPatientMethod = PatientServiceGrpc.getAddPatientMethod) == null) {
          PatientServiceGrpc.getAddPatientMethod = getAddPatientMethod = 
              io.grpc.MethodDescriptor.<patientProto.PatientServiceOuterClass.Patient, patientProto.PatientServiceOuterClass.AddDeletePatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PatientService", "addPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  patientProto.PatientServiceOuterClass.Patient.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  patientProto.PatientServiceOuterClass.AddDeletePatientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("addPatient"))
                  .build();
          }
        }
     }
     return getAddPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<patientProto.PatientServiceOuterClass.Patient,
      patientProto.PatientServiceOuterClass.AddDeletePatientResponse> getDeletePatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletePatient",
      requestType = patientProto.PatientServiceOuterClass.Patient.class,
      responseType = patientProto.PatientServiceOuterClass.AddDeletePatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<patientProto.PatientServiceOuterClass.Patient,
      patientProto.PatientServiceOuterClass.AddDeletePatientResponse> getDeletePatientMethod() {
    io.grpc.MethodDescriptor<patientProto.PatientServiceOuterClass.Patient, patientProto.PatientServiceOuterClass.AddDeletePatientResponse> getDeletePatientMethod;
    if ((getDeletePatientMethod = PatientServiceGrpc.getDeletePatientMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getDeletePatientMethod = PatientServiceGrpc.getDeletePatientMethod) == null) {
          PatientServiceGrpc.getDeletePatientMethod = getDeletePatientMethod = 
              io.grpc.MethodDescriptor.<patientProto.PatientServiceOuterClass.Patient, patientProto.PatientServiceOuterClass.AddDeletePatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PatientService", "deletePatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  patientProto.PatientServiceOuterClass.Patient.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  patientProto.PatientServiceOuterClass.AddDeletePatientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("deletePatient"))
                  .build();
          }
        }
     }
     return getDeletePatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<patientProto.PatientServiceOuterClass.EmptyResponse,
      patientProto.PatientServiceOuterClass.PatientResponse> getGetAllPatientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllPatients",
      requestType = patientProto.PatientServiceOuterClass.EmptyResponse.class,
      responseType = patientProto.PatientServiceOuterClass.PatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<patientProto.PatientServiceOuterClass.EmptyResponse,
      patientProto.PatientServiceOuterClass.PatientResponse> getGetAllPatientsMethod() {
    io.grpc.MethodDescriptor<patientProto.PatientServiceOuterClass.EmptyResponse, patientProto.PatientServiceOuterClass.PatientResponse> getGetAllPatientsMethod;
    if ((getGetAllPatientsMethod = PatientServiceGrpc.getGetAllPatientsMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getGetAllPatientsMethod = PatientServiceGrpc.getGetAllPatientsMethod) == null) {
          PatientServiceGrpc.getGetAllPatientsMethod = getGetAllPatientsMethod = 
              io.grpc.MethodDescriptor.<patientProto.PatientServiceOuterClass.EmptyResponse, patientProto.PatientServiceOuterClass.PatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PatientService", "getAllPatients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  patientProto.PatientServiceOuterClass.EmptyResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  patientProto.PatientServiceOuterClass.PatientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("getAllPatients"))
                  .build();
          }
        }
     }
     return getGetAllPatientsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientServiceStub newStub(io.grpc.Channel channel) {
    return new PatientServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PatientServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PatientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PatientServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PatientServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPatient(patientProto.PatientServiceOuterClass.PatientRequest request,
        io.grpc.stub.StreamObserver<patientProto.PatientServiceOuterClass.PatientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPatientMethod(), responseObserver);
    }

    /**
     */
    public void addPatient(patientProto.PatientServiceOuterClass.Patient request,
        io.grpc.stub.StreamObserver<patientProto.PatientServiceOuterClass.AddDeletePatientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPatientMethod(), responseObserver);
    }

    /**
     */
    public void deletePatient(patientProto.PatientServiceOuterClass.Patient request,
        io.grpc.stub.StreamObserver<patientProto.PatientServiceOuterClass.AddDeletePatientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePatientMethod(), responseObserver);
    }

    /**
     */
    public void getAllPatients(patientProto.PatientServiceOuterClass.EmptyResponse request,
        io.grpc.stub.StreamObserver<patientProto.PatientServiceOuterClass.PatientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllPatientsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPatientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                patientProto.PatientServiceOuterClass.PatientRequest,
                patientProto.PatientServiceOuterClass.PatientResponse>(
                  this, METHODID_GET_PATIENT)))
          .addMethod(
            getAddPatientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                patientProto.PatientServiceOuterClass.Patient,
                patientProto.PatientServiceOuterClass.AddDeletePatientResponse>(
                  this, METHODID_ADD_PATIENT)))
          .addMethod(
            getDeletePatientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                patientProto.PatientServiceOuterClass.Patient,
                patientProto.PatientServiceOuterClass.AddDeletePatientResponse>(
                  this, METHODID_DELETE_PATIENT)))
          .addMethod(
            getGetAllPatientsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                patientProto.PatientServiceOuterClass.EmptyResponse,
                patientProto.PatientServiceOuterClass.PatientResponse>(
                  this, METHODID_GET_ALL_PATIENTS)))
          .build();
    }
  }

  /**
   */
  public static final class PatientServiceStub extends io.grpc.stub.AbstractStub<PatientServiceStub> {
    private PatientServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPatient(patientProto.PatientServiceOuterClass.PatientRequest request,
        io.grpc.stub.StreamObserver<patientProto.PatientServiceOuterClass.PatientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPatient(patientProto.PatientServiceOuterClass.Patient request,
        io.grpc.stub.StreamObserver<patientProto.PatientServiceOuterClass.AddDeletePatientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePatient(patientProto.PatientServiceOuterClass.Patient request,
        io.grpc.stub.StreamObserver<patientProto.PatientServiceOuterClass.AddDeletePatientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllPatients(patientProto.PatientServiceOuterClass.EmptyResponse request,
        io.grpc.stub.StreamObserver<patientProto.PatientServiceOuterClass.PatientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllPatientsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PatientServiceBlockingStub extends io.grpc.stub.AbstractStub<PatientServiceBlockingStub> {
    private PatientServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public patientProto.PatientServiceOuterClass.PatientResponse getPatient(patientProto.PatientServiceOuterClass.PatientRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public patientProto.PatientServiceOuterClass.AddDeletePatientResponse addPatient(patientProto.PatientServiceOuterClass.Patient request) {
      return blockingUnaryCall(
          getChannel(), getAddPatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public patientProto.PatientServiceOuterClass.AddDeletePatientResponse deletePatient(patientProto.PatientServiceOuterClass.Patient request) {
      return blockingUnaryCall(
          getChannel(), getDeletePatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public patientProto.PatientServiceOuterClass.PatientResponse getAllPatients(patientProto.PatientServiceOuterClass.EmptyResponse request) {
      return blockingUnaryCall(
          getChannel(), getGetAllPatientsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PatientServiceFutureStub extends io.grpc.stub.AbstractStub<PatientServiceFutureStub> {
    private PatientServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<patientProto.PatientServiceOuterClass.PatientResponse> getPatient(
        patientProto.PatientServiceOuterClass.PatientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<patientProto.PatientServiceOuterClass.AddDeletePatientResponse> addPatient(
        patientProto.PatientServiceOuterClass.Patient request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<patientProto.PatientServiceOuterClass.AddDeletePatientResponse> deletePatient(
        patientProto.PatientServiceOuterClass.Patient request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<patientProto.PatientServiceOuterClass.PatientResponse> getAllPatients(
        patientProto.PatientServiceOuterClass.EmptyResponse request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllPatientsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PATIENT = 0;
  private static final int METHODID_ADD_PATIENT = 1;
  private static final int METHODID_DELETE_PATIENT = 2;
  private static final int METHODID_GET_ALL_PATIENTS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PatientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PatientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PATIENT:
          serviceImpl.getPatient((patientProto.PatientServiceOuterClass.PatientRequest) request,
              (io.grpc.stub.StreamObserver<patientProto.PatientServiceOuterClass.PatientResponse>) responseObserver);
          break;
        case METHODID_ADD_PATIENT:
          serviceImpl.addPatient((patientProto.PatientServiceOuterClass.Patient) request,
              (io.grpc.stub.StreamObserver<patientProto.PatientServiceOuterClass.AddDeletePatientResponse>) responseObserver);
          break;
        case METHODID_DELETE_PATIENT:
          serviceImpl.deletePatient((patientProto.PatientServiceOuterClass.Patient) request,
              (io.grpc.stub.StreamObserver<patientProto.PatientServiceOuterClass.AddDeletePatientResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_PATIENTS:
          serviceImpl.getAllPatients((patientProto.PatientServiceOuterClass.EmptyResponse) request,
              (io.grpc.stub.StreamObserver<patientProto.PatientServiceOuterClass.PatientResponse>) responseObserver);
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

  private static abstract class PatientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PatientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return patientProto.PatientServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PatientService");
    }
  }

  private static final class PatientServiceFileDescriptorSupplier
      extends PatientServiceBaseDescriptorSupplier {
    PatientServiceFileDescriptorSupplier() {}
  }

  private static final class PatientServiceMethodDescriptorSupplier
      extends PatientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PatientServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PatientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientServiceFileDescriptorSupplier())
              .addMethod(getGetPatientMethod())
              .addMethod(getAddPatientMethod())
              .addMethod(getDeletePatientMethod())
              .addMethod(getGetAllPatientsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
