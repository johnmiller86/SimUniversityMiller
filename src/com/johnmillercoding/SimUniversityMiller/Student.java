package com.johnmillercoding.SimUniversityMiller;

/**
 * @author John D. Miller
 * @since 09/03/2016
 * @version 1.0.1
 * Class to model a student.
 */
public class Student extends Person{

    // Constants
    private final String YEAR_FRESHMAN = "freshman";
    private final String YEAR_SOPHMORE = "sophmore";
    private final String YEAR_JUNIOR = "junior";
    private final String YEAR_SENIOR = "senior";
    // Instance variables
    private String year;

    /**
     * Gets the student's year.
     * @return the year.
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the student's year.
     * @param year the year.
     */
    public void setYear(String year) {
        this.year = year;
    }
}
