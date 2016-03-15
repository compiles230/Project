/**
 * Account.java
 */
package Project;

/**
 * Class that models an Account, with name, username, password, type, status, and loggedOn status
 * 
 * @author Haylie Murphey
 * @version March 3, 2016
 */
public class Account {
	
	/**
	 * Name of the admin
	 */
	private String firstName;
	/**
	 * Last name of the admin
	 */
	private String lastName;
	/**
	 * Admin's username
	 */
	private String username;
	
	/**
	 * Admin's password
	 */
	private String password;
	/**
	 * Admin's type (should be 'a')
	 */
	private char type;
	
	/**
	 * Admin's status, deactivated or active ('N' || 'Y')
	 */
	private char status;
	
	/**
	 * Determines if Admin is logged on or not
	 */
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
		this.status = 'Y';
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
		this.setStatus('Y');
		this.loggedOn = false;
		
	}




	/**
	 * Checks if admin is logged on
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
	 * 
	 * Sets loggedOn to false
	 */
	public void logOff(){
		this.loggedOn = false;
	}

	/**
	 * returns of the first name of the admin
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * Sets first name of the admin to the given first name
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * Returns the last name of the admin
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * Sets the last name of the admin to the given last name
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * returns the admin's username
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * Sets the username of the admin to the given username
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * returns the admin's password
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * sets the password to the given password
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * returns the type of the Admin (should be a)
	 * @return the type
	 */
	public char getType() {
		return type;
	}


	/**
	 * sets the type of the Admin
	 * @param type the type to set
	 */
	public void setType(char type) {
		this.type = type;
	}


	/**
	 * returns the status of the admin
	 * @return the status
	 */
	public char getStatus() {
		return status;
	}


	/**
	 * Sets status of the admin.
	 * Either deactivated 'N' or activated 'Y'
	 * @param status the status to set
	 */
	public void setStatus(char status) {
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password="
				+ password + ", type=" + type + ", status=" + status + ", loggedOn=" + loggedOn + "]";
	}


}
