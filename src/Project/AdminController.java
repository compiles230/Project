package Project;

/**
 * AdminController.java
 */

/**
 *  AdminController handles functions that an Admin may use
 *  Calls upon SchoolHome and the DataBaseController
 *  @author Haylie Murphey
 *  @version March 4, 2016
 */
public class AdminController {
	
	/**
	 * An instance of AccountController
	 */
	private AccountController accCont;
	
	/**
	 * An instance of SchoolHome
	 */
	private SchoolHome schHome;
	
	/**
	 * An instance of DatabaseController
	 */
	private DatabaseController DBCont;
	

	/**
	 * Default constructor for AdminController
	 */
	public AdminController() {
		AccountController accCont = null;
		SchoolHome schHome = null;
		DatabaseController DBCont = new DatabaseController();
		
	}


	/**
	 * Constructor for AdminController with given parameters
	 * @param accCont the AccountController
	 * @param schHome the SchoolHome
	 * @param dBCont the DatabaseController
	 */
	public AdminController(AccountController accCont, SchoolHome schHome, DatabaseController dBCont) {
		super();
		this.accCont = accCont;
		this.schHome = schHome;
		this.DBCont = dBCont;
	}
	
	
	/**
	 * Edits a the fields of a given university
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
	 * @return
	 */
	public boolean editUniversity(String schoolName, String state, String location,
			  String control, int numberOfStudents, double percentFemales,
			  double SATVerbal, double SATMath, double expenses, double percentFinancialAid,
			  int numberOfApplicants, double percentAdmitted, double percentEnrolled,
			  int academicsScale, int socialScale, int qualityOfLifeScale){
		return schHome.editUnivesity(schoolName, state, location, control, numberOfStudents,
									percentFemales, SATVerbal, SATMath, expenses, percentFinancialAid,
									numberOfApplicants, percentAdmitted, percentEnrolled, academicsScale,
									socialScale, qualityOfLifeScale);
		
		
		
	}
	
	/**
	 * Adds a university to the database
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
		
		schHome.addUniversity(schoolName, state, location, control, numberOfStudents,
									percentFemales, SATVerbal, SATMath, expenses,
									percentFinancialAid, numberOfApplicants, percentAdmitted,
									percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
	}
	
	
	

}
