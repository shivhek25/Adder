import java.rmi.*;
public class Client
{
	public static void main(String args[]) throws Exception
	{
		AddI obj = (AddI)Naming.lookup("rmi://localhost:5000/ADD");
		int sum = obj.add(4,6);
		System.out.println(sum);
	}	
}