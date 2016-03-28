/**
	 * SearchController.java
	 */
	import java.util.*;

	/**
	 * Search Controller is used by users to
	 * find schools that they are interested in
	 *
	 * @author Kenzie Flickinger
	 * @version 1
	 */
	public class SearchController {
		
		public SearchController(){
			
		}

	    /**
	     * Schools found in the search that are added to genList
	     */
	    private static ArrayList<School> updatedList = new ArrayList<School>();
	    
	    /**
	     * List of schools still in search before a search method is used
	     */
	    private static ArrayList<School> genList = DatabaseController.viewAllSchools();

	    /**
	     * Method calls on other private methods to make map of relevant schools
	     * and recommended schools
	     * 
	     * @param searchSchool Name of school
	     * @param searchState State where the school should be
	     * @param searchLocation Location where wanted school should be
	     * @param searchControl Control of school 
	     * @param lowStudents Min number of students
	     * @param highStudents Max num of students
	     * @param lowFemales Lowest percent of females 
	     * @param highFemales Highest percent females
	     * @param lowSATVerbal Lowest Verbal SAT score preferred
	     * @param highSATVerbal Highest Verbal SAT score preferred
	     * @param lowSATMath Lowest Math SAT score preferred
	     * @param highSATMath Highest Math SAT score preferred
	     * @param lowExpenses Minimum wanted expenses
	     * @param highExpenses Highest wanted expenses
	     * @param lowFinAid Min Fin. Aid given
	     * @param highFinAid Max Fin. Aid given
	     * @param lowNumApplicants Lowest num of applicants 
	     * @param highNumApplicants Highest num of applicants
	     * @param lowAdmitted Lowest num admitted to school
	     * @param highAdmitted Highest num admitted to school
	     * @param lowEnrolled Lowest numb enrolled
	     * @param highEnrolled Highest numb enrolled
	     * @param lowAcademicScale Lowest Academic Scale
	     * @param highAcademicScale Highest Academic Scale
	     * @param lowSocialScale Lowest Social Rating
	     * @param highSocialScale Highest Social Rating
	     * @param lowQualityScale Lowest quality of life accepted
	     * @param highQualityScale Highest quality of life accepted
	     * @param emphases Emphases chosen
	     * @return Returns an ArrayList of all the schools that fit the emphases given.
	     */
	    public static ArrayList<School> search(String searchSchool, String searchState, String searchLocation, String searchControl, 
	                                               Integer lowStudents, Integer highStudents, Double lowFemales, Double highFemales, Double lowSATVerbal, 
	                                               Double highSATVerbal, Double lowSATMath, Double highSATMath, Double lowExpenses, Double highExpenses, 
	                                               Double lowFinAid, Double highFinAid, Integer lowNumApplicants, Integer highNumApplicants, Double lowAdmitted, 
	                                               Double highAdmitted, Double lowEnrolled, Double highEnrolled, Integer lowAcademicScale, Integer highAcademicScale,
	                                               Integer lowSocialScale, Integer highSocialScale, Integer lowQualityScale,Integer highQualityScale, ArrayList<String> emphases)
	      throws Exception{
	        updatedList= new ArrayList<School>();
	        genList = DatabaseController.viewAllSchools();
	        searchedSchools(searchSchool);
	        searchedState(searchState);
	        searchedLocation(searchLocation);
	        searchedControl(searchControl);
	        searchedNumOfStudents(lowStudents, highStudents);
	        searchedFemalePercentage(lowFemales, highFemales);
	        searchedSatVerbal(lowSATVerbal, highSATVerbal);
	        searchedSatMath(lowSATMath, highSATMath);
	        searchedExpenses(lowExpenses, highExpenses);
	        searchedFinancialAid(lowFinAid, highFinAid);
	        searchedNumOfApplicants(lowNumApplicants, highNumApplicants);
	        searchedAdmitted(lowAdmitted, highAdmitted);
	        searchedEnrolled(lowEnrolled, highEnrolled);
	        searchedAcademicsScale(lowAcademicScale, highAcademicScale);
	        searchedSocialScale(lowSocialScale, highSocialScale);
	        searchedQualityOfLifeScale(lowQualityScale, highQualityScale);
	        searchedEmpheses(emphases);

	        /*
	         * refinedSearch(searchSchool, searchState, searchLocation,
	         * searchControl, lowStudents, highStudents, lowFemales,
	         * highFemales, lowSATVerbal, highSATVerbal, lowSATMath,
	         * highSATMath, lowExpenses, highExpenses, lowFinAid, highFinAid,
	         * lowNumApplicants, highNumApplicants, lowAdmitted, highAdmitted,
	         * lowEnrolled, highEnrolled, lowAcademicScale, highAcademicScale,
	         * lowSocialScale, highSocialScale, lowQualityScale, highQualityScale,
	         * emphases);
	         */

	        return genList;
	    }

	    /**
	     * Keeps track of schools in search that will be returned to the user.
	     */
	    private static void updateTwoLists() {
	        genList= new ArrayList<School>();
	        for (School subject : updatedList
	) {
	            genList.add(subject);
	        }
	        updatedList = new ArrayList<School>();
	    }

	    /**
	     * Searches name of a school against schools in database.
	     *
	     * @param searchSchool name of school.
	     */
	    private static void searchedSchools(String searchSchool) {
	        if (searchSchool != null) {
	            for (School school : genList) {
	                if (school.getSchoolName().toLowerCase().indexOf(searchSchool.toLowerCase()) >= 0) {
	                    System.out.println(school.getSchoolName());
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     * Searches name of a state against schools in database.
	     *
	     * @param searchState name of state.
	     */
	    private static void searchedState(String searchState) { 
	        if (searchState != null) {
	            for (School school : genList) {
	                if (school.getState().toLowerCase().indexOf(searchState.toLowerCase()) >= 0) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     * Searches name of a location against schools in database.
	     *
	     * @param searchLocation name of location.
	     */
	    private static void searchedLocation(String searchLocation) {
	        if (searchLocation != null && !searchLocation.equals("-1")) {
	            for (School school : genList) {
	                if (school.getLocation().toLowerCase().indexOf(searchLocation.toLowerCase()) == 0) { 
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     *Searches control against schools in database.
	     *
	     * @param searchControl private or public education.
	     */
	    private static void searchedControl(String searchControl) {
	        if (searchControl != null && !searchControl.equals("-1")) {
	            for (School school : genList) {
	                if (school.getControl().toLowerCase().indexOf(searchControl.toLowerCase()) >= 0) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     * Searches number of students against schools in database.
	     *
	     * @param lowNum low num of students.
	     * @param highNum high num of students.
	     */
	    private static void searchedNumOfStudents(Integer lowNum, Integer highNum) throws Exception {
	        if (lowNum != null && highNum != null) {
	            if (lowNum > highNum) {
	                throw new Exception("Error Students");
	            }
	            for (School school : genList) {
	                if (school.getNumberOfStudents() <= highNum&& school.getNumberOfStudents() >= lowNum) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowNum == null && highNum != null) {
	            for (School school : genList) {
	                if (school.getNumberOfStudents() <= highNum) {
	                    updatedList.add(school);
	                }
	                updateTwoLists();
	            }
	        } 
	        else if (lowNum != null && highNum == null) {
	            for (School school : genList) {
	                if (school.getNumberOfStudents() >= lowNum) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     * Searches percent of females against schools in database.
	     *
	     * @param lowFemales low percentage of females.
	     * @param highFemales high percentage of females.
	     */
	    private static void searchedFemalePercentage(Double lowFemales, Double highFemales) {
	        if (lowFemales!= null && highFemales != null) {
	            for (School school : genList) {
	                if (school.getFemalePercentage() <= highFemales&& school.getFemalePercentage() >= lowFemales) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowFemales== null && highFemales!= null) {
	            for (School school : genList) {
	                if (school.getFemalePercentage() <= highFemales) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowFemales != null && highFemales== null) {
	            for (School school : genList) {
	                if (school.getFemalePercentage() >= lowFemales) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     * Searches for SAT verbal score of schools in database.
	     *
	     * @param lowSATVerbal low SAT verbal score
	     * @param highSATVerbal high SAT verbal score.
	     */
	    private static void searchedSatVerbal(Double lowSATVerbal, Double highSATVerbal) {
	        if (lowSATVerbal != null && highSATVerbal != null) {
	            for (School school : genList) {
	                if (school.getSatVerbal() <= highSATVerbal
	                        && school.getSatVerbal() >= lowSATVerbal) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowSATVerbal == null && highSATVerbal != null) {
	            for (School school : genList) {
	                if (school.getSatVerbal() <= highSATVerbal) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowSATVerbal != null && highSATVerbal == null) {
	            for (School school : genList) {
	                if (school.getSatVerbal() >= lowSATVerbal) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     * Searches for SAT math score of schools in database.
	     *
	     * @param lowSATMath low  SAT math score.
	     * @param highSATMath high  SAT math score.
	     */
	    private static void searchedSatMath(Double lowSATMath, Double highSATMath) {
	        if (lowSATMath != null && highSATMath != null) {
	            for (School school : genList) {
	                if (school.getSatMath() <= highSATMath && school.getSatMath() >= lowSATMath) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowSATMath == null && highSATMath != null) {
	            for (School school : genList) {
	                if (school.getSatMath() <= highSATMath) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	        else if (lowSATMath != null && highSATMath == null) {
	            for (School school : genList) {
	                if (school.getSatMath() >= lowSATMath) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     * Searches expenses of schools in database.
	     *
	     * @param lowExpenses low expenses.
	     * @param highExpenses high expenses.
	     */
	    private static void searchedExpenses(Double lowExpenses, Double highExpenses) {
	        if (lowExpenses != null && highExpenses != null) {
	            for (School school : genList) {
	                if (school.getExpenses() <= highExpenses&& school.getExpenses() >= lowExpenses) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowExpenses == null && highExpenses != null) {
	            for (School school : genList) {
	                if (school.getExpenses() <= highExpenses) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	        else if (lowExpenses != null && highExpenses == null) {
	            for (School school : genList) {
	                if (school.getExpenses() >= lowExpenses) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     * Searches percent of financial aid of schools in database.
	     *
	     * @param lowFinAid low financial aid.
	     * @param highFinAid high financial aid.
	     */
	    private static void searchedFinancialAid(Double lowFinAid, Double highFinAid) {
	        if (lowFinAid != null && highFinAid != null) {
	            for (School school : genList) {
	                if (school.getFinancialAid() <= highFinAid && school.getFinancialAid() >= lowFinAid) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowFinAid == null && highFinAid != null) {
	            for (School school : genList) {
	                if (school.getFinancialAid() <= highFinAid) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	        else if (lowFinAid != null && highFinAid == null) {
	            for (School school : genList) {
	                if (school.getFinancialAid() >= lowFinAid) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     * Searches number of applicants of schools in database.
	     *
	     * @param lowNumApplicants low num of applicants.
	     * @param highNumApplicants high num of applicants.
	     */
	    private static void searchedNumOfApplicants(Integer lowNumApplicants, Integer highNumApplicants) {
	        if (lowNumApplicants != null && highNumApplicants != null) {
	            for (School school : genList) {
	                if (school.getNumberOfApplicants() <= highNumApplicants && school.getNumberOfApplicants() >= lowNumApplicants) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowNumApplicants == null && highNumApplicants != null) {
	            for (School school : genList) {
	                if (school.getNumberOfApplicants() <= highNumApplicants) {
	                    updatedList.add(school);
	                }
	                updateTwoLists();
	            }
	        } 
	        else if (lowNumApplicants != null && highNumApplicants == null) {
	            for (School school : genList) {
	                if (school.getNumberOfApplicants() >= lowNumApplicants) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     * Searches percent admitted to schools in database.
	     *
	     * @param lowAdmitted low num of  admitted students.
	     * @param highAdmitted high num of admitted students.
	     */
	    private static void searchedAdmitted(Double lowAdmitted, Double highAdmitted) {
	        if (lowAdmitted != null && highAdmitted != null) {
	            for (School school : genList) {
	                if (school.getAdmitted() <= highAdmitted&& school.getAdmitted() >= lowAdmitted) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowAdmitted == null && highAdmitted != null) {
	            for (School school : genList) {
	                if (school.getAdmitted() <= highAdmitted) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowAdmitted != null && highAdmitted == null) {
	            for (School school : genList) {
	                if (school.getAdmitted() >= lowAdmitted) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     * Searches percent enrolled in schools in database.
	     *
	     * @param lowEnrolled low enrollment
	     * @param highEnrolled high enrollment
	     */
	    private static void searchedEnrolled(Double lowEnrolled, Double highEnrolled) {
	        if (lowEnrolled != null && highEnrolled != null) {
	            for (School school : genList) {
	                if (school.getEnrolled() <= highEnrolled && school.getEnrolled() >= lowEnrolled) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowEnrolled == null && highEnrolled != null) {
	            for (School school : genList) {
	                if (school.getEnrolled() <= highEnrolled) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowEnrolled != null && highEnrolled == null) {
	            for (School school : genList) {
	                if (school.getEnrolled() >= lowEnrolled) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     * Searches academics scale of schools in database
	     *
	     * @param lowAcademicScale low academics scale 
	     * @param highAcademicScale high academics scale
	     */
	    private static void searchedAcademicsScale(Integer lowAcademicScale, Integer highAcademicScale) {
	        if (lowAcademicScale != null && highAcademicScale != null) {
	            for (School school : genList) {
	                if (school.getAcademicsScale() <= highAcademicScale&& school.getAcademicsScale() >= lowAcademicScale) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowAcademicScale == null && highAcademicScale != null) {
	            for (School school : genList) {
	                if (school.getAcademicsScale() <= highAcademicScale) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowAcademicScale != null && highAcademicScale == null) {
	            for (School school : genList) {
	                if (school.getAcademicsScale() >= lowAcademicScale) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     * Searches social scale of schools in database
	     *
	     * @param lowSocialScale low social scale
	     * @param highSocialScale high social scale
	     */
	    private static void searchedSocialScale(Integer lowSocialScale, Integer highSocialScale) {
	        if (lowSocialScale != null && highSocialScale != null) {
	            for (School school : genList) {
	                if (school.getSocialScale() <= highSocialScale && school.getSocialScale() >= lowSocialScale) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowSocialScale == null && highSocialScale != null) {
	            for (School school : genList) {
	                if (school.getSocialScale() <= highSocialScale) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowSocialScale != null && highSocialScale == null) {
	            for (School school : genList) {
	                if (school.getSocialScale() >= lowSocialScale) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     * Searches quality of life scale of schools in database
	     *
	     * @param lowQualityScale low quality of life scale 
	     * @param highQualityScale high quality of life scale 
	     */
	    private static void searchedQualityOfLifeScale(Integer lowQualityScale, Integer highQualityScale) {
	        if (lowQualityScale != null && highQualityScale != null) {
	            for (School school : genList) {
	                if (school.getQualityOfLifeScale() <= highQualityScale&& school.getQualityOfLifeScale() >= lowQualityScale) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowQualityScale == null && highQualityScale != null) {
	            for (School school : genList) {
	                if (school.getQualityOfLifeScale() <= highQualityScale) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        } 
	        else if (lowQualityScale != null && highQualityScale == null) {
	            for (School school : genList) {
	                if (school.getQualityOfLifeScale() >= lowQualityScale) {
	                    updatedList.add(school);
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     * Searches through given emphases and goes through
	     * schools to find the schools with those emphases.
	     *
	     * @param emphases list of emphases to be compared schools against.
	     */
	    private static void searchedEmpheses(ArrayList<String> emphases) {
	        if (!emphases.isEmpty()) {
	            for (School school : genList) {
	                if (school.getEmphases() != null) {
	                            if (school.getEmphases().contains(emphases)) {
	                                updatedList.add(school);
	                        }
	                }
	            }
	            updateTwoLists();
	        }
	    }

	    /**
	     *
	     */
	    public static void main(String args[]) throws Exception {
	    }
}
