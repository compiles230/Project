package Project;

/**
 * Class that models an Account, with name, username, password, type, status, and loggedOn status
 * 
 * @author Haylie Murphey
 * @version March 3, 2016
 */
public class Account {
	
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private char type;
	private char status;
	private boolean	loggedOn;
	

	
	/**
	 * Default constructor for Account
	 */
	public Account() {
		this.firstName = null;
		this.lastName = null;
		this.username = null;
		this.password = null;
		this.type = 'n';
		this.status = 'n';
		this.loggedOn = false;
	}

	/**
	 * Constructor for Account with given parameters
	 * @param firstName
	 * @param lastName
	 * @param username
	 * @param password
	 * @param type
	 * @param status
	 */
	public Account(String firstName, String lastName, String username, String password, char type, char status) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.type = type;
		this.status = status;
		this.loggedOn = false;
		
	}




	/**
	 * @return the loggedOn
	 */
	public boolean isLoggedOn() {
		return loggedOn;
	}

	/**
	 * Sets loggedOn to true
	 */
	public void logOn() {
		this.loggedOn = true;
	}
	
	/**
	 * Sets loggedOn to false
	 */
	public void logOff(){
		this.loggedOn = false;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the type
	 */
	public char getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(char type) {
		this.type = type;
	}


	/**
	 * @return the status
	 */
	public char getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(char status) {
		this.status = status;
	}


}
