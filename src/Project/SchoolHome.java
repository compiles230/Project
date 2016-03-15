package Project;
/**
 * File: schoolHome.java
 * @author Ellen Stensrud
 * @version March 3, 2016
 *
 */
public class SchoolHome {
	
	/**
	 * 
	 */
	private School school;
	private DatabaseController dBCont; 
	//private SearchController searchCont;
	
	public SchoolHome() {
		School school = new School();
		DatabaseController dBCont = new DatabaseController();
		//SearchController searchCont = new SearchController();
	}

	//public SchoolHome(DatabaseController dBCont,
	//SearchController searchCont)
	
	public SchoolHome(DatabaseController dBCont) {
		this.school = null;
		this.dBCont = dBCont;
		//this.searchCont = searchCont;
	}


	/**
	 * 
	 * @param schoolName
	 * @param state
	 * @param location
	 * @param control
	 * @param numberOfStudents
	 * @param femalePercentage
	 * @param satVerbal
	 * @param satMath
	 * @param expenses
	 * @param financialAid
	 * @param numberOfApplicants
	 * @param admitted
	 * @param enrolled
	 * @param academicsScale
	 * @param socialScale
	 * @param qualityOfLife
	 * @param emphases
	 * @return
	 */
	public School searchSchoolByFill(String schoolName, String state, String location,
			  String control, int numberOfStudents, double percentFemales,
			  double SATVerbal, double SATMath, double expenses, double percentFinancialAid,
			  int numberOfApplicants, double percentAdmitted, double percentEnrolled,
			  int academicsScale, int socialScale, int qualityOfLifeScale) {
		return null;
	}
	
	public void saveSchool(String username, String school){
		dBCont.addSchool(username, school);
	}
	
	/**
	 * Method removes given school from a given user's list of saved schools
	 * @param username Username of user who wishes to remove the school
	 * @param school Name of the school to be removed
	 */
	public void removeSchool(String username, String school){
		dBCont.removeSchool(username, school);
	}

	
	/**
	 * Prints a given school's information
	 * @param schoolname Name of school to be viewed
	 */
	public void viewSchool(String schoolname){
		dBCont.viewSchool(schoolname);
	}
	
	/**
	 * View a given user's list of saved schools
	 * @param username name of user
	 */
	public void viewSavedSchools(String username){
		dBCont.viewSavedSchools(username);
	}
	
	public void printArray(String[][] array, int row) {
	    for(int i = 0; i < array.length; i++)
	        System.out.println(array[row][i] + " ");
	}
	/**
	 * Adds a university to the DBLibrary's list of schools
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
		dBCont.addUniversity(schoolName, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses,
							percentFinancialAid, numberOfApplicants, percentAdmitted,
							percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
	}
	
	/**
	 * Edits the information of a given university
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
	 * @return true if operation succeeded, false if it failed
	 */
	public boolean editUnivesity(String schoolName, String state, String location,
			  String control, int numberOfStudents, double percentFemales,
			  double SATVerbal, double SATMath, double expenses, double percentFinancialAid,
			  int numberOfApplicants, double percentAdmitted, double percentEnrolled,
			  int academicsScale, int socialScale, int qualityOfLifeScale){
	 int pass = dBCont.editUniversity(schoolName, state, location, control, numberOfStudents, percentFemales,
			 						SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants,
			 						percentAdmitted, percentEnrolled, academicsScale,
			 						socialScale, qualityOfLifeScale);
	 if (pass == -1)
		 return false;
	 else
		 return true;
	}
	
	/**
	 * Method that prints out all of the schools in the database
	 */
	public void viewAllSchools(){
		dBCont.viewAllSchools();
	}
	
}
