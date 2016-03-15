package Project;
import dblibrary.project.csci230.*;
/**
 * 
 */

/**
 * @author miflickinger
 *
 */
public class UserUI {
	private AccountController accCont;
	private UserController userCont;
	private SchoolHome schoolHome;
	private User user;
	
	/**
	 * 
	 */
	public UserUI(){
		this.accCont = null;
		this.userCont = null;
		this.schoolHome = null;
		this.user = null;
	}
	
	/**
	 * 
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
	 * 
	 * @param username
	 * @param password
	 */
	public void LogOn(String username, String password){
		
		boolean logOn = accCont.logOn(username, password);
		if (logOn){
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
	public void editProfile(String username, String password){
		userCont.editProfile(username, password);
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
		if (logOn){
			System.out.println("Log on successful");
		}
		else
			System.out.println("Log on unsuccessful, try again");
		
	}
	
	/**
	 * This method allows user to search for a school by schoolname
	 * @param schoolname
	 */
	public void search(String schoolname){
		
	}
	
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
	 * 
	 */
	public void viewAllSchools(){
		
	}
	
	/**
	 * 
	 * @param schoolname
	 */
	public void viewSchool(String schoolname){
		schoolHome.viewSchool(schoolname);
	}
	
	/**
	 * 
	 * @param school
	 */
	public void saveSchool(String school){
		String username = user.getUsername();
		schoolHome.saveSchool(username, school);
	}
	
	/**
	 * 
	 */
	public void getSavedSchool(){
		String username = user.getUsername();
		userCont.getSavedSchools(username);
	}
	
	/**
	 * 
	 * @param school
	 */
	public void removeSchool(String school){
		String username = user.getUsername();
		schoolHome.removeSchool(username, school);
	}
	
}
