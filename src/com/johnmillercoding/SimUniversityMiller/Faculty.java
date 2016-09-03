package com.johnmillercoding.SimUniversityMiller;

/**
 * @author John D. Miller
 * @since 09/03/2016
 * @version 1.0.1
 * Class to model a faculty member.
 */
public class Faculty extends Employee{

    // Instance variables
    private String rank;

    /**
     * Gets the faculty member's rank.
     * @return the rank.
     */
    public String getRank() {
        return rank;
    }

    /**
     * Sets the faculty member's rank.
     * @param rank the rank.
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

}
