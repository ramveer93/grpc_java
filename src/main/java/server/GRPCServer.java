package server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.EmployeeService;
import service.LibraryService;
import service.PatientService;
import service.UserService;

public class GRPCServer {

	
	public static void main(String args[]) throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(9094)
				.addService(new PatientService())
				.addService(new UserService())
				.addService(new EmployeeService())
				.addService(new LibraryService())
				.build();
		server.start();
		
		System.out.println("server started at :: "+server.getPort());
		server.awaitTermination();
	}
}
