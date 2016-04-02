/**
 * 
 */
package Project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dblibrary.project.csci230.UniversityDBLibrary;

/**
 * @author hgmurphey
 *
 */
public class DatabaseControllerTest {
	private UniversityDBLibrary db;
	private DatabaseController dbc;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		db = new UniversityDBLibrary("andyetitco","andyetico","ehk3");
		dbc = new DatabaseController(db);
	}


	/**
	 * Test method for {@link Project.DatabaseController#addUniversity(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, double, double, double, double, double, int, double, double, int, int, int)}.
	 */
	@Test
	public void testAddUniversity() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#addUniversityEmphasis(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testAddUniversityEmphasis() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#editUniversity(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, double, double, double, double, double, int, double, double, int, int, int)}.
	 */
	@Test
	public void testEditUniversity() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#addSchool(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testAddSchool() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#deactivateUser(java.lang.String)}.
	 */
	@Test
	public void testDeactivateUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#getUsers()}.
	 */
	@Test
	public void testGetUsers() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#getSpecificUser(java.lang.String)}.
	 */
	@Test
	public void testGetSpecificUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#editUniversityEmphases(java.lang.String, java.util.ArrayList)}.
	 */
	@Test
	public void testEditUniversityEmphases() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#editUser(java.lang.String, java.lang.String, java.lang.String, java.lang.String, char, char)}.
	 */
	@Test
	public void testEditUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#user_editUserInfo(Project.User, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUser_editUserInfo() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#addUser(java.lang.String, java.lang.String, java.lang.String, java.lang.String, char)}.
	 */
	@Test
	public void testAddUser() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#viewSchool(java.lang.String)}.
	 */
	@Test
	public void testViewSchool() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#saveArray(java.lang.String[][], int)}.
	 */
	@Test
	public void testSaveArray() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#printArraySchool(java.util.ArrayList)}.
	 */
	@Test
	public void testPrintArraySchool() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#viewSavedSchools(java.lang.String)}.
	 */
	@Test
	public void testViewSavedSchools() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#removeSchool(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testRemoveSchool() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#viewAllSchools()}.
	 */
	@Test
	public void testViewAllSchools() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Project.DatabaseController#getAllSchools()}.
	 */
	@Test
	public void testGetAllSchools() {
		fail("Not yet implemented");
	}

}
