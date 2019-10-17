package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import io.grpc.stub.StreamObserver;
import patientProto.PatientServiceGrpc.PatientServiceImplBase;
import patientProto.PatientServiceOuterClass;
import patientProto.PatientServiceOuterClass.AddDeletePatientResponse;
import patientProto.PatientServiceOuterClass.EmptyResponse;
import patientProto.PatientServiceOuterClass.Patient;
import patientProto.PatientServiceOuterClass.PatientRequest;
import patientProto.PatientServiceOuterClass.PatientResponse;


public class PatientService extends PatientServiceImplBase {
	
	
	private static Map<Integer,Patient> map = new HashMap<>();
	
	@Override
	public void getPatient(PatientRequest request,
	       StreamObserver<PatientServiceOuterClass.PatientResponse> responseObserver ) {
		PatientResponse.Builder response  = PatientResponse.newBuilder();
		Patient patient = map.get(request.getIdentifier());
		if(patient!=null) {
			response.addPatient(0, patient);
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}
	
	@Override
	public void addPatient(Patient request,
	        StreamObserver<AddDeletePatientResponse> responseObserver) {
		   map.put(request.getIdentifier(), request);
		   System.out.println("Got the call from client inside addPatient method with input: "+request);
		   System.out.println("map size is : "+map.size());
		   System.out.println("map is : "+map.toString());
		   AddDeletePatientResponse.Builder  response = AddDeletePatientResponse.newBuilder();
		   response.setStatusCode(200);
		   response.setSuccessMessage("Successfully added the patient with name : "+request.getName()+" and id : "+request.getIdentifier());
		   response.setErrorMessage("");
		   responseObserver.onNext(response.build());
		   responseObserver.onCompleted();
		   
	}
	
	
	@Override
	public void deletePatient(Patient request,
	        StreamObserver<AddDeletePatientResponse> responseObserver) {
		
		AddDeletePatientResponse.Builder  response = AddDeletePatientResponse.newBuilder();
		
		if(map.get(request.getIdentifier())!=null) {
			map.remove(request.getIdentifier());
			response.setStatusCode(200);
			response.setSuccessMessage("Successfully deleted the patient with id as : "+request.getIdentifier());
			response.setErrorMessage("");
		}else {
			response.setStatusCode(400);
			response.setErrorMessage("Error deleting the record for patient id : "+request.getIdentifier());
			response.setSuccessMessage("");
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}
	
	
	@Override
	public void getAllPatients(EmptyResponse request,
	        StreamObserver<PatientResponse> responseObserver) {
		
		 PatientResponse.Builder patientResponse  = PatientResponse.newBuilder();
		 Set<Integer> keys =  map.keySet();
		 int i = 0;
		 for(int key: keys) {
			 Patient patient = map.get(key);
			 patientResponse.addPatient(i++, patient);
		 }
		 
		 responseObserver.onNext(patientResponse.build());
		 responseObserver.onCompleted();
		 
		
	}
	
	
	
	

}
