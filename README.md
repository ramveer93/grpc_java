# grpc_java_server
grpc with java server
# About the project
This is java implementation of the grpc server, It has services defined in resource/proto files based on that client side code will 
be generated

## Steps to build the project 

 - clone the project and import as maven project in eclipse or intelij
 ```mvn clean install```
 - start the server by runing the GRPCServer in server package
 - Use the [rpc Boom](https://github.com/nicolaspearson/grpc.boom) to call the services, You have to import the protobuff files from the 
 ```src/main/resources```
 - You can use the [grpc_java_client](https://github.com/ramveer93/grpc_java_client) to call the services
