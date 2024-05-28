package org.example;

import java.util.HashMap;
import java.util.Map;

public class University {
    private Map<String, Course> courses = new HashMap<>(); // changed variable name

    public void addCourse(final Course course) { // made parameter final
        if (course != null && !courses.containsKey(course.getCourseName()))
            courses.put(course.getCourseName(), course);
    }

    public void registerStudentForCourse(final Student student, final Course course) { // made parameters final
        if (courses.containsKey(course.getCourseName())) {
            courses.get(course.getCourseName()).addStudent(student);
        }
    }

    public void printEnrollments() {
        for (Course course : courses.values()) {
            System.out.println("Course: " + course.getCourseName());
            for (Student student : course.getStudents()) { // added getter
                System.out.println("Student: " + student.getName());
            }
        }
    }

    public Map<String, Course> getCourses() {
        return courses;
    }
}