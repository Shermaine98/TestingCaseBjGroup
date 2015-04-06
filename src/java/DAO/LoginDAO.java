/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DBConnection.Connector;
import Beans.UserBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author colleensasoy
 */
public class LoginDAO {
    
    public boolean login(UserBean user){
        try{
        Connector c = new Connector();
        Connection connection = c.getConnection();
        String query = "SELECT COUNT(*) FROM login WHERE username = ? and password=?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, user.getUserName());
        ps.setString(2, user.getPassword());
        ResultSet rs = ps.executeQuery();
        
        rs.next();
        int loginCount = rs.getInt(1);
        if(loginCount > 0 ){
            return true;
        }
        
        
        }catch(SQLException exc){
            return false;
        }
        return false;
    }
    
    public UserBean getUser(int userID){
     try{
         Connector c = new Connector();
         Connection con = c.getConnection();
         String query = "SELECT * FROM login WHERE userid = ?";
         PreparedStatement ps = con.prepareStatement(query);
         ps.setInt(1, userID);
         ResultSet rs = ps.executeQuery();
         if(rs.next()){
             UserBean userbean = new UserBean();
             userbean.setUserid(userID);
             userbean.setUserName(rs.getString("username"));
             userbean.setPassword(rs.getString("password"));
             return userbean;
         }
         return null;
         
     }
     catch(SQLException exc){
        return null;
     }
 
     }   
    
     public UserBean getUser(String username){
     try{
         Connector c = new Connector();
         Connection con = c.getConnection();
         String query = "SELECT * FROM login WHERE username = ?";
         PreparedStatement ps = con.prepareStatement(query);
         ps.setString(1, username);
         ResultSet rs = ps.executeQuery();
         if(rs.next()){
             UserBean userbean = new UserBean();
             userbean.setUserid(rs.getInt("userid"));
             userbean.setUserName(username);
             userbean.setPassword(rs.getString("password"));
             return userbean;
         }
         return null;
         
     }
     catch(SQLException exc){
        return null;
     }
 
     }   
    
}
    
    
    

