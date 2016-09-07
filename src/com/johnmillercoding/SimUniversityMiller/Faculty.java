package com.johnmillercoding.SimUniversityMiller;

/**
 * @author John D. Miller
 * @since 09/03/2016
 * @version 1.0.1
 * Class to model a faculty member.
 */
class Faculty extends Employee implements Changeable {

    // Constants
    static final String RANK_PROFESSOR = "professor";
    static final String RANK_ASSOCIATE_PROFESSOR = "associate professor";
    static final String RANK_ASSISTANT_PROFESSOR = "assistant professor";

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
    void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public void changeName(String fName, String lName) {
        this.setfName(fName);
        this.setlName(lName);
    }

    @Override
    public String toString(){

        return "Type: " + this.getClass().getSimpleName() + " Name: " + this.getfName() + " " + this.getlName() + " Phone: " + this.getPhone() + " Email: " + this.getEmail() + " Rank: " + rank;
    }
}
