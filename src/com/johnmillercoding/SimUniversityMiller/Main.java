package com.johnmillercoding.SimUniversityMiller;

import java.util.ArrayList;

/**
 * @author John D. Miller
 * @since 09/03/2016
 * @version 1.0.1
 * Main method to demonstrate objects.
 */
public class Main {

    public static void main(String[] args) {

        // ArrayList to hold objects
        ArrayList<Person> persons = new ArrayList<>();

        // Object declarations
        Employee employee, employee1, employee2;
        Faculty faculty, faculty1, faculty2;
        Staff staff, staff1, staff2;
        Student student, student1, student2;

        // Instantiating objects
        employee = new Employee();
        employee1 = new Employee();
        employee2 = new Employee();
        faculty = new Faculty();
        faculty1 = new Faculty();
        faculty2 = new Faculty();
        staff = new Staff();
        staff1 = new Staff();
        staff2 = new Staff();
        student = new Student();
        student1 = new Student();
        student2 = new Student();

        // Configuring objects

        // Adding to ArrayList
        persons.add(employee);
        persons.add(employee1);
        persons.add(employee2);
        persons.add(faculty);
        persons.add(faculty1);
        persons.add(faculty2);
        persons.add(staff);
        persons.add(staff1);
        persons.add(staff2);
        persons.add(student);
        persons.add(student1);
        persons.add(student2);

        // Output
        for (Person person : persons){
            System.out.println(person.toString());
        }
    }
}
