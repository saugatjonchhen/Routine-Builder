/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.UserRegister;
import com.util.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Saugat
 */
public class UserRegisterdao {
    
    public void insertnewUser(UserRegister ur){
            try{
            Connection con=Connect.connector();
            String qry="insert into register(FirstName,LastName,EMail,Description,UserName,Password) values(?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(qry);
            pst.setString(1,ur.getFirstName());
            pst.setString(2,ur.getLastName());
            pst.setString(3,ur.geteMail());
            pst.setString(4,ur.getDescription());
            pst.setString(5,ur.getUserName());
            pst.setString(6,ur.getPassword());
            pst.execute();
            con.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    
}
