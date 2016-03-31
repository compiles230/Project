package Project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class schoolTest {

	private School school;
	
	@Before
	public void setUp() throws Exception {
		school = new School("Duke", "NC", "SUBURBAN", "STATE", 14950, 52, 700, 720, 32000, 84, 44000, 11, 87, 4, 4, 4, "Physics, Math, and Anthropology");
		
		
	}


	@Test
	public void testGetSchoolName() {
		String expRes = "Duke";
		String result = school.getSchoolName();
		assertEquals("The School name is " + expRes,expRes, result);
	}
	
	@Test
	public void testSetSchoolName() {
		String name = "Baylor";
		school.setSchoolName("Baylor");
		String result = school.getSchoolName();
		assertEquals("The School's name is now " + name,name, result);
	}
	
	@Test
	public void testGetState() {
		String expRes = "NC";
		String result = school.getState();
		assertEquals("The school is in the state of " + expRes,expRes, result);
	}
	
	@Test
	public void testSetState() {
		String state = "MD";
		school.setState("MD");
		String result = school.getState();
		assertEquals("The state of the school is now " + state,state, result);
	}
	
	@Test
	public void testGetLocation() {
		String expRes = "SUBURBAN";
		String result = school.getLocation();
		assertEquals("The school location is " + expRes,expRes, result);
	}
	
	@Test
	public void testSetLocation() {
		String location = "URBAN";
		school.setLocation("URBAN");
		String result = school.getLocation();
		assertEquals("The school location is now " + location,location, result);
	}
	
	@Test
	public void testGetControl(){
		String expRes = "STATE";
		String result = school.getControl();
		assertEquals("The school control is " + expRes,expRes, result);
	}
	
	@Test
	public void testSetControl(){
		String control = "PRIVATE";
		school.setControl("PRIVATE");
		String result = school.getControl();
		assertEquals("The state of the school is now " + control,control, result);
	}
	
	@Test
	public void testGetNumberOfStudents(){
		int expRes = 14950;
		int result = school.getNumberOfStudents();
		assertEquals("The number of students is " + expRes,expRes, result);
	}
	
	@Test
	public void testSetNumberOfStudents(){
		int students = 25000;
		school.setNumberOfStudents(25000);
		int result = school.getNumberOfStudents();
		assertEquals("The state of the school is now " + students,students, result);
	}
	
	@Test
	public void testGetFemalePercentage(){
		double expRes = 52;
		double result = school.getFemalePercentage();
		assertEquals("The percent of females is " + expRes,expRes, result, 0.01);
	}
	
	@Test
	public void testSetFemalePercentage(){
		double percent = 48;
		school.setFemalePercentage(48);
		double result = school.getFemalePercentage();
		assertEquals("The state of the school is now " + percent, percent, result, 0.01);
	}
	
	@Test
	public void testGetSatVerbal(){
		int expRes = 700;
		int result = school.getSatVerbal();
		assertEquals("The average SAT Verbal score is " + expRes,expRes, result);
	}
	
	@Test
	public void testSetSatVerbal(){
		int verbal = 650;
		school.setSatVerbal(650);
		int result = school.getSatVerbal();
		assertEquals("The average SAT Verbal score is now " + verbal, verbal, result);
	}
	
	@Test
	public void testGetSatMath(){
		int expRes = 720;
		int result = school.getSatMath();
		assertEquals("The average SAT Math score is " + expRes,expRes, result);
	}
	
	@Test
	public void testSetSatMath(){
		int math = 700;
		school.setSatMath(700);
		int result = school.getSatMath();
		assertEquals("The average SAT Math score is now " + math,math, result);
	}
	
	@Test
	public void testGetExpenses(){
		double expRes = 32000;
		double result = school.getExpenses();
		assertEquals("The annual cost is " + expRes,expRes, result, 0.01);
	}
	
	@Test
	public void testSetExpenses(){
		double expense = 52000;
		school.setExpenses(52000);
		double result = school.getExpenses();
		assertEquals("The state of the school is now " + expense,expense, result, 0.01);
	}
	
	@Test
	public void testGetFinancialAid(){
		double expRes = 84;
		double result = school.getFinancialAid();
		assertEquals("The percent of students that recieve financial aid is " + expRes,expRes, result, 0.01);
	}
	
	@Test
	public void testSetFinancialAid(){
		double aid = 91;
		school.setFinancialAid(91);
		double result = school.getFinancialAid();
		assertEquals("The percent of students that recieve financial aid is now " + aid,aid, result, 0.01);
	}
	
	@Test
	public void testNumberOfApplicants(){
		int expRes = 44000;
		int result = school.getNumberOfApplicants();
		assertEquals("The number of applicants is " + expRes,expRes, result);
	}
	
	@Test
	public void testSetNumberOfApplicants(){
		int apps = 55000;
		school.setNumberOfApplicants(55000);
		int result = school.getNumberOfApplicants();
		assertEquals("The number of applicants is now " + apps,apps, result);
	}
	
	@Test
	public void testGetAdmitted(){
		double expRes = 11;
		double result = school.getAdmitted();
		assertEquals("The percent of students admitted is " + expRes,expRes, result, 0.01);
	}
	
	@Test
	public void testSetAdmitted(){
		double admit = 25;
		school.setAdmitted(25);
		double result = school.getAdmitted();
		assertEquals("The percent of students admitted is now " + admit,admit, result, 0.01);
	}
	
	@Test
	public void testGetEnrolled(){
		double expRes = 87;
		double result = school.getEnrolled();
		assertEquals("The percent of admitted students that enroll is " + expRes,expRes, result, 0.01);
	}
	
	@Test
	public void testSetEnrolled(){
		double enroll = 50;
		school.setEnrolled(50);
		double result = school.getEnrolled();
		assertEquals("The percent of students admitted is now " + enroll, enroll, result, 0.01);
	}
	
	@Test
	public void testGetAcademicsScale(){
		int expRes = 4;
		int result = school.getAcademicsScale();
		assertEquals("The school's academics scale is " + expRes,expRes, result);
	}
	
	@Test
	public void testSetAcademicsScale(){
		int academics = 5;
		school.setAcademicsScale(5);
		int result = school.getAcademicsScale();
		assertEquals("The school's academics scale is now " + academics, academics, result);
	}
	
	@Test
	public void testGetSocialScale(){
		int expRes = 4;
		int result = school.getAcademicsScale();
		assertEquals("The school's social scale is " + expRes,expRes, result);
	}
	
	@Test
	public void testSetSocialScale(){
		int social = 5;
		school.setSocialScale(5);
		int result = school.getSocialScale();
		assertEquals("The school's social scale is now " + social, social, result);
	}
	
	@Test
	public void testGetQualityOfLifeScale(){
		int expRes = 4;
		int result = school.getQualityOfLifeScale();
		assertEquals("The school's quality of life scale is " + expRes,expRes, result);
	}
	
	@Test
	public void testSetQualityOfLifeScale(){
		int quality = 5;
		school.setQualityOfLifeScale(5);
		int result = school.getQualityOfLifeScale();
		assertEquals("The school's quality of life scale is now " + quality,quality, result);
	}
	
	@Test
	public void testGetEmphases() {
		String expRes = "Physics, Math, and Anthropology";
		String result = school.getEmphases();
		assertEquals("The School's emphases are " + expRes,expRes, result);
	}
	
	@Test
	public void testSetEmphases() {
		String emphases = "Computer Science and Communications";
		school.setEmphases("Computer Science and Communications");
		String result = school.getEmphases();
		assertEquals("The School's emphases are now " + emphases,emphases, result);
	}

}
