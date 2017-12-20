import java.rmi.*;
import java.rmi.registry.*;
public class Server
{
	public static void main(String args[]) throws Exception
	{
		AddI obj = new AddC();
		Naming.rebind("rmi://localhost:5000/ADD",obj);
		System.out.println("Server started");
	}
}