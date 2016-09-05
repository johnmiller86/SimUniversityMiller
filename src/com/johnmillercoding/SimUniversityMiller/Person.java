package com.johnmillercoding.SimUniversityMiller;

/**
 * @author John D. Miller
 * @since 09/03/2016
 * @version 1.0.1
 * Class to model a person.
 */
abstract class Person{

    // Instance variables
    private String fName, lName, phone, email;

    /**
     * Gets the person's first name.
     * @return the name.
     */
    public String getfName() {
        return fName;
    }

    /**
     * Sets the person's first name.
     * @param fName the name.
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * Gets the person's last name.
     * @return the name.
     */
    public String getlName() {
        return lName;
    }

    /**
     * Sets the person's last name.
     * @param lName the name.
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * Gets the person's phone number.
     * @return the phone number.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the person's phone number.
     * @param phone the phone number.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the person's email.
     * @return the email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the person's email.
     * @param email the email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return getfName() + " " + getlName();
    }
}
