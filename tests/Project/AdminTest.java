package Project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AdminTest {

	
private Admin admin;
	
	@Before
	public void setUp() throws Exception {
		admin = new Admin("Haylie", "Murphey", "hgmurphey", "password", 'a', 'Y');
	}
	
	@Test
	public void testIsLoggedOn_NotLogged() {
		boolean expRes = false;
		boolean res = admin.isLoggedOn();
		assertEquals("User is not logged on", expRes, res);
	}

	@Test
	public void testLogOn() {
		boolean expRes = true;
		admin.logOn();
		boolean res = admin.isLoggedOn();
		assertEquals("User is logged on", expRes, res);
	}

	@Test
	public void testLogOff() {
		boolean expRes = false;
		admin.logOff();
		boolean res = admin.isLoggedOn();
		assertEquals("User is not logged on", expRes, res);
	}

	@Test
	public void testGetFirstName() {
		String expRes = "Haylie";
		String result = admin.getFirstName();
		assertEquals("First name is " + expRes,expRes, result);
	}

	@Test
	public void testSetFirstName() {
		String name = "Ellen";
		admin.setFirstName("Ellen");
		String result = admin.getFirstName();
		assertEquals("First name is now " + name,name, result);
	}

	@Test
	public void testGetLastName() {
		String expRes = "Murphey";
		String result = admin.getLastName();
		assertEquals("Last name is " + expRes,expRes, result);
	}

	@Test
	public void testSetLastName() {
		String expRes = "Stensrud";
		admin.setLastName("Stensrud");
		String result = admin.getLastName();
		assertEquals("Last name is now " + expRes,expRes, result);
	}

	@Test
	public void testGetUsername() {
		String expRes = "hgmurphey";
		String result = admin.getUsername();
		assertEquals("Username is " + expRes,expRes, result);
	}

	@Test
	public void testSetUsername() {
		String expRes = "murphhay";
		admin.setUsername("murphhay");
		String result = admin.getUsername();
		assertEquals("Username is now " + expRes,expRes, result);
	}

	@Test
	public void testGetPassword() {
		String expRes = "password";
		String result = admin.getPassword();
		assertEquals("Password is" + expRes,expRes, result);
	}

	@Test
	public void testSetPassword() {
		String expRes = "12345";
		admin.setPassword("12345");
		String result = admin.getPassword();
		assertEquals("Password is now" + expRes,expRes, result);
	}

	@Test
	public void testGetType() {
		char expRes = 'a';
		char result = admin.getType();
		assertEquals("Type is " + expRes,expRes, result);
	}

	@Test
	public void testSetType() {
		char expRes = 'u';
		admin.setType('u');
		char result = admin.getType();
		assertEquals("Type is now" + expRes,expRes, result);
	}

	@Test
	public void testGetStatus() {
		char expRes = 'Y';
		char result = admin.getStatus();
		assertEquals("Status is " + expRes,expRes, result);
	}

	@Test
	public void testSetStatus() {
		char expRes = 'N';
		admin.setStatus('N');
		char result = admin.getStatus();
		assertEquals("Type is now " + expRes,expRes, result);
	}

	@Test
	public void testToString() {
		String expRes = "Admin [firstName=Haylie, lastName()=Murphey, username()=hgmurphey, password()=password, type()=a, status()=Y]";
		String res = admin.toString();
		assertEquals("To string is: " + expRes, expRes, res);
	}


}
