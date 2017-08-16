package com.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.dao.UserRegisterdao;
import com.dao.Userdao;
import com.model.User;
import com.model.UserRegister;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Saugat
 */
public class RegisterController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String firstName=request.getParameter("fName");
            String lastName=request.getParameter("lName");
            String emailId=request.getParameter("eMail");
            String abtYourself=request.getParameter("abtYou");
            String userName=request.getParameter("uName");
            String pwd=request.getParameter("passWd");
           
            UserRegister ur = new UserRegister();
            ur.setFirstName(firstName);
            ur.setLastName(lastName);
            ur.seteMail(emailId);
            ur.setDescription(abtYourself);
            ur.setUserName(userName);
            ur.setPassword(pwd);
            
            UserRegisterdao urdao = new UserRegisterdao();
            urdao.insertnewUser(ur);
            
            User u1 = new User();
            u1.setUname(userName);
            u1.setPwd(pwd);
            Userdao usr = new Userdao();
            usr.insertnewUser(u1);
            
            
            JOptionPane.showMessageDialog(null, "User Registered!!");
            response.sendRedirect("index.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
