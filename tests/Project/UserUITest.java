package Project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserUITest {

	private User user;
	
	@Before
	public void setUp() throws Exception {
		user= new User("Ellen","Stensrud","ekstensrud","secret",'u','Y');
	}

	@Test
	public void testLogOn() {
		boolean expRes = true;
		user.logOn();
		boolean res = user.isLoggedOn();
		assertEquals("User is logged on", expRes, res);
	}

	@Test
	public void testEditProfile() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewProfile() {
		fail("Not yet implemented");
	}

	@Test
	public void testLogOut() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearch() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchByEmphasis() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewSchool() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewSavedSchools() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveSchool() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveSchool() {
		fail("Not yet implemented");
	}

}
