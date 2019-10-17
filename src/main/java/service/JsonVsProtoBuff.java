package service;

import patientProto.PatientServiceOuterClass.ProtoVsJson;

public class JsonVsProtoBuff {

	
	public static void main(String args[]) {
		
		ProtoVsJson.Builder protoVsJson = ProtoVsJson.newBuilder();
		protoVsJson.setMessage("Hello JSON!");
		protoVsJson.setStatus("OK");
		int size = protoVsJson.build().getSerializedSize();
		System.out.println("================================size of the message encoded===================="+size);
		System.out.println("=======================protoVsJson============================================="+protoVsJson);
		
	}
}
