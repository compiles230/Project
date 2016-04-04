package Project;

import java.util.ArrayList;

/**
 * File: SchoolHome.java
 * @author Ellen Stensrud
 * @version March 3, 2016
 *
 */
public class SchoolHome {
	
	/**
	 * Instance of school
	 */
	private School school;
	
	/**
	 * Instance of DatabaseController
	 */
	private static DatabaseController dBCont; 
	//private SearchController searchCont;
	
	/**
	 * Default constructor
	 */
	public SchoolHome() {
		School school = new School();
		DatabaseController dBCont = new DatabaseController();
		//SearchController searchCont = new SearchController();
	}

	/**
	 * Constructor with given DatabaseController
	 * @param dBCont
	 */
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
	
	
	/**
	 * Saves a given school to a user's list of saved schools
	 * @param username username of the user to add the school to
	 * @param school name of the school to be added
	 */
	public static int saveSchool(String username, String school){
		int passed = dBCont.addSchool(username, school);
		return passed;
				}
	
	/**
	 * Method removes given school from a given user's list of saved schools
	 * @param username Username of user who wishes to remove the school
	 * @param school Name of the school to be removed
	 */
	public static int removeSchool(String username, String school){
		int passed = dBCont.removeSchool(username, school);
		return passed;
	}

	
	/**
	 * Prints a given school's information
	 * @param schoolname Name of school to be viewed
	 */
	public ArrayList<String> viewSchool(String schoolname){
		return dBCont.viewSchool(schoolname);
	}
	
	/**
	 * View a given user's list of saved schools
	 * @param username name of user
	 */
	public static ArrayList<String> viewSavedSchools(String username){
		ArrayList<String> schools = dBCont.viewSavedSchools(username);
		return schools;
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
	public int addUniversity(String schoolName, String state, String location,
			  String control, int numberOfStudents, double percentFemales,
			  double SATVerbal, double SATMath, double expenses, double percentFinancialAid,
			  int numberOfApplicants, double percentAdmitted, double percentEnrolled,
			  int academicsScale, int socialScale, int qualityOfLifeScale){
		int pass = dBCont.addUniversity(schoolName, state, location, control, numberOfStudents, percentFemales, SATVerbal, SATMath, expenses,
							percentFinancialAid, numberOfApplicants, percentAdmitted,
							percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
		return pass;
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
	public boolean editUniversity(String schoolName, String state, String location,
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
	
	public int deleteUniversity(String school){
		int passed = dBCont.deleteUniversity(school);
		return passed;
	}
	
	
}
