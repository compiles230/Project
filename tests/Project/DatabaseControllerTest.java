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
		db = new UniversityDBLibrary("andyetitco","andyetitco","ehk3");
		dbc = new DatabaseController(db);
	}


	/**
	 * Test method for {@link Project.DatabaseController#addUniversity(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, double, double, double, double, double, int, double, double, int, int, int)}.
	 */
	@Test
	public void testAddUniversity() {
		dbc.deleteUniversity("BEMIDJI");
		int res = dbc.addUniversity("BEMIDJI","x","x","x",15000, 55, 485, 521, 21658, 65, 11500, 65, 75, 4, 4, 3);
		int exp = 1;
		assertEquals("BEMIDJI HAS BEEN ADDED", exp, res);
		dbc.deleteUniversity("BEMIDJI");
	}
	
	@Test
	public void testAddUniversity_AddedDouble(){
		dbc.addUniversity("BSU","x","x","x",15000, 55, 485, 521, 21658, 65, 11500, 65, 75, 4, 4, 3);
		int res = dbc.addUniversity("BEMIDJI","x","x","x",15000, 55, 485, 521, 21658, 65, 11500, 65, 75, 4, 4, 3);
		int exp = -1;
		assertEquals("Tried to Add BSU twice, -1", exp, res);
		dbc.deleteUniversity("BSU");
	}
	

	/**
	 * Test method for {@link Project.DatabaseController#addUniversityEmphasis(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testAddUniversityEmphasis(){
		dbc.addUniversity("BEMIDJI","x","x","x",15000, 55, 485, 521, 21658, 65, 11500, 65, 75, 4, 4, 3);
		int pass = dbc.addUniversityEmphasis("DEMO UNIVERSITY", "BIOLOGY");
		boolean b = false;
		if(pass != -1){
			b = true;
		}
		assertTrue("dbc is NOT -1",b);
	}

	/**
	 * Test method for {@link Project.DatabaseController#editUniversity(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, double, double, double, double, double, int, double, double, int, int, int)}.
	 */
	@Test
	public void testEditUniversity() {
		int passed = dbc.editUniversity("BEMIDJI","EDIT","EDIT","EDIT",15000, 55, 485, 521, 21658, 65, 11500, 65, 75, 4, 4, 3);
		assertTrue("Edit Successfull: Passed is not -1", passed != -1);
	}

	/**
	 * Test method for {@link Project.DatabaseController#addSchool(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testAddSchool() {
		User user = new User("John","User","juser","user",'u','Y');
		int res = dbc.addSchool("juser", "BEMIDJI");
		assertTrue("BEMIDJI added to juser's list of schools: result != -1", res!=-1);
		dbc.removeSchool("juser", "BEMIDJI");
	}

	/**
	 * Test method for {@link Project.DatabaseController#deactivateUser(java.lang.String)}.
	 */
	@Test
	public void testDeactivateUser() {
		int res = dbc.deactivateUser("juser");
		assertTrue("juser is now deactivated: res != -1", res != -1);
		
	}

	/**
	 * Test method for {@link Project.DatabaseController#getSpecificUser(java.lang.String)}.
	 */
	@Test
	public void testGetSpecificUser() {
		Account account = dbc.getSpecificUser("juser");
		String res = account.getUsername();
		assertEquals("juser",res);
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
