package Project;

/**
 * File: School.java
 * @author Ellen Stensrud
 * @version March 3, 2016
 */

public class School {
	
	private String schoolName;
	private String state;
	private String location;
	private String control;
	private int numberOfStudents;
	private double femalePercentage;
	private int satVerbal;
	private int satMath;
	private double expenses;
	private double financialAid;
	private int numberOfApplicants;
	private double admitted;
	private double enrolled;
	private int academicsScale;
	private int socialScale;
	private int qualityOfLifeScale;
	private String emphases;
	
	public School(String school, String state2, String location2, String control2, int numOfStudents, double femalePercentage2, double sATVerbal2, double sATMath2, double expenses2, double finAid, int numOfApplicants, double admitted2, double enrolled2, int academicScale, int socialScale2, int qualityOfLifeScale2, String string) {
		schoolName = null;
		state = null;
		location = null;
		control = null;
		numberOfStudents = 0;
		femalePercentage = 0;
		satVerbal = 0;
		satMath = 0;
		expenses = 0;
		financialAid = 0;
		numberOfApplicants = 0;
		admitted = 0;
		enrolled = 0;
		academicsScale = 0;
		socialScale = 0;
		qualityOfLifeScale = 0;
		emphases = null;
	}
	/**
	 */

	public School() {
		super();
		this.schoolName = schoolName;
		this.state = state;
		this.location = location;
		this.control = control;
		this.numberOfStudents = numberOfStudents;
		this.femalePercentage = femalePercentage;
		this.satVerbal = satVerbal;
		this.satMath = satMath;
		this.expenses = expenses;
		this.financialAid = financialAid;
		this.numberOfApplicants = numberOfApplicants;
		this.admitted = admitted;
		this.enrolled = enrolled;
		this.academicsScale = academicsScale;
		this.socialScale = socialScale;
		this.qualityOfLifeScale = qualityOfLifeScale;
		this.emphases = emphases;
	}
	
	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", state=" + state
				+ ", location=" + location + ", control=" + control
				+ ", numberOfStudents=" + numberOfStudents
				+ ", femalePercentage=" + femalePercentage + ", satVerbal="
				+ satVerbal + ", satMath=" + satMath + ", expenses=" + expenses
				+ ", financialAid=" + financialAid + ", numberOfApplicants="
				+ numberOfApplicants + ", admitted=" + admitted + ", enrolled="
				+ enrolled + ", academicsScale=" + academicsScale
				+ ", socialScale=" + socialScale + ", qualityOfLifeScale="
				+ qualityOfLifeScale + ", emphases=" + emphases + "]";
	}
	/**
	 * 
	 * @return schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}
	/**
	 * 
	 * @param schoolName
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	/**
	 * 
	 * @return
	 */
	public String getState() {
		return state;
	}
	/**
	 * 
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 
	 * @return
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * 
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * 
	 * @return
	 */
	public String getControl() {
		return control;
	}
	/**
	 * 
	 * @param control
	 */
	public void setControl(String control) {
		this.control = control;
	}
	/**
	 * 
	 * @return
	 */
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	/**
	 * 
	 * @param numberOfStudents
	 */
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	/**
	 * 
	 * @return
	 */
	public double getFemalePercentage() {
		return femalePercentage;
	}
	/**
	 * 
	 * @param femalePercentage
	 */
	public void setFemalePercentage(double femalePercentage) {
		this.femalePercentage = femalePercentage;
	}
	/**
	 * 
	 * @return
	 */
	public int getSatVerbal() {
		return satVerbal;
	}
	/**
	 * 
	 * @param satVerbal
	 */
	public void setSatVerbal(int satVerbal) {
		this.satVerbal = satVerbal;
	}
	/**
	 * 
	 * @return
	 */
	public int getSatMath() {
		return satMath;
	}
	/**
	 * 
	 * @param satMath
	 */
	public void setSatMath(int satMath) {
		this.satMath = satMath;
	}
	/**
	 * 
	 * @return
	 */
	public double getExpenses() {
		return expenses;
	}
	/**
	 * 
	 */
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	/**
	 * 
	 * @return
	 */
	public double getFinancialAid() {
		return financialAid;
	}
	/**
	 * 
	 * @param financialAid
	 */
	public void setFinancialAid(double financialAid) {
		this.financialAid = financialAid;
	}
	/**
	 * 
	 */
	public int getNumberOfApplicants() {
		return numberOfApplicants;
	}
	/**
	 * 
	 * @param numberOfApplicants
	 */
	public void setNumberOfApplicants(int numberOfApplicants) {
		this.numberOfApplicants = numberOfApplicants;
	}
	/**
	 * 
	 * @return
	 */
	public double getAdmitted() {
		return admitted;
	}
	/**
	 * 
	 * @param admitted
	 */
	public void setAdmitted(double admitted) {
		this.admitted = admitted;
	}
	/**
	 * 
	 * @return
	 */
	public double getEnrolled() {
		return enrolled;
	}
	/**
	 * 
	 * @param enrolled
	 */
	public void setEnrolled(double enrolled) {
		this.enrolled = enrolled;
	}
	/**
	 * 
	 * @return
	 */
	public int getAcademicsScale() {
		return academicsScale;
	}
	/**
	 * 
	 * @param academicsScale
	 */
	public void setAcademicsScale(int academicsScale) {
		this.academicsScale = academicsScale;
	}
	/**
	 * 
	 * @return
	 */
	public int getSocialScale() {
		return socialScale;
	}
	/**
	 * 
	 * @param socialScale
	 */
	public void setSocialScale(int socialScale) {
		this.socialScale = socialScale;
	}
	/**
	 * 
	 * @return
	 */
	public int getQualityOfLifeScale() {
		return qualityOfLifeScale;
	}
	/**
	 * 
	 * @param qualityOfLifeScale
	 */
	public void setQualityOfLifeScale(int qualityOfLifeScale) {
		this.qualityOfLifeScale = qualityOfLifeScale;
	}
	/**
	 * 
	 * @return
	 */
	public String getEmphases() {
		return emphases;
	}
	/**
	 * 
	 * @param emphases
	 */
	public void setEmphases(String emphases) {
		this.emphases = emphases;
	}
	




}
