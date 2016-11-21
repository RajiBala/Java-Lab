import java.rmi.*;
public interface RmiIntf extends Remote
{
public String getMessage() throws RemoteException;
}

