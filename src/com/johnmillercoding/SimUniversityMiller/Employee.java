package com.johnmillercoding.SimUniversityMiller;

/**
 * @author John D. Miller
 * @since 09/03/2016
 * @version 1.0.1
 * Class to model an employee.
 */
abstract class Employee extends Person{

    // Instance variables
    private String office, officePhone, employmentStart;

    /**
     * Gets the employee's office.
     * @return the office.
     */
    public String getOffice() {
        return office;
    }

    /**
     * Sets the employee's office.
     * @param office the office.
     */
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * Gets the employee's office phone number.
     * @return the phone number.
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * Sets the employee's office phone number.
     * @param officePhone the phone number.
     */
    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    /**
     * Gets the employee's start date.
     * @return the start date.
     */
    public String getEmploymentStart() {
        return employmentStart;
    }

    /**
     * Sets the employee's start date.
     * @param employmentStart the start date.
     */
    public void setEmploymentStart(String employmentStart) {
        this.employmentStart = employmentStart;
    }
}
