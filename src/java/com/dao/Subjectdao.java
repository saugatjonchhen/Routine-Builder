/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Subject;
import com.util.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Saugat
 */
public class Subjectdao {
    
    public void insertNewSubject(Subject sub) {
        try {
            Connection con = Connect.connector();
            String qry = "INSERT INTO subject_info(SubjectCode, SubjectName, SemesterId, FacultyId) VALUES (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(qry);
            pst.setString(1, sub.getSubjectCode());
            pst.setString(2, sub.getSubjectName());
            pst.setInt(3, sub.getSemesterId());
            pst.setString(4, sub.getFacultyId());
            pst.execute();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
