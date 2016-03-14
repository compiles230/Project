package Project;

/**
 * 
 */

/**
 * @author hgmurphey
 *
 */
public class AccountController {
	
	private User user;
	private Admin admin;
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
	
	
	public void viewUsers(){
		dbc.getUsers();
		
	}
	
	/**
	 * Edit method used by the Admin
	 * @param username
	 * @param firstName
	 * @param lastName
	 * @param password
	 * @param type
	 * @param status
	 */
	public void editUser(String username, String firstName, String lastName, String password,
						char type, char status){
		dbc.editUser(username, firstName, lastName, password, type, status);
		
	}
	
	public void addUser(String username, String firstName, String lastName, String password,
			char type){
		dbc.addUser(firstName, lastName, username, password, type);
	}
	
	public User verifyUser(String username, String password){
		User user = dbc.getSpecificUser(username);
		return user;
		
	}
	
	public boolean logOn(String username, String password){
		User user = verifyUser(username, password);
		boolean logOn = false;
		if (user != null){
			if (password.equals(user.getPassword())){
				user.logOn();
				logOn = true;
			}
			else
				logOn = false;
			
		}
		else
			logOn = false;
		return logOn;
	}

	public boolean deactivateUser(String username) {
		user = dbc.getSpecificUser(username);
		if (user != null){
			user.setStatus('N');
			return true;
		}
		else{
			return false;
		}
		
		
	}

}
