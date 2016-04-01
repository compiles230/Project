package Project;

import static org.junit.Assert.*;

import java.util.ArrayList;

import dblibrary.project.csci230.*;

import org.junit.Before;
import org.junit.Test;

public class SchoolHomeTest {

	private SchoolHome sh;
	private DatabaseController db;
	private UniversityDBLibrary udb;
	
	@Before
	public void setUp() throws Exception {
		udb = new UniversityDBLibrary("andyetitco", "andyetitco", "ehk3");
		db = new DatabaseController(udb);
		sh = new SchoolHome(db);
	}

	@Test
	public void testSaveSchool() {
		sh.saveSchool("juser", "AUBURN");
		ArrayList<String> schools = new ArrayList<String>();
		for(String s: schools)
			System.out.println(s);
		assertTrue("juser has the school 'AUBURN' in their  list is true",schools.contains("AUBURN"));
			 
	}

	@Test
	public void testRemoveSchool() {
		int passed = sh.removeSchool("juser", "AUBURN");
		ArrayList<String> schools = new ArrayList<String>();
		assertEquals(1,1,passed);
	}
	
	/**@Test
	public void testRemoveSchoolFails(){
		sh.removeSchool("juser", "AUBURN");
		int passed = sh.removeSchool("juser", "AUBURN");
		assertEquals(-1, passed);
		
	} */

	@Test
	public void testViewSchool() {
		sh.viewSchool("AUBURN");
		
	}

	@Test
	public void testViewSavedSchools() {
		sh.viewSavedSchools("juser");
	}

	@Test
	public void testAddUniversity() {
		int passed = sh.addUniversity("Duke", "NC", "SUBURBAN", "STATE", 14950, 52, 700, 720, 32000, 84, 44000, 11, 87, 4, 4, 4);
		assertEquals(1, passed);
	}

	@Test
	public void testEditUnivesity() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewAllSchools() {
		fail("Not yet implemented");
	}

}
