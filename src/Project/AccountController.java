/**
 * AccountController.java
 */

package Project;


/**
 * AccountController class that handles majority of the account based methods
 * @author Haylie Murphey and MacKenzie Flickinger
 * @version 5 March 2016
 *
 */
public class AccountController {
	
	/**
	 * Instance of User
	 */
	private User user;
	
	/**
	 * Instance of Admin
	 */
	private Admin admin;
	
	/**
	 * Instance of Account
	 */
	private Account account;
	
	/**
	 * Variable of DatabaseController
	 */
	private static DatabaseController dbc;
	/**
	 * Default AccountController0
	 */
	public AccountController() {
		// TODO Auto-generated constructor stub
		this.dbc = null;
	}
	
	/**
	 * Constructor with given DatabaseController
	 * @param dbc
	 */
	public AccountController(DatabaseController dbc){
		this.dbc = dbc;
	}

	public Admin createAdmin(){
		Admin newAdmin = new Admin();
		return newAdmin;
	}
	
/**
 * Method that calls on the DatabaseController to print all the users	
 */
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
	
	/**
	 * Calls on DatabaseController method to create a new user with given parameters
	 * @param username username of the new user
	 * @param firstName first name of the new user
	 * @param lastName last name of the new user
	 * @param password password of the new user
	 * @param type type of the new user
	 */
	public void addUser(String username, String firstName, String lastName, String password,
			char type){
		dbc.addUser(firstName, lastName, username, password, type);
	}
	
	/**
	 * Returns an Account from the DatabaseController method .getSpecifiedUser
	 * 
	 * @param username
	 * @param password
	 * @return null if the user does not exist
	 * @return account if the user does exist in the database
	 */
	public static Account verifyUser(String username, String password){
		Account user = (Account) dbc.getSpecificUser(username);
		return user;
		
	}
	
	/**
	 * Logs an Account on by checking that the user exists in the database
	 * @param username
	 * @param password
	 * @return true if log on was successful
	 * @return false if log on failed, either wrong username or password
	 */
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
	
	/**
	 * Logs an Account out by checking if the given account is logged on
	 * @param account
	 * @return true if log off was successful
	 * @return false if log off failed
	 */
	public boolean logOut(Account account){
		boolean logOff = false;
		if (account.isLoggedOn() == true){	
			account.logOff();
			logOff = true;
		}
		
		return logOff;
	}
	
	/**
	 * Deactivates a user by setting its status to 'N'
	 * @param username
	 * @return true if user was successfully deactivated
	 * @return false if deactivation failed
	 */
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
