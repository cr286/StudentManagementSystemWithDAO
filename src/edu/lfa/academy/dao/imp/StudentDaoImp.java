/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.academy.dao.imp;

import edu.lfa.academy.dao.StudentDao;
import edu.lfa.academy.entity.Student;
import edu.lfa.academy.utility.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author charm_000
 */
public class StudentDaoImp implements StudentDao{
   
    @Override
    public int insert(Student t) throws ClassNotFoundException, SQLException {
       String sql = "Insert into student(fname,lname,email,contact_no,status)values(?,?,?,?,?)";
        
        DbConnection dbCon= new DbConnection(sql);
        dbCon.openConnection();
        
        
        PreparedStatement stmt = dbCon.initStatement(sql);
        stmt.setString(1, t.getFname());
        stmt.setString(2, t.getLname());
        stmt.setString(3, t.getEmail());
        stmt.setInt(4, t.getContactNo());
        stmt.setBoolean(5, t.isStatus());
        int result= dbCon.executeUpdate();
        dbCon.closeConnection();
        return result;
    }

   
   
    

    @Override
    public int deleteById(int id) throws ClassNotFoundException, SQLException {
      String sql = "DELETE FROM `student` WHERE `student`.`id` = ?";
        
        DbConnection dbCon= new DbConnection(sql);
        dbCon.openConnection();
        Student std = new Student();
        PreparedStatement stmt = dbCon.initStatement(sql);
        stmt.setInt(1, id);
        int rs = dbCon.executeUpdate();  
        return rs;
    }

    @Override
    public Student getById(int id) throws ClassNotFoundException, SQLException {
        
          String sql = "Select * from student where id=?";
        
        DbConnection dbCon= new DbConnection(sql);
        dbCon.openConnection();
        Student std = new Student();
        PreparedStatement stmt = dbCon.initStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = dbCon.executeQuery();
           
        while(rs.next()){
            std.setId(rs.getInt("id"));
            std.setFanme(rs.getString("fname"));
            std.setLname(rs.getString("lname"));
            std.setEmail(rs.getString("email"));
            std.setAddedDate(rs.getDate("added_date"));
           // std.setModifiedDate(rs.getDate("modified_date"));
            std.setContactNo(rs.getInt("contact_no"));
            std.setStatus(rs.getBoolean("status"));
            
        }
        return std;
    }

    @Override
    public List<Student> getAll() throws ClassNotFoundException, SQLException {
         String sql = "Select * from student";
        
        DbConnection dbCon= new DbConnection(sql);
        dbCon.openConnection();
        
        List<Student> stList = new ArrayList<>();
        PreparedStatement stmt = dbCon.initStatement(sql);
        ResultSet rs = dbCon.executeQuery();
           
        while(rs.next()){
            Student std = new Student();
            std.setId(rs.getInt("id"));
            std.setFanme(rs.getString("fname"));
            std.setLname(rs.getString("lname"));
            std.setEmail(rs.getString("email"));
            std.setAddedDate(rs.getDate("added_date"));
           // std.setModifiedDate(rs.getDate("modified_date"));
            std.setContactNo(rs.getInt("contact_no"));
            std.setStatus(rs.getBoolean("status"));
            stList.add(std);
            
        }
        dbCon.closeConnection();
       return stList;
    }

    

    @Override
    public int update(Student t, int id) throws ClassNotFoundException, SQLException {
         String sql = "update student SET fname=?,lname=?,email=?,contact_no=?,status=? where id=?";
        
        DbConnection dbCon= new DbConnection(sql);
        dbCon.openConnection();
     
        
        PreparedStatement stmt = dbCon.initStatement(sql);
        stmt.setString(1, t.getFname());
        stmt.setString(2, t.getLname());
        stmt.setString(3, t.getEmail());
        stmt.setInt(4, t.getContactNo());
        stmt.setBoolean(5, t.isStatus());
        stmt.setInt(6, id);
        int result= dbCon.executeUpdate();
        dbCon.closeConnection();
        return result;
    }
    }
    

