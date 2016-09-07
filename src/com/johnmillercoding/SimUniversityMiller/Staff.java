package com.johnmillercoding.SimUniversityMiller;

/**
 * @author John D. Miller
 * @since 09/03/2016
 * @version 1.0.1
 * Class to model a staff member.
 */
class Staff extends Employee{

    // Instance variables
    private String title;

    /**
     * Gets the employee's title.
     * @return the title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the employee's title.
     * @param title the title.
     */
    void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){

        return "Type: " + this.getClass().getSimpleName() + " Name: " + this.getfName() + " " + this.getlName() + " Phone: " + this.getPhone() + " Email: " + this.getEmail() + " Title: " + title;
    }
}
