package Project;

import static org.junit.Assert.*;
import java.util.ArrayList;

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
		au.editUniversity("DEMO UNIVERSITY","x","x","x",1,1.1,1.2,1.3,1.4,1.5,1,1.6,1.7,1,1,1);
		au.editUniversity("DEMO UNIVERSITY","EDIT","EDIT","EDIT",1,1.1,1.2,1.3,1.4,1.5,1,1.6,1.7,1,1,1);
		String exp = "[DEMO UNIVERSITY, EDIT, EDIT, EDIT, 1, 1, 1, 1, 1, 2, 1, 2, 2, 1, 1, 1]";
		ArrayList<String> result = au.viewSchool("DEMO UNIVERSITY");
		assertEquals("DEMO UNIVERSITY HAS BEEN NOW CONTAINS 3 EDIT'S ", exp, result.toString() );
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
		String res = au.createSchool("AVENGERS2","x","x","x",1,1.1,1.2,1.3,1.4,1.5,1,1.6,1.7,1,1,1);
		String exp = "AVENGERS2 has been added";
		System.out.println(au.viewSchool("AVENGERS"));
		assertEquals(exp,res);
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
