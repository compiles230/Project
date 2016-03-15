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
	 * Allows user to edit and update his/her profile information
	 * @param username
	 * @param password
	 */
	public void editProfile(User user, String username, String firstName, String lastName, String password){
		dBController.user_editUserInfo(user, username, firstName, lastName, password);
	}
	
	/**
	 * Allows user to remove school from saved schools list
	 * @param school
	 */
	public void removeSchool(String username, String school){
		dBController.removeSchool(username, school);
	}

}
