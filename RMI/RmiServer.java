import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
public class RmiServer
{
	public static void main(String args[])throws Exception
	{
		RmiIntfImpl obj = new RmiIntfImpl();
		Naming.rebind("rmi://localhost:6000/samp",obj);
	
	}
}