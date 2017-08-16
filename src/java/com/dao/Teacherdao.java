/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Teacher;
import com.util.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Saugat
 */
public class Teacherdao {

    public void insertNewTeacher(Teacher teacher) {
        try {
            Connection con = Connect.connector();
            String qry = "INSERT INTO teacher_info(TeacherId, TeacherName, TeacherPhone, FacultyId) VALUES (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(qry);
            pst.setString(1, teacher.getTeacherId());
            pst.setString(2, teacher.getTeacherName());
            pst.setString(3, teacher.getTeacherPhone());
            pst.setString(4, teacher.getFacultyId());
            pst.execute();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
