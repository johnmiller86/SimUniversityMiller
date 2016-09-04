package com.johnmillercoding.SimUniversityMiller;

import java.util.ArrayList;

/**
 * @author John D. Miller
 * @since 09/03/2016
 * @version 1.0.1
 * com.johnmillercoding.SimUniversityMiller.Main method to demonstrate objects.
 */
class Main {

    public static void main(String[] args) {

        // ArrayList to hold objects
        ArrayList<Person> persons = new ArrayList<>();

        // Object declarations
        Faculty faculty, faculty1, faculty2;
        Staff staff, staff1, staff2;
        Student student, student1, student2;

        // Instantiating objects
        faculty = new Faculty();
        faculty1 = new Faculty();
        faculty2 = new Faculty();
        staff = new Staff();
        staff1 = new Staff();
        staff2 = new Staff();
        student = new Student();
        student1 = new Student();
        student2 = new Student();

        // Configuring students
        student.setfName("John");
        student.setlName("Miller");
        student.setPhone("(111) 111-1111");
        student.setEmail("j.miller@example.com");
        student.setYear(Student.YEAR_SENIOR);

        student1.setfName("Guy");
        student1.setlName("Walker");
        student1.setPhone("(222) 222-2222");
        student1.setEmail("g.walker@example.com");
        student1.setYear(Student.YEAR_JUNIOR);

        student2.setfName("Josh");
        student2.setlName("Phillips");
        student2.setPhone("(333) 333-3333");
        student2.setEmail("j.phillips@example.com");
        student2.setYear(Student.YEAR_FRESHMAN);

        // Configuring faculty
        faculty.setfName("Bob");
        faculty.setlName("Williams");
        faculty.setPhone("(444) 444-4444");
        faculty.setEmail("b.williams@example.com");
        faculty.setOffice("Main 106");
        faculty.setOfficePhone("(555) 555-5555");
        faculty.setEmploymentStart("10-22-2013");
        faculty.setRank(Faculty.RANK_ASSOCIATE_PROFESSOR);

        faculty1.setfName("Will");
        faculty1.setlName("Roberts");
        faculty1.setPhone("(666) 666-6666");
        faculty1.setEmail("w.roberts@example.com");
        faculty1.setOffice("Main 214");
        faculty1.setOfficePhone("(777) 777-7777");
        faculty1.setEmploymentStart("02-14-1999");
        faculty1.setRank(Faculty.RANK_PROFESSOR);

        faculty2.setfName("Shirley");
        faculty2.setlName("Twain");
        faculty2.setPhone("(888) 888-8888");
        faculty2.setEmail("s.twain@example.com");
        faculty2.setOffice("Main 208");
        faculty2.setOfficePhone("(999) 999-9999");
        faculty2.setEmploymentStart("09-03-2011");
        faculty2.setRank(Faculty.RANK_ASSISTANT_PROFESSOR);

        // Configuring staff
        staff.setfName("George");
        staff.setlName("Madden");
        staff.setPhone("(111) 222-3333");
        staff.setEmail("g.madden@example.com");
        staff.setOffice("Commons 110");
        staff.setOfficePhone("(444) 555-6666");
        staff.setEmploymentStart("07-12-1997");
        staff.setTitle("Coach");

        staff1.setfName("Janice");
        staff1.setlName("Smith");
        staff1.setPhone("(777) 888-9999");
        staff1.setEmail("j.smith@example.com");
        staff1.setOffice("Library 102");
        staff1.setOfficePhone("(999) 888-7777");
        staff1.setEmploymentStart("03-03-2003");
        staff1.setTitle("Librarian");

        staff2.setfName("Joe");
        staff2.setlName("Jackson");
        staff2.setPhone("(666) 555-4444");
        staff2.setEmail("j.jackson@example.com");
        staff2.setOffice("Main 314");
        staff2.setOfficePhone("(333) 222-1111");
        staff2.setEmploymentStart("10-11-2012");
        staff2.setTitle("Counselor");

        // Adding to ArrayList
        persons.add(student);
        persons.add(student1);
        persons.add(student2);
        persons.add(faculty);
        persons.add(faculty1);
        persons.add(faculty2);
        persons.add(staff);
        persons.add(staff1);
        persons.add(staff2);

        // Output
        for (Person person : persons){
            System.out.println(person.toString());
        }
    }
}
