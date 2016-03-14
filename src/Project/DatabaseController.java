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
	 * getUniversities()
	 */
	/**
	 * 
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
	public void addUniversity(String school, String state, String location, String control,
            int numberOfStudents, double percentFemales, double SATVerbal, double SATMath,
            double expenses, double percentFinancialAid, int numberOfApplicants,
            double percentAdmitted, double percentEnrolled, int academicsScale,
            int socialScale, int qualityOfLifeScale) {
		int passed = database.university_addUniversity(school, state, location,control, numberOfStudents,
				percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants,
				percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
        if (passed == -1){
        	System.out.println("Add operation failed");
        }
        System.out.println("Add operation successful");

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
	 * 
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
     * the user's list of saved schools. Nothing happens if an invalid user Id
     * is specified or if the specified school is already in user's list of
     * saved schools
     *
     * @param Id 
     * @param school a String containing the school to be saved to the user's
     * list of saved schools
     * @return true if the specified school was successfully added to the user's
     * list of saved schools or false otherwise
     * @return true
     */
	public boolean addSchool(int id, String school) {
            boolean chooser = true;
            TreeMap<Integer, ArrayList<String>> list1 = getSavedSchools();
            ArrayList<String> savedSchools1 = list1.get(id);
            if(savedSchools1 != null){
            for (int j = 0; j < savedSchools1.size(); j++) {
                if (savedSchools1.get(j).equals(school)) {
                    chooser = false;
                } 
            }
          }
			return chooser;
       }
    
    
    /**
     * Deactivate by status
     * @param username
     */
	public int deactivateUser(String username) 
    {
    	User user = getSpecificUser(username);
    	String name = user.getUsername();
    	String firstName = user.getFirstName();
    	String lastName = user.getLastName();
    	String password = user.getPassword();
    	char type = user.getType();
    	char status = user.getStatus();
    	
    	
    	int passed = database.user_editUser(firstName, lastName, username, password, type, status);
    	return passed;
    }
    
    /**
     * 
     * @param username
     * @return
     */
	public User getSpecificUser(String username) {
		User user = null;
        String[][] users = database.user_getUsers();
        for (int i = 0; i < users.length; i++) {
		    for (int j = 0; j < users[i].length; j++) {
		        if (users[i][j].equals(username)){
		        	user.setUsername(users[i][j]);
		        	user.setFirstName(users[i][j-2]);
		        	user.setLastName(users[i][j-1]);
		        	user.setPassword(users[i][j+1]);
		        	String type = users[i][j+2];
		        	String status = users[i][j+3];
		        	user.setType(type.charAt(0));
		        	user.setStatus(status.charAt(0));
		        }
		    }
		}
        return user;
     
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
	public int editUser(String username, String firstName, String lastName,
			 					String password, char type, char status) {
	        int passed = database.user_editUser(username, firstName, lastName, password,
	        									type, status);
	        return passed;
	    }
	 
	 /**
	  * User selects to edit their own account information
	  * @param username
	  * @param firstName
	  * @param lastName
	  * @param password
	  * @param type
	  * @param status
	  */
	public void user_editUserInfo(String username, String firstName, String lastName, String password) {
		User user = getSpecificUser(username);
		if (user != null){
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setUsername(username);
			user.setPassword(password);
			System.out.println("User information updated");
		}
		else
			System.out.println("Edit operation failed");
	        
	    }
	 
	 /**
	  * Prints out the information of the given school if found
	  * otherwise prints "School not found"
	  * @param school
	  */
	public void viewSchool(String school){
		 boolean found = false;
		 String[][] schools = database.university_getUniversities();
			for (int i = 0; i < schools.length; i++) {
			    for (int j = 0; j < schools[i].length; j++) {
			        if (schools[i][j].equals(school)){
			        	found = true;
			            printArray(schools, i);
			        }
			    }
			}
			if (found != true){
				System.out.println("School not found");
			}
	 }
	 
	public void printArray(String[][] array, int row) {
		    for(int i = 0; i < array.length; i++)
		        System.out.println(array[row][i] + " ");
		}
	 
	 /**
	  * 
	  * @return
	  */
	public TreeMap<Integer, ArrayList<String>> getSavedSchools() {
	        TreeMap<Integer, ArrayList<String>> savedSchoolMap = new TreeMap();
	        ArrayList<String> valueMap = new ArrayList<String>();
	        String[][] temp = null;
	        int temp2 = new Integer(temp[0][0]); //gets the ID of the first entry
	        for (int i = 0; i < temp.length; i++) {

	            if (temp2 != new Integer(temp[i][0])) { //compares the next ID with the previous one
	                valueMap = new ArrayList<String>(); //clears the ArrayList if new person
	            }

	            temp2 = new Integer(temp[i][0]);
	            for (int j = 0; j < temp[i].length; j = j + 2) {
	                valueMap.add(temp[i][j + 1]);
	                savedSchoolMap.put(new Integer(temp[i][j]), valueMap);
	            }
	        }
	        return savedSchoolMap;
	 }
	 
	 
	 /**
	  * Removes given school from the given user's list of favorite schools
	  * @param username
	  * @param school
	  */
	public void removeSchool(String username, String school) {
		int passed = database.user_removeSchool(username, school);
		if (passed == -1){
			System.out.println("Remove school operation failed");
		}
		else
		System.out.println(school + "removed from " + username +"'s list");
	      
	    }
	 
}