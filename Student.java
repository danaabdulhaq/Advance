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
public class Student {

 private int SID;
    private String name;
    private String email;
    private ArrayList<Course> enrolldcourses;
    public Student(int SID, String name, String email) {
        this.SID = SID;
        this.name = name;
        this.email = email;
        this.enrolldcourses = new ArrayList<>();
    }


   

    public void setSID(int SID) {
        this.SID = SID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setenrolldcourses(ArrayList<Course> enrolldcourses) {
        this.enrolldcourses = enrolldcourses;
    }

    public int getSID() {
        return SID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Course> getenrolldcourses() {
        return enrolldcourses;
    }



}
