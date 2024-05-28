package org.example;

public class Student {
    public String studentName; // changed variable name
    public String studentID; // changed variable name

    public Student(final String name, final String id) { // made parameters final
        studentName = name;
        studentID = id; // changed variable name
    }

    public String getName() {
        return studentName;
    }
}