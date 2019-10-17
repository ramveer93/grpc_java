package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.employee.proto.EmployeeGrpc.EmployeeImplBase;
import com.employee.proto.EmployeeOuterClass.EmployeeRequest;
import com.employee.proto.EmployeeOuterClass.EmployeeResponse;
import com.employee.proto.EmployeeOuterClass.EmployeesList;

import io.grpc.stub.StreamObserver;

public class EmployeeService extends EmployeeImplBase{

	static Map<Integer,EmployeeRequest> map = new HashMap<>();
	
	@Override
	public void addEmployee(EmployeeRequest request, StreamObserver<EmployeeResponse> responseObserver) {
		map.put(request.getEmployeeId(), request);
		EmployeeResponse.Builder response = EmployeeResponse.newBuilder();
		response.setMessage("Successfully added employee with id: "+request.getEmployeeId()+"Now the map size is :"+map.size());
		response.setStatusCode(201);
		response.setEmployee(request);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void getEmployees(EmployeeRequest request, StreamObserver<EmployeesList> responseObserver) {
		EmployeesList.Builder employeeList = EmployeesList.newBuilder();
		Set<Integer> keys = map.keySet();
		int i = 0;
		for(Integer key:keys) {
			EmployeeRequest employee = map.get(key);
			employeeList.addEmployeeRequest(i++, employee);
		}
		responseObserver.onNext(employeeList.build());
		responseObserver.onCompleted();
	}
}
