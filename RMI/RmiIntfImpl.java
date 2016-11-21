import java.rmi.*;
import java.rmi.server. *;
public class RmiIntfImpl extends UnicastRemoteObject implements RmiIntf{
	public static final String MESSAGE = "helloworld!!!! of raji";
	
	public RmiIntfImpl()throws RemoteException{
		super();
		
	}
	public String getMessage()
	{
		return MESSAGE;
	}

}