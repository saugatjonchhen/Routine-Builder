/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.util.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Saugat
 */
public class Assignmentdao {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    List subjectList;

    public List getList(int semId) {
        try {
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrationServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistrationServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
             */

            String qry = "SELECT SubjectName FROM subject_info where SemesterId = ?";
            //out.println("Query: " + qry);
            Connection conn = Connect.connector();
            stmt = conn.prepareStatement(qry);
            stmt.setInt(1, semId);
            rs = stmt.executeQuery();
            //out.println("rs.getInt: ");
            subjectList = new ArrayList();
            while (rs.next()) {
                //System.out.println("number... " + rs.getInt("agent_UID"));
                subjectList.add(rs.getString(1));
                /*agentList.add(rs.getString("agent_Email"));
                    agentList.add(rs.getString("agent_Name"));
                    agentList.add(rs.getString("agent_Surname"));
                    agentList.add(rs.getString("agent_Contact_Number"));*/
            }   // end while loop
        } catch (SQLException e) {
            System.out.println("view agents: An Exception has occurred! " + e);
        } catch (Exception e) {
            System.out.println("view agents: An Exception has occurred! " + e);

        } finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                }
                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception e) {
                }
                stmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                }
                conn = null;

                // end try
            }
        }
        return subjectList;
    }
}
