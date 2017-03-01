/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.academy.entity;

import java.sql.Date;

/**
 *
 * @author charm_000
 */
public class Student {
    private int id;
    private String fname, lname, email;
    private int contactNo;
    private Date addedDate, modifiedDate;
    private boolean status;
   public Student(){
    }

    public Student(String fname, String lname, String email, int contactNo,boolean status) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.contactNo = contactNo;
        this.addedDate = addedDate;
        this.modifiedDate = modifiedDate;
        this.status = status;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFanme(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", contactNo=" + contactNo + ", addedDate=" + addedDate + ", modifiedDate=" + modifiedDate + ", status=" + status + '}';
    }
    
}
