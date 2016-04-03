/**
 * CMCBasicDriver.java
 */
import Project.*;
import dblibrary.project.csci230.*;
/**
 * @author hgmurphey
 *
 */
public class CMCBasicDriver {

	public CMCBasicDriver() {
	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		UniversityDBLibrary db = new UniversityDBLibrary("andyetitco","andyetitco","ehk3");
		DatabaseController dbc = new DatabaseController(db);
		SchoolHome sh = new SchoolHome(dbc);
		Admin admin = new Admin("Noreen","Admin","nadmin","admin",'a','Y');
		User user = new User("John","User","juser","user",'u','Y');
		AccountController acc = new AccountController(dbc);
		UserController uc = new UserController(dbc);
		AdminController adc = new AdminController(acc, sh, dbc);
		AdminUI adminUI = new AdminUI(acc, sh, admin);
		UserUI userUI = new UserUI(acc, uc, sh, user);
		
		System.out.println("******************************* ADMIN FUNCTIONS *******************************");
		System.out.println("USE CASE 1: LOG ON ADMIN *******************************");
		adminUI.LogOn("nadmin","admin");
		
		
		System.out.println("\n\n******************************* USE CASE 6: VIEW SCHOOL (ADELPHI) *******************************\n\n");
		adminUI.viewSchool("ADELPHI");
		
		System.out.println("\n\n******************************* USE CASE 11: ADD SCHOOL (DEMO UNIVERSITY,x,x,x,1,1.1,1.2,1.3,1.4,1.5,1,1.6,1.7,1,1,1) *******************************\n\n");
		adminUI.createSchool("DEMO UNIVERSITY","x","x","x",1,1.1,1.2,1.3,1.4,1.5,1,1.6,1.7,1,1,1,"COMPUER SCIENCE");
		adminUI.viewSchool("DEMO UNIVERSITY");
		
		/**System.out.println("\n\n******************************* USE CASE 10: EDIT SCHOOL (DEMO UNIVERSITY,EDIT,EDIT,EDIT,1,1.1,1.2,1.3,1.4,1.5,1,1.6,1.7,1,1,1) *******************************\n\n");
		adminUI.editUniversity("DEMO UNIVERSITY","EDIT","EDIT","EDIT",1,1.1,1.2,1.3,1.4,1.5,1,1.6,1.7,1,1,1);
		adminUI.viewSchool("DEMO UNIVERSITY");
		adminUI.editUniversity("DEMO UNIVERSITY","x","x","x",1,1.1,1.2,1.3,1.4,1.5,1,1.6,1.7,1,1,1);*/
		

		System.out.println("\n\n******************************* USE CASE 16: VIEW ALL USERS *******************************\n\n");
		adminUI.viewUsers();
		
		System.out.println("\n\n******************************* USE CASE 12: EDIT USER (luser,Lynn,User,user,a,Y)  *******************************\n\n");
		adminUI.editUser("luser","Lynn","UserXX","user",'a','Y');
		adminUI.viewUsers();
		
		System.out.println("\n\n******************************* USE CASE 13: DEACTIVATE USER (luser)  *******************************\n\n");
		adminUI.deactivateUser("luser");
		System.out.println("\n");
		adminUI.viewUsers();
		
		
		System.out.println("\n\n******************************* USE CASE 14: ADD USER (Haylie, Murphey, hgmurphey, 1234, 'u')  *******************************\n\n");
		adminUI.addUser("Kenzie", "F", "kflick", "1234", 'u');
		adminUI.viewUsers();
		
		System.out.println("\n\n******************************* USE CASE 15: VIEW ALL SCHOOLS *******************************");
		adminUI.viewAllSchools();
		
		System.out.println("\n\n******************************* USE CASE 18: LOG OUT  *******************************\n\n");
		adminUI.LogOut();
		
		System.out.println("\n\n******************************* USER FUNCTIONS *******************************");
		System.out.println("\n\n******************************* USE CASE 1: LOG ON USER *******************************");
		userUI.LogOn("juser","user");
		
		System.out.println("\n\n******************************* USE CASE 8: VIEW PROFILE *******************************");
		userUI.viewProfile();
		
		System.out.println("\n\n******************************* USE CASE 5: SAVE SCHOOL (juser AUBURN)*******************************");
		userUI.saveSchool("AUBURN");
		userUI.saveSchool("BARD");
		userUI.saveSchool("BARUCH");
		userUI.viewSavedSchools();

		
		System.out.println("\n\n******************************* USE CASE 17: VIEW SAVED SCHOOLS*******************************");
		userUI.viewSavedSchools();
		
		
		System.out.println("\n\n******************************* USE CASE 7: REMOVE SCHOOL (juser AUBURN)*******************************");
		userUI.removeSchool("AUBURN");
		userUI.removeSchool("BARD");
		userUI.removeSchool("BARUCH");
		
		userUI.viewSavedSchools();
		
		
		System.out.println("\n\n******************************* USE CASE 9: EDIT PROFILE (juser, EDITED, EDITED, user)*******************************");
		userUI.editProfile("juser", "EDITED", "EDITED", "user");
		userUI.viewProfile();
		userUI.editProfile("juser", "John", "User", "user");
		System.out.println("\n\n******************************* USE CASE 15: LOG OUT  *******************************\n\n");
		userUI.logOut();
		

	System.out.println("...COMPLETE...");

		
	}
		
		

}
