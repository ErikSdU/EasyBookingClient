package es.deusto.ingenieria.sd.client.data;

public class User {

	private String email;
	private String password;
	private String name;
	private String username;
	private String defaultDepAirport;
	
	public User(String email, String password, String name, String username, String defaultDepAirport) {

		this.email = email;
		this.password = password;
		this.name = name;
		this.username = username;
		this.defaultDepAirport = defaultDepAirport;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDefaultDepAirport() {
		return defaultDepAirport;
	}
	public void setDefaultDepAirport(String defaultDepAirport) {
		this.defaultDepAirport = defaultDepAirport;
	}
	
	
}
