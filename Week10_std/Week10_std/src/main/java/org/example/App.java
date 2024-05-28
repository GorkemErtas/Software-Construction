package org.example;

public class App
{
    public static void main(final String[] args) { // made parameter final
        final University myUniversity = new University(); // made variable final and changed variable name
        final Student stud1 = new Student("Jane Doe", "001"); // made variable final
        final Student student2 = new Student("John Smith", "002"); // made variable final
        final Course course1 = new Course("Software Engineering", 30); // made variable final
        final Course course2 = new Course("Data Structures", 40); // made variable final

        myUniversity.addCourse(course1); // changed variable name
        myUniversity.addCourse(course2); // changed variable name
        myUniversity.registerStudentForCourse(stud1, course1); // changed variable name
        myUniversity.registerStudentForCourse(student2, course2); // changed variable name

        System.out.println("Total courses offered: " + Course.getTotalCourses());
        myUniversity.printEnrollments();
    }
}