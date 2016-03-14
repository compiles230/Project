package Project;

/**
 * 
 */

/**
 * @author hgmurphey
 *
 */
public class AccountController {
	/**
	 * Variable of DatabaseController
	 */
	private DatabaseController dbc;
	/**
	 * 
	 */
	public AccountController() {
		// TODO Auto-generated constructor stub
		this.dbc = null;
	}
	
	public AccountController(DatabaseController dbc){
		this.dbc = dbc;
	}
	
	public Admin createAdmin(){
		Admin newAdmin = new Admin();
		return newAdmin;
	}
	
	public boolean isValidUser(Account acc){
		
		return false;
	}
	
	public void viewUsers(){
		
	}
	
	public void editUser(String username, String firstName, String lastName, String password,
						char type, char status){
		
	}

}
