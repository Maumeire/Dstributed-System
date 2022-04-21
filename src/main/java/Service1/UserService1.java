package Service1;

import grpc.ProcTime.Empty;
import grpc.ProcTime.LoginAccountGrpc.LoginAccountImplBase;
import grpc.ProcTime.LoginRequest;
import grpc.ProcTime.ResponseMessage;
import grpc.ProcTime.ScheduleMessage;
import io.grpc.stub.StreamObserver;

public class UserService1 extends LoginAccountImplBase {

	@Override
	public void enterlogin(LoginRequest request, StreamObserver<ResponseMessage> responseObserver) {
		System.out.println("Inside login");
		String username = request.getUsername();
		String password = request.getPassword();
		
		ResponseMessage.Builder response = ResponseMessage.newBuilder();
		if(username.equals(password)) {
			//return success 
			response.setResponseCode(0).setResponsemessage("SUCCESS");
		}else {
			//return false
			response.setResponseCode(100).setResponsemessage("INVALID PASSWORD");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void useraccountschedule(ScheduleMessage request, StreamObserver<ResponseMessage> responseObserver) {
		// TODO Auto-generated method stub
		super.useraccountschedule(request, responseObserver);
	}

	@Override
	public void logout(Empty request, StreamObserver<ResponseMessage> responseObserver) {
		// TODO Auto-generated method stub
		super.logout(request, responseObserver);
	}

	

}
