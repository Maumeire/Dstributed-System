import java.io.IOException;
import Service1.UserService1;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(50051).addService(new UserService1()).build();
		server.start();
		
		System.out.println("Server started at "+server.getPort());
		server.awaitTermination();
	}

}
