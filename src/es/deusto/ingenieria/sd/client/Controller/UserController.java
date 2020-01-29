package es.deusto.ingenieria.sd.client.Controller;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.deusto.ingenieria.sd.client.gui.EasyBookingLog;
import es.deusto.ingenieria.sd.client.remote.RMIServiceLocator;
import es.deusto.ingenieria.sd.server.data.dto.FlightInfoDTO;
import es.deusto.ingenieria.sd.server.data.dto.PassengerDTO;
import es.deusto.ingenieria.sd.server.data.dto.UserDTO;
import es.deusto.ingenieria.sd.client.gui.EasyBookingLog;


public class UserController {
	
	private RMIServiceLocator rsl;
	
	public UserController(String args[])  {
		// Add your code HERE - Related to the Service Locator
		System.out.println("1");
		new EasyBookingLog(this);
		System.out.println("2");

		rsl = new RMIServiceLocator();
		System.out.println("3");

		rsl.setService(args);
		System.out.println("4");

		
	}
	
	public void register(String email,String password,String name,String username, String defaultAirport) {
System.out.println("r.01");
		try {
			rsl.getService().register(email, password, name, username, defaultAirport);
		} catch (Exception e) {
			System.err.println("Error while registering"+e.getMessage());
		}
	}
	
	public UserDTO signIn(String email, String password) {
		try {
			rsl.getService().login(email,password);
		} catch (RemoteException e) {
			System.err.println("Error while signing in"+e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	
	public List<FlightInfoDTO> searchFlight(String departureAirport, String arrivalAirport, String date, int seats) {
		try {
			System.out.println("dato2");
			return rsl.getService().getFlights(departureAirport, arrivalAirport, date, seats);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void reserveFlight(ArrayList<FlightInfoDTO> flights, ArrayList<PassengerDTO> passengers, UserDTO user, String password) {
		
		try {
			rsl.getService().book(flights, passengers, user, password);
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	
	public void exit() {
		System.exit(0);
	}
	
	public static void main(String args[]) {
		System.out.println("jgkjsdkj");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);

		}
		String [] g = new String[3];
//		g[0] = "1";
//		g[1] = "2";
//		g[2] = "3";
		new UserController(args);
		//userCont.register("ruben@gmail.com","1234", "ruben", "rublev","arn");
		//userCont.signIn("ruben@gmail.com", "1234");
		
		
	}
}



