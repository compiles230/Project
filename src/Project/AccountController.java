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
	private Account account;
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
	
	public Account verifyUser(String username, String password){
		Account user = (Account) dbc.getSpecificUser(username);
		return user;
		
	}
	
	public boolean logOn(String username, String password){
		Account user = (Account) verifyUser(username, password);
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
	
	public boolean logOut(Account account){
		boolean logOff = false;
		if (account.isLoggedOn() == true){	
			account.logOff();
			logOff = true;
		}
		
		return logOff;
	}

	public boolean deactivateUser(String username) {
		this.account = dbc.getSpecificUser(username);
		if (account != null){
			dbc.editUser(username, account.getFirstName(), account.getLastName(), account.getPassword(),
					account.getType(), 'N');
			return true;
		}
		else{
			return false;
		}
		
		
	}

}
