/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.academy.entity;

/**
 *
 * @author charm_000
 */
public class Enroll {
    private int id, studentId, courseId;
    
    Enroll(){
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Enroll{" + "id=" + id + ", studentId=" + studentId + ", courseId=" + courseId + '}';
    }
    
    
}
