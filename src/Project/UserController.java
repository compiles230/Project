package Project;
/**
 * RegUserController.java
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

	private User regUser;
	private static DatabaseController DatabaseController;
	//private University university;
	private static boolean loggedIn=false;
	
	/**
	 * 
	 */
	public void RegUserController() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 */
	public void search(){
	
	}
	
	/**
	 * 
	 * @return
	 */
	public String results(){
		return null;
	}

	/**
	 * 
	 */
	public void addSchool(){
	}
	
	/**
	 * 
	 */
	public void removeSchool(String username, School school){
	}  
	
	/**
	 * Takes the id of a regular user and returns a Array List of their saved schools.
	 * @param id
	 * @return Returns a Array List of all the saved schools given a user's id.
	 */
	public static ArrayList<String> getSavedSchools(int id){
		TreeMap<Integer, ArrayList<String>> savedSchools = DatabaseController.getSavedSchools();
        ArrayList<String> userSchools = savedSchools.get(id);
        return userSchools; 
	}
	   
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
