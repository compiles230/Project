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
	
	/**
	 * instance of User
	 */
	private User user;
	
	/**
	 * Instance of DatabaseController
	 */
	private static DatabaseController dBController;

	/**
	 * Defult Constructor
	 */
	public UserController(){
		School school = null;
		User user = null;
		DatabaseController dBController = null;
	}
	
	/**
	 * 
	 * @param dBController
	 */
	public UserController(DatabaseController dBController) {
		this.dBController = dBController;
	}
	
	
	/**
	 * Allows user to edit and update his/her profile information
	 * @param username
	 * @param password
	 */
	public static void editProfile(User user, String username, String firstName, String lastName, String password){
		dBController.user_editUserInfo(user, username, firstName, lastName, password);
	}

}
