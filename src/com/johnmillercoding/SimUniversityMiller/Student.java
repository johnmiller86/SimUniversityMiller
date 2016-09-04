package com.johnmillercoding.SimUniversityMiller;

/**
 * @author John D. Miller
 * @since 09/03/2016
 * @version 1.0.1
 * Class to model a student.
 */
public class Student extends Person implements Changeable {

    // Constants
    public static final String YEAR_FRESHMAN = "freshman";
    public static final String YEAR_SOPHMORE = "sophmore";
    public static final String YEAR_JUNIOR = "junior";
    public static final String YEAR_SENIOR = "senior";

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

    @Override
    public void changeName(String fName, String lName) {
        this.setfName(fName);
        this.setlName(lName);
    }

    @Override
    public String toString(){
        return year;
    }
}
