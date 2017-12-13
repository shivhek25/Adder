import java.rmi.*;
public class Client
{
	public static void main(String args[]) throws Exception
	{
		AddI obj = (AddI)Naming.lookup("ADD");
		int sum = obj.add(6,4);
		System.out.println(sum);
	}	
}