package grpc.ProcTime;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service1.proto")
public final class LoginAccountGrpc {

  private LoginAccountGrpc() {}

  public static final String SERVICE_NAME = "proto.LoginAccount";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.ProcTime.LoginRequest,
      grpc.ProcTime.ResponseMessage> getEnterloginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Enterlogin",
      requestType = grpc.ProcTime.LoginRequest.class,
      responseType = grpc.ProcTime.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.ProcTime.LoginRequest,
      grpc.ProcTime.ResponseMessage> getEnterloginMethod() {
    io.grpc.MethodDescriptor<grpc.ProcTime.LoginRequest, grpc.ProcTime.ResponseMessage> getEnterloginMethod;
    if ((getEnterloginMethod = LoginAccountGrpc.getEnterloginMethod) == null) {
      synchronized (LoginAccountGrpc.class) {
        if ((getEnterloginMethod = LoginAccountGrpc.getEnterloginMethod) == null) {
          LoginAccountGrpc.getEnterloginMethod = getEnterloginMethod = 
              io.grpc.MethodDescriptor.<grpc.ProcTime.LoginRequest, grpc.ProcTime.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.LoginAccount", "Enterlogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ProcTime.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ProcTime.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new LoginAccountMethodDescriptorSupplier("Enterlogin"))
                  .build();
          }
        }
     }
     return getEnterloginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.ProcTime.ScheduleMessage,
      grpc.ProcTime.ResponseMessage> getUseraccountscheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Useraccountschedule",
      requestType = grpc.ProcTime.ScheduleMessage.class,
      responseType = grpc.ProcTime.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.ProcTime.ScheduleMessage,
      grpc.ProcTime.ResponseMessage> getUseraccountscheduleMethod() {
    io.grpc.MethodDescriptor<grpc.ProcTime.ScheduleMessage, grpc.ProcTime.ResponseMessage> getUseraccountscheduleMethod;
    if ((getUseraccountscheduleMethod = LoginAccountGrpc.getUseraccountscheduleMethod) == null) {
      synchronized (LoginAccountGrpc.class) {
        if ((getUseraccountscheduleMethod = LoginAccountGrpc.getUseraccountscheduleMethod) == null) {
          LoginAccountGrpc.getUseraccountscheduleMethod = getUseraccountscheduleMethod = 
              io.grpc.MethodDescriptor.<grpc.ProcTime.ScheduleMessage, grpc.ProcTime.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.LoginAccount", "Useraccountschedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ProcTime.ScheduleMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ProcTime.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new LoginAccountMethodDescriptorSupplier("Useraccountschedule"))
                  .build();
          }
        }
     }
     return getUseraccountscheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.ProcTime.Empty,
      grpc.ProcTime.ResponseMessage> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = grpc.ProcTime.Empty.class,
      responseType = grpc.ProcTime.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.ProcTime.Empty,
      grpc.ProcTime.ResponseMessage> getLogoutMethod() {
    io.grpc.MethodDescriptor<grpc.ProcTime.Empty, grpc.ProcTime.ResponseMessage> getLogoutMethod;
    if ((getLogoutMethod = LoginAccountGrpc.getLogoutMethod) == null) {
      synchronized (LoginAccountGrpc.class) {
        if ((getLogoutMethod = LoginAccountGrpc.getLogoutMethod) == null) {
          LoginAccountGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<grpc.ProcTime.Empty, grpc.ProcTime.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.LoginAccount", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ProcTime.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ProcTime.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new LoginAccountMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoginAccountStub newStub(io.grpc.Channel channel) {
    return new LoginAccountStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoginAccountBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LoginAccountBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoginAccountFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LoginAccountFutureStub(channel);
  }

  /**
   */
  public static abstract class LoginAccountImplBase implements io.grpc.BindableService {

    /**
     */
    public void enterlogin(grpc.ProcTime.LoginRequest request,
        io.grpc.stub.StreamObserver<grpc.ProcTime.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getEnterloginMethod(), responseObserver);
    }

    /**
     * <pre>
     *server request User name and password
     * </pre>
     */
    public void useraccountschedule(grpc.ProcTime.ScheduleMessage request,
        io.grpc.stub.StreamObserver<grpc.ProcTime.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getUseraccountscheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     *server displays account
     * </pre>
     */
    public void logout(grpc.ProcTime.Empty request,
        io.grpc.stub.StreamObserver<grpc.ProcTime.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnterloginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.ProcTime.LoginRequest,
                grpc.ProcTime.ResponseMessage>(
                  this, METHODID_ENTERLOGIN)))
          .addMethod(
            getUseraccountscheduleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.ProcTime.ScheduleMessage,
                grpc.ProcTime.ResponseMessage>(
                  this, METHODID_USERACCOUNTSCHEDULE)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.ProcTime.Empty,
                grpc.ProcTime.ResponseMessage>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class LoginAccountStub extends io.grpc.stub.AbstractStub<LoginAccountStub> {
    private LoginAccountStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoginAccountStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginAccountStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoginAccountStub(channel, callOptions);
    }

    /**
     */
    public void enterlogin(grpc.ProcTime.LoginRequest request,
        io.grpc.stub.StreamObserver<grpc.ProcTime.ResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnterloginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server request User name and password
     * </pre>
     */
    public void useraccountschedule(grpc.ProcTime.ScheduleMessage request,
        io.grpc.stub.StreamObserver<grpc.ProcTime.ResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUseraccountscheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server displays account
     * </pre>
     */
    public void logout(grpc.ProcTime.Empty request,
        io.grpc.stub.StreamObserver<grpc.ProcTime.ResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LoginAccountBlockingStub extends io.grpc.stub.AbstractStub<LoginAccountBlockingStub> {
    private LoginAccountBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoginAccountBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginAccountBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoginAccountBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.ProcTime.ResponseMessage enterlogin(grpc.ProcTime.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getEnterloginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server request User name and password
     * </pre>
     */
    public grpc.ProcTime.ResponseMessage useraccountschedule(grpc.ProcTime.ScheduleMessage request) {
      return blockingUnaryCall(
          getChannel(), getUseraccountscheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server displays account
     * </pre>
     */
    public grpc.ProcTime.ResponseMessage logout(grpc.ProcTime.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LoginAccountFutureStub extends io.grpc.stub.AbstractStub<LoginAccountFutureStub> {
    private LoginAccountFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoginAccountFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginAccountFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoginAccountFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ProcTime.ResponseMessage> enterlogin(
        grpc.ProcTime.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEnterloginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *server request User name and password
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ProcTime.ResponseMessage> useraccountschedule(
        grpc.ProcTime.ScheduleMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getUseraccountscheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *server displays account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ProcTime.ResponseMessage> logout(
        grpc.ProcTime.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENTERLOGIN = 0;
  private static final int METHODID_USERACCOUNTSCHEDULE = 1;
  private static final int METHODID_LOGOUT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LoginAccountImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LoginAccountImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENTERLOGIN:
          serviceImpl.enterlogin((grpc.ProcTime.LoginRequest) request,
              (io.grpc.stub.StreamObserver<grpc.ProcTime.ResponseMessage>) responseObserver);
          break;
        case METHODID_USERACCOUNTSCHEDULE:
          serviceImpl.useraccountschedule((grpc.ProcTime.ScheduleMessage) request,
              (io.grpc.stub.StreamObserver<grpc.ProcTime.ResponseMessage>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((grpc.ProcTime.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.ProcTime.ResponseMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LoginAccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoginAccountBaseDescriptorSupplier() {}

    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.ProcTime.Service1Impl.getDescriptor();
    }

    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LoginAccount");
    }
  }

  private static final class LoginAccountFileDescriptorSupplier
      extends LoginAccountBaseDescriptorSupplier {
    LoginAccountFileDescriptorSupplier() {}
  }

  private static final class LoginAccountMethodDescriptorSupplier
      extends LoginAccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LoginAccountMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LoginAccountGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoginAccountFileDescriptorSupplier())
              .addMethod(getEnterloginMethod())
              .addMethod(getUseraccountscheduleMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
