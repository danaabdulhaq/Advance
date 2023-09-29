/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first.app.test;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class University {
     private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public University()
    {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudents(Student student)
    {
        students.add(student);
    }
    public void addCourses(Course course)
    {
        courses.add(course);
    }
    public void enrollStudent(Student student, Course course)
    {
        if(course.getStudentCOUNT() < course.getMaximum_Capacity())
        {
            student.getenrolldcourses().add(course);
            course.getStudents().add(student);
            course.increaseStudentCOUNT();
        }
        else {
            System.out.println("Course is Full.");
        }
    }
    public void dropStudent(Student student, Course course)
    {
        student.getenrolldcourses().remove(course);
        course.decreaseStudentCOUNT();
    }

    public void availabelCourses_Report()
    {
        System.out.println("Available Courses : ");
        courses.forEach((course) -> System.out.println(course.getTitle()));
    }

    public void StudentInSpecificCourse_Report(Course course)
    {
        System.out.println("Students enrolled in this course :" + course.getTitle());
        course.getStudents(). forEach((student) -> System.out.println(student.getName()));

    }

    public void StudentRegistrationsCourses_Report(Student student)
    {
        System.out.println(" Courses in which the student is registered: " + student.getName());
      student.getenrolldcourses().forEach((course) -> System.out.println(course.getTitle()));
    }

    public void AllReports(Student student, Course course)
    {
        this.StudentInSpecificCourse_Report(course);
        this.StudentRegistrationsCourses_Report(student);
        this.availabelCourses_Report();
    }
}
