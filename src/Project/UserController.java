package Project;
/**
 * UserController.java
 */

import java.util.*;
import java.io.*;

/**
 * RegUserController performs the functionalities
 * of the User on the CMC system 
 * 
 * @author Kenzie Flickinger
 * @version 1.0 3/4/16
 */
public class UserController {

	private User user;
	private DatabaseController dBController;
	private School school;
	private static boolean loggedIn=false;
	
	
	/**
	 * 
	 */
	public UserController(){
		School school = null;
		User user = null;
		DatabaseController dBContoller = null;
	}
	
	/**
	 * 
	 * @param dBController
	 */
	public UserController(DatabaseController dBController) {
		this.dBController = dBController;
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 */
	
	
	/**
	 * Takes the username of a regular user and returns a Array List of their saved schools.
	 * @param username
	 * @return Returns an Array List of all the saved schools given a user's username.
	 */
	public ArrayList<String> getSavedSchools(String username){
		TreeMap<Integer, ArrayList<String>> savedSchools = dBController.getSavedSchools();
        ArrayList<String> userSchools = savedSchools.get(username);
        return userSchools; 
	}
	
	/**
	 * Allows user to edit and update his/her profile information
	 * @param username
	 * @param password
	 */
	public void editProfile(String username, String firstName, String lastName, String password){
		dBController.user_editUserInfo(username, firstName, lastName, password);
	}
	
	/**
	 * Allows user to remove school from saved schools list
	 * @param school
	 */
	public void removeSchool(String username, String school){
		dBController.removeSchool(username, school);
	}

}
