package es.deusto.ingenieria.sd.client.data;

import java.util.ArrayList;


public class Reservation {

	private String code;
	private int price;
	private User user;
	private ArrayList<Flight> flight;
	private ArrayList<Passenger> passengers;
	
	
	public Reservation(String code, int price, User user, ArrayList<Flight> flight, ArrayList<Passenger> passengers) {
		super();
		this.code = code;
		this.price = price;
		this.user = user;
		this.flight = flight;
		this.passengers = passengers;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public User getUser() {
		return user;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}



	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public ArrayList<Flight> getFlight() {
		return flight;
	}


	public void setFlights(ArrayList<Flight> flight) {
		this.flight = flight;
	}
	
	
	
}
