package Project;
/**
 * 
 */

/**
 * Class that models an Admin  (Administrator)
 * extends the class Account
 * @author hgmurphey
 *
 */
public class Admin extends Account{



	/**
	 * Default constructor for Admin
	 */
	public Admin() {
		super();
	}

	/**
	 * Constructs instance of Admin with given parameters
	 * @param firstName
	 * @param lastName
	 * @param username
	 * @param password
	 * @param type
	 * @param status
	 */
	public Admin(String firstName, String lastName, String username, String password, char type, char status) {
		super(firstName, lastName, username, password, type, status);
	}

	/* (non-Javadoc)
	 * @see Account#getFirstName()
	 */
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return super.getFirstName();
	}

	/* (non-Javadoc)
	 * @see Account#setFirstName(java.lang.String)
	 */
	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		super.setFirstName(firstName);
	}

	/* (non-Javadoc)
	 * @see Account#getLastName()
	 */
	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return super.getLastName();
	}

	/* (non-Javadoc)
	 * @see Account#setLastName(java.lang.String)
	 */
	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		super.setLastName(lastName);
	}

	/* (non-Javadoc)
	 * @see Account#getUsername()
	 */
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return super.getUsername();
	}

	/* (non-Javadoc)
	 * @see Account#setUsername(java.lang.String)
	 */
	@Override
	public void setUsername(String username) {
		// TODO Auto-generated method stub
		super.setUsername(username);
	}

	/* (non-Javadoc)
	 * @see Account#getPassword()
	 */
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return super.getPassword();
	}

	/* (non-Javadoc)
	 * @see Account#setPassword(java.lang.String)
	 */
	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		super.setPassword(password);
	}

	/* (non-Javadoc)
	 * @see Account#getType()
	 */
	@Override
	public char getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}

	/* (non-Javadoc)
	 * @see Account#setType(char)
	 */
	@Override
	public void setType(char type) {
		// TODO Auto-generated method stub
		super.setType(type);
	}

	/* (non-Javadoc)
	 * @see Account#getStatus()
	 */
	@Override
	public char getStatus() {
		// TODO Auto-generated method stub
		return super.getStatus();
	}

	/* (non-Javadoc)
	 * @see Account#isLoggedOn()
	 */
	@Override
	public boolean isLoggedOn() {
		// TODO Auto-generated method stub
		return super.isLoggedOn();
	}

	/* (non-Javadoc)
	 * @see Account#logOn()
	 */
	@Override
	public void logOn() {
		// TODO Auto-generated method stub
		super.logOn();
	}

	/* (non-Javadoc)
	 * @see Account#logOff()
	 */
	@Override
	public void logOff() {
		// TODO Auto-generated method stub
		super.logOff();
	}

	/* (non-Javadoc)
	 * @see Account#setStatus(java.lang.String)
	 */
	@Override
	public void setStatus(char status) {
		// TODO Auto-generated method stub
		super.setStatus(status);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Admin [firstName=" + getFirstName() + ", lastName()=" + getLastName() + ", username()="
				+ getUsername() + ", password()=" + getPassword() + ", type()=" + getType() + ", status()="
				+ getStatus() + "]";
	}


}
