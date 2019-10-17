package service;

import java.util.HashMap;
import java.util.Map;

import com.library.proto.LibraryGrpc.LibraryImplBase;
import com.library.proto.LibraryOuterClass.BookRequest;
import com.library.proto.LibraryOuterClass.BookResponse;

import io.grpc.stub.StreamObserver;

public class LibraryService extends LibraryImplBase {

	static Map<Integer,BookRequest> map = new HashMap<>();
	
	@Override
	public void addBook(BookRequest request, StreamObserver<BookResponse> responseObserver) {
		map.put(request.getId(), request);
		System.out.println("================request from the client========"+request);
		BookResponse.Builder response = BookResponse.newBuilder();
		response.setMessage("Successully added !!");
		response.setCode(21);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

}
