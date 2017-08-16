/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.User;
import com.util.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Saugat
 */
public class Userdao {
    public User ValidUser(User user){
        try{
            Connection con=Connect.connector();
            String qry="Select * from login where UserName=? and Password=?";
            PreparedStatement pst= con.prepareStatement(qry);
            pst.setString(1, user.getUname());
            pst.setString(2, user.getPwd());
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                User users=new User();
                users.setId(rs.getInt("SNo."));
                users.setUname(rs.getString("UserName"));
                users.setPwd(rs.getString("Password"));
                return users;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
      return null;  
    }
    
    public void insertnewUser(User user){
            try{
            Connection con=Connect.connector();
            String qry="insert into login(UserName,Password) values(?,?)";
            PreparedStatement pst=con.prepareStatement(qry);
            pst.setString(1,user.getUname());
            pst.setString(2,user.getPwd());
            pst.execute();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    
    public List<User> getUserInfo(){
        try{
            List<User> user=new ArrayList<User>();
            Connection con=Connect.connector();
            String qry="Select * from login";
            PreparedStatement pst= con.prepareStatement(qry);
            ResultSet rs=pst.executeQuery();
            int i=0;
            while(rs.next()){
                i++;
                User u =new User();
                u.setUname(rs.getString("UserName"));
                u.setPwd(rs.getString("Password"));
                u.setId(rs.getInt("ID"));
                System.out.println(i);
                user.add(u);
            }
            System.out.println(i);
            con.close();
            return user;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
}
    
    public User getUser(int userId){
        try{
            Connection con=Connect.connector();
            String qry="Select * from login where ID=?";
            PreparedStatement pst= con.prepareStatement(qry);
            pst.setInt(1, userId);
            ResultSet rs=pst.executeQuery();
            User u = new User();
            while(rs.next()){
                u.setUname(rs.getString("UserName"));
                u.setPwd(rs.getString("Password"));
                u.setId(rs.getInt("ID"));
            }
            //con.close();
            return u;
                    
        }
        catch(Exception e){    
            e.printStackTrace();
        }
        return null;
}
    public void deleteUser(int userId){
        try{
            Connection con=Connect.connector();
            String qry="delete from login where ID=?";
            PreparedStatement pst=con.prepareStatement(qry);
            pst.setInt(1,userId);
            pst.executeUpdate();
            con.close();
        }catch(Exception e){
            System.out.println("query wrong");
        }
    }
    
    public void updateUser(User user){
         try{
            Connection con=Connect.connector();
            String qry="update login set UserName=?,Password=? where ID=?";
            PreparedStatement pst=con.prepareStatement(qry);
            pst.setString(1,user.getUname());
            pst.setString(2,user.getPwd());
            pst.setInt(3,user.getId());
            pst.executeUpdate();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
