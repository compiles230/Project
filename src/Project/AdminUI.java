/**
 * AdminUI.java
 */
package Project;

/**
 * The User Interface for Administrators of CMC
 * Provides a basic layout of what an Admin can do, calls upon AdminController
 * and AccountController to carry out functions.
 * @author Haylie Murphey
 * @version March 3, 2016
 */
public class AdminUI {
	
	/**
	 * The admin using this UI
	 */
	private Admin admin;
	
	/**
	 * Instance of an AdminController
	 */
	private AdminController adminCont;
	
	/**
	 * Instance of AccountController
	 */
	private AccountController accCont;
	
	/**
	 * Instance of SchoolHome
	 */
	private SchoolHome sch;
	
	
	/**
	 * Default constructor for AdminUI
	 */
	public AdminUI() {
		admin = null;
		adminCont = null;
		accCont = null;
	}
	
	/**
	 * Constructor for AdminUi with given parameters
	 * @param adminCont given AdminController
	 * @param accCont given AccountController
	 */
	public AdminUI( AccountController accCont, SchoolHome sch, Admin ad) {
		this.accCont = accCont;
		this.sch = sch;
		this.admin = ad;
	}

	/**
	 * Admin selects to edit a university
	 */
	public void editUniversity(String schoolName, String state, String location,
							  String control, int numberOfStudents, double percentFemales,
							  double SATVerbal, double SATMath, double expenses, double percentFinancialAid,
							  int numberOfApplicants, double percentAdmitted, double percentEnrolled,
							  int academicsScale, int socialScale, int qualityOfLifeScale){
		sch.editUniversity(schoolName, state, location, control, numberOfStudents, percentFemales,
								 SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants,
								 percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
		
	}
	
/**
 * Admin selects to add a university to the database with the given parameters
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
	public void addUniversity(String schoolName, String state, String location,
			  String control, int numberOfStudents, double percentFemales,
			  double SATVerbal, double SATMath, double expenses, double percentFinancialAid,
			  int numberOfApplicants, double percentAdmitted, double percentEnrolled,
			  int academicsScale, int socialScale, int qualityOfLifeScale){

	}
	
	
	/**
	 * Admin selects to view users in the database
	 */
	
	public void viewUsers(){
		accCont.viewUsers();
	}
	
	/**
	 * Admin selects to edit a user's information
	 * @param username
	 * @param firstName
	 * @param lastName
	 * @param password
	 * @param typer
	 * @param status
	 */
	public void editUser(String username, String firstName, String lastName, String password,
							char type, char status){
		accCont.editUser(username, firstName, lastName, password, type, status);
		
		
	}
	
	/**
	 * Admin selects to deactivate user
	 * @param username Name of user to be deactivated
	 */
	public void deactivateUser(String username){
		boolean deactivate = accCont.deactivateUser(username);
		if (deactivate){
			System.out.println(username + " has been deactivated");
		}
		else
			System.out.println("Deactivation unsuccessfull");
		
	}
	
/**
 * Admin creates a new user to be added to the database, with the given attributes
 * @param first First name of user
 * @param last Last name of user
 * @param username Username of user
 * @param password password of user
 * @param type type of user (admin or user)
 */
	public void addUser(String first, String last, String username, String password,
						char type){
		accCont.addUser(username, first, last, password, type);
		
		
	}
	
	/**
	 * Admin creates a school with the given attributes
	 * @param schoolname
	 * @param state
	 * @param location
	 * @param control
	 * @param numberOfStudents
	 * @param percentFemale
	 * @param SATVerbal
	 * @param SATMath
	 * @param expenses
	 * @param percentFinancialAid
	 * @param numOfApplicants
	 * @param percentAdmitted
	 * @param percentEnrolled
	 * @param academicScale
	 * @param socialScale
	 * @param qualityOfLifeScale
	 * @param emphases
	 */
	public void createSchool(String schoolname, String state, String location,
			String control, int numberOfStudents, double percentFemale,
							double SATVerbal, double SATMath, double expenses,
							double percentFinancialAid, int numOfApplicants,
							double percentAdmitted, double percentEnrolled,
							int academicScale, int socialScale, int qualityOfLifeScale,
							String emphases){
		sch.addUniversity(schoolname, state, location, control, numberOfStudents, percentFemale,
						SATVerbal, SATMath, expenses, percentFinancialAid, numOfApplicants, percentAdmitted,
						percentEnrolled, academicScale, socialScale, qualityOfLifeScale);
		//
	}
	
	/**
	 * Admin log on function
	 * @param username username of admin
	 * @param password password of admin
	 */
	public String LogOn(String username, String password){
		
		boolean logOn = accCont.logOn(username, password);
		if (logOn){
			admin.logOn();
			return "Log on successful";
		}
		else
			return "Log on unsuccessful, try again";
	}
	
	public String LogOut(){
		boolean logOut = accCont.logOut((Account)admin);
		if (logOut){
			return this.admin.getUsername() + " has logged out";
		}
		else
			return "Log out failed";
		
	}
	
	/**
	 * Prints the information of the given school
	 * @param schoolname name of the school to be viewed.
	 */
	public void viewSchool(String schoolname){
		sch.viewSchool(schoolname);
	
	}
	
	/**
	 * Method that will print a list of all the schools in the database
	 */
	public void viewAllSchools(){
		sch.viewAllSchools();
	}
	
	//**** INCOMPLETE *****
	public boolean confirmDeactivateUser(String confirm){
		if (confirm.equals("y")){
			return true;
		}
		else
			return false;

	}
	
	public boolean confirmCancelEditUni(String confirm){
		if (confirm.equals("y")){
			return true;
		}
		else
			return false;
		
	}
	public boolean confirmCancelEditUser(String confirm){
		if (confirm.equals("y")){
			return true;
		}
		else
			return false;
		
	}
	
	
}
