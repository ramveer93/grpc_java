# grpc_java_server
grpc with java server
# About the project
This is java implementation of the grpc server, It has services defined in resource/proto files based on that client side code will 
be generated

## Steps to build the project 

 - clone the project and import as maven project in eclipse or intelij
 ```mvn clean install```
 - start the server by runing the GRPCServer in server package
 - right click on pom.xml and then run the default profile, that will generate the stubs if not already generated 
 - Use the [rpc Boom](https://github.com/nicolaspearson/grpc.boom) to call the services, You have to import the protobuff files from the 
 ```src/main/resources```
 - You can use the [grpc_java_client](https://github.com/ramveer93/grpc_java_client) to call the services buy passing the protobuff files.

## Defining a proto file
``` proto

syntax = "proto3";

option java_package = "patientProto";

service PatientService{
	rpc getPatient(PatientRequest) returns (PatientResponse);
	rpc addPatient(Patient) returns (AddDeletePatientResponse);
	rpc deletePatient(Patient) returns (AddDeletePatientResponse);
	rpc getAllPatients(EmptyResponse) returns (PatientResponse);
}

message PatientRequest{
	int32 identifier = 1;
	string name = 2;
}


message PatientResponse{
 repeated Patient patient = 1;

}
enum Gender{
	MALE = 0;
	FEMALE = 1;
}
enum MaritalStatus{
	MARRIED = 0;
	UNMERRIED = 1;
}

message Patient{
	int32 identifier = 1;
	string name = 2;
	Gender gender = 3;
	bool active = 4;
	string address = 5;
	MaritalStatus maritalStatus = 6;
    string link = 7;
    repeated string language = 8;
    repeated Provider careProvider = 9;
    string managingOrganization = 10;
    repeated Contact guardian = 11;
}

message Provider{
	string name = 1;
	int32 identifier = 2;
	int32 tin = 3;

}

message Contact{
	string name = 1;
	string relationWithPatient = 2;
	string cotactDetails = 3;
}

message AddDeletePatientResponse{
	string successMessage = 1;
	string errorMessage = 2;
	int32 statusCode = 3;

}

message EmptyResponse{

}


```

## Implementing a Service

- First you service class should extends PatientServiceImplBase which you should get when you would have build the project for proto file
- You should implement the unimplemented methods in the service and provide the custom implementation of that

``` JAVA

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
 }
```


## Define a server in GRPC
``` JAVA
Server server = ServerBuilder.forPort(9094)
				.addService(new PatientService())
				.build();
		server.start();
		server.awaitTermination();
```

Now you can start the server and call it from the client.

## Contributing
Please raise an issue if you find anything which is not working or want unimplemented functionality.

## License
[MIT](https://choosealicense.com/licenses/mit/)
