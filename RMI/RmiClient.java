import java.rmi.*;
public class RmiClient
{
	public static void main(String args[])throws Exception
	{
		RmiClient ob = new RmiClient();
	}
	public RmiClient()throws Exception{
		
		RmiIntf obj = (RmiIntf)Naming.lookup("rmi://localhost:6000/samp");
		
		System.out.println(obj.getMessage());
	}
	
	
	
	
	
} 