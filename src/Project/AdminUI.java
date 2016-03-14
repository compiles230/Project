package Project;

/**
 * 
 */

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
	public AdminUI(AdminController adminCont, AccountController accCont) {
		this.adminCont = adminCont;
		this.accCont = accCont;
	}

	/**
	 * Admin selects to edit a university
	 */
	public void editUniversity(String schoolName, String state, String location,
							  String control, int numberOfStudents, double percentFemales,
							  double SATVerbal, double SATMath, double expenses, double percentFinancialAid,
							  int numberOfApplicants, double percentAdmitted, double percentEnrolled,
							  int academicsScale, int socialScale, int qualityOfLifeScale){
		adminCont.editUniversity(schoolName, state, location, control, numberOfStudents, percentFemales,
								 SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants,
								 percentAdmitted, percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
		
	}
	
	/**
	 * Admin selects to add a university
	 * 
	 */
	public void addUniversity(String schoolName, String state, String location,
			  String control, int numberOfStudents, double percentFemales,
			  double SATVerbal, double SATMath, double expenses, double percentFinancialAid,
			  int numberOfApplicants, double percentAdmitted, double percentEnrolled,
			  int academicsScale, int socialScale, int qualityOfLifeScale){

	}
	
	/**
	 * Admin selects to view users
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
		accCont.editUser(username, firstName, lastName, password, type, status)
		
		
	}
	
	/**
	 * Admin selects to deactivate user
	 * @param username Name of user to be deactivated
	 */
	public void deactivateUser(String username){
		accCont.deactivateUsers();
		
	}
	
	/**
	 * Admin selects to add a user
	 */
	public void addUser(String first, String last, String username, String password
						char type, char status){
		accCont.; 
		
		
	}
	
	/**
	 * Admin selects to create a school with the given parameters
	 */
	public School createSchool(String schoolname, String state, String location,
			String control, int numberOfStudents, double percentFemale,
							double SATVerbal, double SATMath, double exepenses,
							double percentFinancialAid, int numOfApplicants,
							double percentAdmitted, double percentEnrolled,
							int academicScale, int socialScale, int qualityOfLifeScale,
							String emphases){
		return null;
		//
	}
	
	public void confirmDeactivateUser(String confirm){
		
	}
	
	public void confirmCancelEditUni(String confirm){
		
	}
	public void confirmCancelEditUser(String confirm){
		
	}
	
	public boolean LogOn(String username, String password){
		accCont.logOn();
	}
	
}
