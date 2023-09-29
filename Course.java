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
public class Course {
    
    	private int id;
                private String title;
                private String instructor;
                private int maximum_Capacity;
                private int StudentCOUNT;
                private ArrayList<Student> students;
                public Course(int id, String title, String instructor, int maximum_Capacity) {
                    this.id = id;
                    this.title = title;
                    this.instructor = instructor;
                    this.maximum_Capacity = maximum_Capacity;
                    this.StudentCOUNT = 0;
                    this.students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void increaseStudentCOUNT()
    {
        this.StudentCOUNT ++ ;
    }

    public void decreaseStudentCOUNT()
    {
        this.StudentCOUNT -- ;
    }


    public int getStudentCOUNT() {
        return StudentCOUNT;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getMaximum_Capacity() {
        return maximum_Capacity;
    }

    public void setMaximum_Capacity(int maximum_Capacity) {
        this.maximum_Capacity = maximum_Capacity;
    }
    
}
