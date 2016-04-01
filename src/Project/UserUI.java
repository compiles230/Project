package Project;

import java.util.ArrayList;

/**
 *UserUI.java 
 */

/**
 * User Interface for account of type User
 * @author Kenzie Flickinger
 * @version 7 March 2016 
 */
public class UserUI {
	/**
	 * Instance of AccountController
	 */
	private AccountController accCont;
	
	/**
	 * Instance of UserController
	 */
	private UserController userCont;
	
	/**
	 * Instance of SchoolHome
	 */
	private SchoolHome schoolHome;
	
	/**
	 * Instance of User
	 */
	private User user;
	
	/**
	 * Default constructor
	 */
	public UserUI(){
		this.accCont = null;
		this.userCont = null;
		this.schoolHome = null;
		this.user = null;
	}
	
	/**
	 * Constructor with given parameters
	 * @param accCont
	 * @param userCont
	 * @param schoolHome
	 */
	public UserUI(AccountController accCont, UserController userCont, SchoolHome schoolHome, User user) {

		this.accCont = accCont;
		this.userCont = userCont;
		this.schoolHome = schoolHome;
		this.user = user;
	}
	
	/**
	 * Logs on a user
	 * @param username username of the user
	 * @param password password of the user
	 */
	public void LogOn(String username, String password){
		
		boolean logOn = accCont.logOn(username, password);
		if (logOn == true){
			user.logOn();
			System.out.println("Log on successful");
		}
		else
			System.out.println("Log on unsuccessful, try again");
	}
	
	/**
	 * This method allows user to edit their profile information 
	 * such as username, first name, last name, and password
	 * @param username
	 * @param password
	 */
	public void editProfile(String username, String firstName, String lastName, String password){
		userCont.editProfile(user, username, firstName, lastName, password);
	}
	
	/**
	 * View the current user's information
	 */
	public void viewProfile(){
		System.out.println(this.user);
		
	}
	
	/**
	 * This method allows user to log out of account
	 */
	public void logOut(){
		
		boolean logOut = accCont.logOut(user);
		if (logOut){
			user.logOff();
			System.out.println("Log out successful");
		}
		else
			System.out.println("Log out unsuccessful, try again");
		
	}
	
	//****** INCOMPLETE ******//
	/**
	 * This method allows user to search for a school by schoolname
	 * @param schoolname
	 */
	public void search(String schoolname){
		
	}
	
	
	//****** INCOMPLETE ******//
	/**
	 * Method allows user to search for school by an emphasis
	 * @param schoolName
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
	public void searchByEmphasis(String schoolName, String state, String location,
			  String control, int numberOfStudents, double percentFemales,
			  double SATVerbal, double SATMath, double expenses, double percentFinancialAid,
			  int numberOfApplicants, double percentAdmitted, double percentEnrolled,
			  int academicsScale, int socialScale, int qualityOfLifeScale){
		
	}
	
	
	/**
	 * Views a specific school
	 * @param schoolname name of school to be viewed
	 */
	public void viewSchool(String schoolname){
		schoolHome.viewSchool(schoolname);
	}
	
	/**
	 * View user's list of saved schools
	 */
	public ArrayList<String> viewSavedSchools(){
		ArrayList<String> schools = schoolHome.viewSavedSchools(user.getUsername());
		return schools;
	}
	
	/**
	 * User selects to save a school to their saved school list
	 * @param school name of the school to be saved
	 */
	public void saveSchool(String school){
		String username = user.getUsername();
		schoolHome.saveSchool(username, school);
	}
	

	
	/**
	 * User selects to remove school from their saved school list
	 * @param school name of school to be removed
	 */
	public void removeSchool(String school){
		String username = user.getUsername();
		schoolHome.removeSchool(username, school);
	}
	
}
