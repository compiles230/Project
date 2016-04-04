package Project;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import dblibrary.project.csci230.UniversityDBLibrary;

public class SearchControllerTest {
	private DatabaseController dbc;
	private UniversityDBLibrary db;
	private SearchController searchCont;

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testSearch() throws Exception {
		ArrayList<School> unis = new ArrayList<School>();
		
		assertEquals("Method will return an empty arrayList of Schools", unis, SearchController.search("empty",
				null, null, null, null, null, null, 
				null, null, null, null, null, null,
				null, null, null, null, null, null, 
				null, null, null, null, null, null,
				null, null, null, null));
		
		School expected = new School("University of Montevideo", "Minnesota", "Small-City",
				       "public",1200,52.0,450.0, 470.0,8000.0,25.0,25,25.0,25.0,25,25,5000);
		//ArrayList<School> actual = SearchController.search("University of Montevideo", "Minnesota", "Small-City",
			//       "public",1200,52.0,450.0,470.0,8000.0,50.0,25,25.0,25.0,4,4,5, "none");


	    // assertEquals("These two Strings should be equal",expected.getSchoolName(),actual.get(0).getSchoolName());
	  //   assertEquals("These two Strings should be equal",expected.getState(),actual.get(0).getState());
	  //   assertEquals("These two Strings should be equal",expected.getLocation(),actual.get(0).getLocation());
	   //  assertEquals("These two Strings should be equal",expected.getControl(),actual.get(0).getControl());
	   //  assertEquals("These two Strings should be equal",expected.getNumberOfStudents(),actual.get(0).getNumberOfStudents());
	   //  assertEquals("These two Strings should be equal",expected.getFemalePercentage(),actual.get(0).getFemalePercentage(),0.001);
	   //  assertEquals("These two Strings should be equal",expected.getSatVerbal(),actual.get(0).getSatVerbal(),0.001);
	   //  assertEquals("These two Strings should be equal",expected.getSatMath(),actual.get(0).getSatMath(),0.001);
	   //  assertEquals("These two Strings should be equal",expected.getExpenses(),actual.get(0).getExpenses(),0.001);
		// assertEquals("These two Strings should be equal",expected.getFinancialAid(),actual.get(0).getFinancialAid(),0.001);
	   //  assertEquals("These two Strings should be equal",expected.getNumberOfApplicants(),actual.get(0).getNumberOfApplicants(),0.001);
	   //  assertEquals("These two Strings should be equal",expected.getAdmitted(),actual.get(0).getAdmitted(),0.001);
	   //  assertEquals("These two Strings should be equal",expected.getEnrolled(),actual.get(0).getEnrolled(),0.001);
	   //  assertEquals("These two Strings should be equal",expected.getAcademicsScale(),actual.get(0).getAcademicsScale());
	   //  assertEquals("These two Strings should be equal",expected.getSocialScale(),actual.get(0).getSocialScale());
	   //  assertEquals("These two Strings should be equal",expected.getQualityOfLifeScale(),actual.get(0).getQualityOfLifeScale());
	 	// assertEquals("These two Strings should be equal",expected.getEmphases(),actual.get(0).getEmphases());
		
	}

}
