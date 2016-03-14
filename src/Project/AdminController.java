package Project;

/**
 * 
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
		// TODO Auto-generated constructor stub
		//These might actually be null not instantiated
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
