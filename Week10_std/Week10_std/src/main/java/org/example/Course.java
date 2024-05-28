package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private static int totalCourses; // unnecessary initial value removed, changed variable name
    private String courseName; // changed variable name
    private final int capacity; // changed variable name
    private List<Student> students = new ArrayList<>(); // changed variable name

    public Course(final String name, final int capacity) { // made "name" and "capacity" final
        courseName = name;
        this.capacity = capacity;
        totalCourses++;
    }

    public void addStudent(final Student student) { // made parameter final
        if (students.size() < capacity) // changed variable name
            students.add(student); // changed variable name
    }

    public String getCourseName() {
        return courseName;
    }

    public static int getTotalCourses() { return totalCourses; }

    public List<Student> getStudents() {
        return students;
    }
}