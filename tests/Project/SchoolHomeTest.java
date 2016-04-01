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
		sh.removeSchool("juser", "AUBURN");
		ArrayList<String> schools = new ArrayList<String>();
		assertFalse("juser does not have school 'AUBURN'",schools.contains("AUBURN"));
	}
	
	@Test
	public void testRemoveSchoolFails(){
		sh.removeSchool("juser", "AUBURN");
		sh.removeSchool("juser", "AUBURN");
		
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
	public void testPrintArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddUniversity() {
		fail("Not yet implemented");
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
