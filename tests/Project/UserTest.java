package Project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class UserTest {

	
private User user;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		user= new User("Kenzie","Flickinger","miflickinger","password",'u','Y');	
		
	}
	/**
	 * Test method for {@link User#isLoggedOn()}.
	 */
	@Test
	public void testIsLoggedOn() {
		boolean expRes = false;
		boolean res = user.isLoggedOn();
		assertEquals("User is not logged on", expRes, res);
	}

	/**
	 * Test method for {@link User#logOn()}.
	 */
	@Test
	public void testLogOn() {
		boolean expRes = true;
		user.logOn();
		boolean res = user.isLoggedOn();
		assertEquals("User is logged on", expRes, res);
	}

	/**
	 * Test method for {@link User#logOff()}.
	 */
	@Test
	public void testLogOff() {
		boolean expRes = false;
		user.logOff();
		boolean res = user.isLoggedOn();
		assertEquals("User is not logged on", expRes, res);
	}

	/**
	 * Test method for {@link User#getFirstName()}.
	 */
	@Test
	public void testGetFirstName() {
		String expRes = "Kenzie";
		String result = user.getFirstName();
		assertEquals("First name is " + expRes,expRes, result);
	}

	/**
	 * Test method for {@link User#setFirstName(java.lang.String)}.
	 */
	@Test
	public void testSetFirstName() {
		String name = "Ellen";
		user.setFirstName("Ellen");
		String result = user.getFirstName();
		assertEquals("First name is now " + name,name, result);
	}

	/**
	 * Test method for {@link User#getLastName()}.
	 */
	@Test
	public void testGetLastName() {
		String expRes = "Flickinger";
		String result = user.getLastName();
		assertEquals("Last name is " + expRes,expRes, result);;
	}

	/**
	 * Test method for {@link User#setLastName(java.lang.String)}.
	 */
	@Test
	public void testSetLastName() {
		String expRes = "Stensrud";
		user.setLastName("Stensrud");
		String result = user.getLastName();
		assertEquals("Last name is now " + expRes,expRes, result);
	}

	/**
	 * Test method for {@link User#getUsername()}.
	 */
	@Test
	public void testGetUsername() {
		String expRes = "miflickinger";
		String result = user.getUsername();
		assertEquals("Username is " + expRes,expRes, result);
	}

	/**
	 * Test method for {@link User#setUsername(java.lang.String)}.
	 */
	@Test
	public void testSetUsername() {
		String expRes = "kenzie_flick";
		user.setUsername("kenzie_flick");
		String result = user.getUsername();
		assertEquals("Username is now " + expRes,expRes, result);
	}

	/**
	 * Test method for {@link User#getPassword()}.
	 */
	@Test
	public void testGetPassword() {
		String expRes = "password";
		String result = user.getPassword();
		assertEquals("Password is" + expRes,expRes, result);
	}

	/**
	 * Test method for {@link User#setPassword(java.lang.String)}.
	 */
	@Test
	public void testSetPassword() {
		String expRes = "12345";
		user.setPassword("12345");
		String result = user.getPassword();
		assertEquals("Password is now" + expRes,expRes, result);
	}

	/**
	 * Test method for {@link User#getType()}.
	 */
	@Test
	public void testGetType() {
		char expRes = 'u';
		char result = user.getType();
		assertEquals("Type is " + expRes,expRes, result);
	}

	/**
	 * Test method for {@link User#getStatus()}.
	 */
	@Test
	public void testGetStatus() {
		char expRes = 'Y';
		char result = user.getStatus();
		assertEquals("Status is " + expRes,expRes, result);
	}

	/**
	 * Test method for {@link User#toString()}.
	 */
	@Test
	public void testToString() {
		String expRes = "User [firstName=Kenzie, lastName()=Flickinger, username()=miflickinger, password()=password, type()=u, status()=Y]";
		System.out.println(user.toString());
		String res = user.toString();
		assertEquals("To string is: " + expRes, expRes, res);
	}

}
