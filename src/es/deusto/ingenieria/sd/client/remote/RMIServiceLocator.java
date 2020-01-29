package es.deusto.ingenieria.sd.client.remote;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import es.deusto.ingenieria.sd.server.remote.IEasyBooking;

public class RMIServiceLocator {

	private IEasyBooking service;

    public RMIServiceLocator(){ 
    
    }

    public void setService(String args[]) {     
    	String name = "//" + args[0] + ":" + args[1] + "/" + args[2];
    	System.out.println(name);
    	try {
    		
			this.service = (IEasyBooking) java.rmi.Naming.lookup(name);
			System.out.println("called");
		} catch (MalformedURLException e) {
			System.out.println(e);
		} catch (RemoteException e) {
			System.out.println(e);
		} catch (NotBoundException e) {
			System.out.println(e);
		}
    }
    
    public IEasyBooking getService() { 
    	System.out.println("dato 2.5");
    	if (this.service==null) {
			System.out.println("soy null nene");
		}
    	return this.service;
    }
}
