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
	
	/**
	 * Method removes given school from a given user's list of saved schools
	 * @param username Username of user who wishes to remove the school
	 * @param school Name of the school to be removed
	 */
	public void removeSchool(String username, String school){
		dBCont.removeSchool(username, school);
		System.out.println(school + "has been removed.");
	}
	
	//private void viewSchool(School school, String schoolName, int rowLength, int colLength){
		//String [][] schoolList = dBCont.getUniversities();
		//for (int i = 0; i < rowLength; i++) {
		 //   for (int j = 0; j < colLength; j++) {
		  //      if (schoolList[i][j].equals(schoolName))
		 //           printArray(schoolList, i);
		 //   }
		//}
		//System.out.println(school);
		
	//}
	/**
	 * Prints a given school's information
	 * @param schoolname Name of school to be viewed
	 */
	public void viewSchool(String schoolname){
		dBCont.viewSchool(schoolname);
	}
	
	public void printArray(String[][] array, int row) {
	    for(int i = 0; i < array.length; i++)
	        System.out.println(array[row][i] + " ");
	}
	    
	//public void editUniversity(School school, int rowLength, int colLength){
		// String [][] schoolList = dBCont.getUniversities();
		// for (int i = 0; i < rowLength; i++) {
		//    for (int j = 0; j < colLength; j++) {
		//        if (schoolList[i][j].equals(schoolName))
		 //           printArray(schoolList, i);
		   // }
	//	}
		// System.out.println(school);

	//}
	
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
	
}
