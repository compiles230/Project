package Project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dblibrary.project.csci230.UniversityDBLibrary;

public class AdminUITest {
	private UniversityDBLibrary db;
	private DatabaseController dbc;
	private Admin admin;
	private SchoolHome sh;
	private AccountController ac;
	private AdminUI au;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		db = new UniversityDBLibrary("andyetitco","andyetico","ehk3");
		dbc = new DatabaseController(db);
		ac = new AccountController(dbc);
		sh = new SchoolHome(dbc);
		admin = new Admin("Noreen","Admin","nadmin","admin",'a','Y');
		au = new AdminUI(ac, sh, admin);

		
	}

	@Test
	public void testEditUniversity() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddUniversity() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewUsers() {
		fail("Not yet implemented");
	}

	@Test
	public void testEditUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeactivateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateSchool() {
		fail("Not yet implemented");
	}

	@Test
	public void testLogOn() {
		fail("Not yet implemented");
	}

	@Test
	public void testLogOut() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewSchool() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewAllSchools() {
		fail("Not yet implemented");
	}

	@Test
	public void testConfirmDeactivateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testConfirmCancelEditUni() {
		fail("Not yet implemented");
	}

	@Test
	public void testConfirmCancelEditUser() {
		fail("Not yet implemented");
	}

}
