package service;



import io.grpc.stub.StreamObserver;
import proto.User.APIResponse;
import proto.User.Empty;
import proto.User.LoginRequest;
import proto.userGrpc.userImplBase;

public class UserService extends userImplBase {

	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		
		System.out.println("Server got the request from client with input data as :  "+request);
		String username = request.getUsername();
		String password = request.getPassword();
		
		APIResponse.Builder  response = APIResponse.newBuilder();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("thread interrepted************");
			e.printStackTrace();
		}
		
		if(username.equals(password)) {
			//return success message
			response.setResponseCode(200).setResponsemessage("request success");
		}else {
			//failure
			response.setResponseCode(400).setResponsemessage("request failed");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}

	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
		
	}

}
