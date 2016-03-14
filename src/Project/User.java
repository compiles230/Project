package Project;
/**
 * RegularUser.java
 */

import java.util.*;
import java.io.*;

/**
 * @author Kenzie Flickinger
 * @version 1.0 3/4/16
 *
 */
public class User extends Account{
	
	public User(){
		super();
	}

	 /**
	 * @param firstName
	 * @param lastName
	 * @param username
	 * @param password
	 * @param type
	 * @param status
	 */
	public User(String firstName, String lastName, String username, String password, char type, char status) {
		super(firstName, lastName, username, password, type, status);
		// TODO Auto-generated constructor stub
	}
	
	
	
	/* (non-Javadoc)
	 * @see Project.Account#isLoggedOn()
	 */
	@Override
	public boolean isLoggedOn() {
		// TODO Auto-generated method stub
		return super.isLoggedOn();
	}

	/* (non-Javadoc)
	 * @see Project.Account#logOn()
	 */
	@Override
	public void logOn() {
		// TODO Auto-generated method stub
		super.logOn();
	}

	/* (non-Javadoc)
	 * @see Project.Account#logOff()
	 */
	@Override
	public void logOff() {
		// TODO Auto-generated method stub
		super.logOff();
	}

	/* (non-Javadoc)
	 * @see Project.Account#getFirstName()
	 */
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return super.getFirstName();
	}

	/* (non-Javadoc)
	 * @see Project.Account#setFirstName(java.lang.String)
	 */
	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		super.setFirstName(firstName);
	}

	/* (non-Javadoc)
	 * @see Project.Account#getLastName()
	 */
	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return super.getLastName();
	}

	/* (non-Javadoc)
	 * @see Project.Account#setLastName(java.lang.String)
	 */
	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		super.setLastName(lastName);
	}

	/* (non-Javadoc)
	 * @see Project.Account#getUsername()
	 */
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return super.getUsername();
	}

	/* (non-Javadoc)
	 * @see Project.Account#setUsername(java.lang.String)
	 */
	@Override
	public void setUsername(String username) {
		// TODO Auto-generated method stub
		super.setUsername(username);
	}

	/* (non-Javadoc)
	 * @see Project.Account#getPassword()
	 */
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return super.getPassword();
	}

	/* (non-Javadoc)
	 * @see Project.Account#setPassword(java.lang.String)
	 */
	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		super.setPassword(password);
	}

	/* (non-Javadoc)
	 * @see Project.Account#getType()
	 */
	@Override
	public char getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}

	/* (non-Javadoc)
	 * @see Project.Account#setType(char)
	 */
	@Override
	public void setType(char type) {
		// TODO Auto-generated method stub
		super.setType(type);
	}

	/* (non-Javadoc)
	 * @see Project.Account#getStatus()
	 */
	@Override
	public char getStatus() {
		// TODO Auto-generated method stub
		return super.getStatus();
	}

	/* (non-Javadoc)
	 * @see Project.Account#setStatus(char)
	 */
	@Override
	public void setStatus(char status) {
		// TODO Auto-generated method stub
		super.setStatus(status);
	}

	/**
     * A method to return the current values of the Regular user in the form of a string.
     *
     * @return the values currently stored in the Regular user.
     */
    @Override
    public String toString() {
        return ("\n-User-\nFirst Name: " + getFirstName() + "\nLast Name: " + getLastName() + "\nUsername: " + getUsername() + "\nPassword: "
                + getPassword() + "\nType: " + getType() + "\nStatus: " + getStatus() );
    }

}
