/**
 * 
 */
package Project;

import static org.junit.Assert.*;

import java.util.ArrayList;
import dblibrary.project.csci230.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author miflickinger
 *
 */
public class UserControllerTest {
	private User user;
	private UserController userCont;
	private DatabaseController dbc;
	private UniversityDBLibrary db;
	private AccountController ac;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
			user = new User("Kenzie","Flickinger","miflickinger","password",'u','Y');
			db = new UniversityDBLibrary("andyetitco","andyetitco","ehk3");
			dbc = new DatabaseController(db);
			userCont = new UserController(dbc);
			ac = new AccountController(dbc);
	}
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		user =  null;
	}
	
	/**
	 * Test method for editProfile;
	 * Tests successful edit of user information by the
	 * user
	 */
	@Test
	public void testEditProfile() {
		System.out.println("Here is editing profile");
		User user = this.user;
		String username = "miflickinger";
		String firstName = "Kenz";
		String lastName = "Flick";
		String password = "helloWorld";
		UserController.editProfile(user,username, firstName, lastName, password);
		System.out.println("");
		assertEquals("First name should now be Kenz", firstName, user.getFirstName());
		assertEquals("Last name should now be Flick", lastName, user.getLastName());
		assertEquals("password should now be helloWorld", password, user.getPassword());
		firstName = "Kenzie";
		lastName = "Flickinger";
		password = "password";
		UserController.editProfile(user, username, firstName, lastName, password);
	}
	
}
