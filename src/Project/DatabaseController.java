package Project;
/**
 * DatabaseController.java
 */

//import UniversityDBLibrary;
//import java.sql.SQLException;
import dblibrary.project.csci230.*;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 * DatabaseController deals directly with the database. Any class
 * requesting information from the university database must go through this.
 * It puts the output into accessible data structures(ArrayLists, TreeMaps)
 *
 * @author Kenzie Flickinger and Haylie Murphey
 * @version 3/4/16
 */
public class DatabaseController {
	private static UniversityDBLibrary database;
	
	/**
	 * Default Constructor
	 */
	public DatabaseController() {
		// TODO Auto-generated constructor stub
		this.database = null;
	}
	
	
	/**
	 * Constructor with given a Database
	 */
	public DatabaseController(UniversityDBLibrary database){
		
		this.database = database;
	
	}
	 

	/**
	 * Adds a new university to the database with the given parameters
	 * @param school
	 * @param state
	 * @param location
	 * @param control
	 * @param numberOfStudents
	 * @param percentFemales
	 * @param SATVerbal
	 * @param SATMath
	 * @param expenses
	 * @param percentFinancialAid
	 * @param numberOfApplicants
	 * @param percentAdmitted
	 * @param percentEnrolled
	 * @param academicsScale
	 * @param socialScale
	 * @param qualityOfLifeScale
	 */
	public int addUniversity(String school, String state, String location, String control,
            int numberOfStudents, double percentFemales, double SATVerbal, double SATMath,
            double expenses, double percentFinancialAid, int numberOfApplicants,
            double percentAdmitted, double percentEnrolled, int academicsScale,
            int socialScale, int qualityOfLifeScale) {
		int passed = database.university_addUniversity(school, state, location,control, numberOfStudents,
				percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants,
				percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
		if (passed != -1)
			passed = 1;
		return passed;
    }
	
	/**
     * When called, this method tells the database to add a new emphasis area
     * for the specified school. Nothing happens if an invalid school name is
     * specified or if the specified emphasis already exists for the specified
     * school
     *
     * @param school a String containing the name of the school for which the
     * new emphasis area is being added
     * @param emphasis a String containing the new emphasis to be added to the
     * specified school
     */
	public int addUniversityEmphasis(String school, String emphasis) {
    	int passed = database.university_addUniversityEmphasis(school,emphasis);
    	return passed;

    }
	
    /**
	 * Changes fields of a given university to the given parameters
	 * @param school
	 * @param state
	 * @param location
	 * @param control
	 * @param numberOfStudents
	 * @param percentFemales
	 * @param SATVerbal
	 * @param SATMath
	 * @param expenses
	 * @param percentFinancialAid
	 * @param numberOfApplicants
	 * @param percentAdmitted
	 * @param percentEnrolled
	 * @param academicsScale
	 * @param socialScale
	 * @param qualityOfLifeScale
	 */
	public int editUniversity(String school, String state, String location,
			  String control, int numberOfStudents, double percentFemales,
			  double SATVerbal, double SATMath, double expenses, double percentFinancialAid,
			  int numberOfApplicants, double percentAdmitted, double percentEnrolled,
			  int academicsScale, int socialScale, int qualityOfLifeScale) {
		 int passed = database.university_editUniversity(school, state, location, control, numberOfStudents,
				 percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants,
				 percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
		 return passed;
		 
	 }
    
	/**
	 * has the database save the specified school to
     * the user's list of saved schools
	 * @param username name of the user
	 * @param school name of the school to be saved
	 */
	public int addSchool(String username, String school) {
           int passed = database.user_saveSchool(username, school);
           return passed;
       }
    
    
    /**
     * Deactivate by status
     * @param username username of the user to be deactivated
     * @return -1 if failed
     * @return other if operation succeeded
     */
	public int deactivateUser(String username) 
    {
    	Account acc = (Account) getSpecificUser(username);
    	String name = acc.getUsername();
    	String firstName = acc.getFirstName();
    	String lastName = acc.getLastName();
    	String password = acc.getPassword();
    	char type = acc.getType();
    	char status = acc.getStatus();
    	
    	
    	int passed = database.user_editUser(firstName, lastName, username, password, type, status);
    	return passed;
    }
	
	/**
	 * Prints a 2D array of all the users in the database
	 */
	public void getUsers(){
		String[][] users = database.user_getUsers();
		for (int i = 0; i < users.length; i++){
			for (int j = 0; j < users[i].length; j++)
			{
				System.out.print(users[i][j] + ", ");
			}
			System.out.println();
		}
	}
    
    /**
     * Returns a user from the database with the given username
     * @param username
     * @return null if there is no user
     * @return Account type if a user has been found with matching username
     */
	public Account getSpecificUser(String username) {
		Account acc = new Account();
        String[][] users = database.user_getUsers();
        for (int i = 0; i < users.length; i++) {
		    for (int j = 0; j < users[i].length; j++) {
		        if (users[i][j].equals(username)){
		        	//System.out.println(users[i][j] + "\n" + users[i][j-1] +" " + users[i][j-2] + " " + users[i][j+1] + " " +users[i][j+2]);
		        	acc.setUsername(users[i][j]);
		        	//System.out.println(user.getUsername());
		        	acc.setFirstName(users[i][j-2]);
		        	acc.setLastName(users[i][j-1]);
		        	acc.setPassword(users[i][j+1]);
		        	String type = users[i][j+2];
		        	String status = users[i][j+3];
		        	acc.setType(type.charAt(0));
		        	acc.setStatus(status.charAt(0));
		        }
		    }
		}
        return acc;
     
    }
	 
	 /**
	  * 
	  * @param school
	  * @param emphases
	  */
	public void editUniversityEmphases(String school, ArrayList<String> emphases) {
	        
	    }
	 
	 /**
	  * Admin selects to edit a user's information 
	  * @param username
	  * @param firstName
	  * @param lastName
	  * @param password
	  * @param type
	  * @param status
	  * @return -1 if operation failed
	  */
	public void editUser(String username, String firstName, String lastName,
			 					String password, char type, char status) {
	        int passed = database.user_editUser(username, firstName, lastName, password,
	        									type, status);
	        
	    }
	 
	 /**
	  * User selects to edit their own account information
	  * @param username username of the given User
	  * @param firstName first name of the given user
	  * @param lastName last name of the given user
	  * @param password password of the given user
	  * @param type type of user
	  * @param status status of the user
	  */
	public void user_editUserInfo(User user, String username, String firstName, String lastName, String password) {
		User currUser = user;
		if (user != null){
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setUsername(username);
			user.setPassword(password);
			System.out.println("\nUser information updated");
		}
		else
			System.out.println("Edit operation failed");
	        
	    }
	
	/**
	 * Adds a user to the database with the given attributes
	 * @param firstName First name of the user
	 * @param lastName last name of the user
	 * @param username username of the user
	 * @param password password of the user
	 * @param type type of the user
	 */
	public void addUser(String firstName, String lastName, String username,
				String password, char type){
		Account acc = getSpecificUser(username);
		if(acc != null){
			System.out.println("User " + username + " already exists");
		}
		else{
		int passed = database.user_addUser(firstName, lastName, username, password, type);
		if (passed == -1){
			System.out.println("User not added");
		}
		else
			System.out.println("User added");
		}
	}
	 
	 /**
	  * Prints out the information of the given school if found
	  * otherwise prints "School not found"
	  * @param school name of the school to be viewed
	  */
	public ArrayList<String> viewSchool(String school){
		 boolean found = false;
		 ArrayList<String> schoolList = new ArrayList<String>();
		 String[][] schools = database.university_getUniversities();
			for (int i = 0; i < schools.length - 1; i++) {
			    for (int j = 0; j < schools[i].length; j++) {
			        if (schools[i][j].equals(school)){
			        	found = true;
			            schoolList = saveArray(schools, i);
			            for (String s : schoolList){
			            	System.out.println(s);
			            }
			        }
			    }
			}
			if (found != true){
				System.out.println("School not found");
			}
			
			return schoolList;
	 }
	 
	public ArrayList<String> saveArray(String[][] array, int row) {
		ArrayList<String>schools = new ArrayList<String>();
		    for(int i = 0; i < array[row].length; i++)
		        schools.add(array[row][i]);
		    	
		   return schools;
		}
	
	public void printArraySchool(ArrayList<String> school){
		for (String s: school){
			System.out.println(s);
		}
	}
	 
	/**
	 * Prints user's current saved schools
	 * @param username username of the user
	 */
	public ArrayList<String> viewSavedSchools(String username){
		boolean found = false;
		ArrayList<String> schools = new ArrayList<String>();
		String[][] usersSavedSchools = database.user_getUsernamesWithSavedSchools();
		for (int i = 0; i < usersSavedSchools.length - 1; i++) {
		    for (int j = 0; j < usersSavedSchools[i].length; j++) {
		    		if (usersSavedSchools[i][j].equals(username))
		    		{
		    			found = true;
		    			schools = saveArray(usersSavedSchools, i);
		    			printArraySchool(schools);
		    		}
		    	}
		    
		    }
		if (found != true){
			System.out.println("Nothing to display");
		}
		return schools;
		
	}
	 
	 
	 /**
	  * Removes given school from the given user's list of favorite schools
	  * @param username
	  * @param school
	  * @return -1 if failed
	  */
	public int removeSchool(String username, String school) {
		int passed = database.user_removeSchool(username, school);
		return passed;
	}
	
	/**
	 * Prints all the schools in the database library
	 */
	public void viewAllSchools(){
		String[][] unis = database.university_getUniversities();
		for (int i = 0; i < unis.length - 1; i++) {
		    for (int j = 0; j < unis[i].length; j++) {
		    		System.out.print(unis[i][j] + ", ");
		    	}
		    System.out.println();
		    }
	}
	
	/**
	 * Returns a 2D array of schools
	 */
	public String[][] getAllSchools(){
		String[][]schools = database.university_getUniversities();
		
		return schools;
	
	}
	
	public int deleteUniversity(String school){
		int passed = database.university_deleteUniversity(school);
		return passed;
	}
	 
}