/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Saugat
 */
public class Connect {
    public static Connection connector(){
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection cnnct=DriverManager.getConnection("jdbc:mysql://localhost:3306/routine builder","root","");
           return cnnct;
       } catch(Exception e){e.printStackTrace();}
       return null;
    }
}
