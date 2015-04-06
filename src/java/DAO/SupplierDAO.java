/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.SupplierBean;
import DBConnection.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author colleensasoy
 */
public class SupplierDAO {
    public boolean addSupplier(SupplierBean supplier){
        try{
        Connector c = new Connector();
        Connection connection = c.getConnection();
        String query = "INSERT INTO supplier (supp_id, supp_name, supp_address,supp_zipcode"
                + ", supp_country, supp_phone, supp_email, scp_firstname, scp_lastname, scp_phone, "
                + "scp_email) VALUES(null, ?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, supplier.getSupplierName());
        ps.setString(2, supplier.getSupplierAddress());
        ps.setString(3, supplier.getSupplierZipCode());
        ps.setString(4, supplier.getSupplierCountry());
        ps.setString(5, supplier.getSupplierPhone());
        ps.setString(6, supplier.getSupplierEmail());
        ps.setString(7, supplier.getSupplierCPFirstName());
        ps.setString(8, supplier.getSupplierCPLastName());
        ps.setString(9, supplier.getSupplierCPPhone());
        ps.setString(10, supplier.getSupplierCPEmail());
        
        ps.executeUpdate();
        return true;
        }catch(SQLException exc){
         return false;   
        }
        
    }
    
    public ArrayList<SupplierBean> getAllSuppliers() throws SQLException{
       Connector c = new Connector();
       Connection connection = c.getConnection();
       String query = "SELECT * FROM supplier";
       PreparedStatement ps = connection.prepareStatement(query);
       ResultSet rs = ps.executeQuery();
       ArrayList<SupplierBean> supplierList = new ArrayList();
       while(rs.next()){
           supplierList.add(new SupplierBean(rs.getInt("supp_id"), rs.getString("supp_name"), 
                   rs.getString("supp_address"), rs.getString("supp_zipcode"), 
                   rs.getString("supp_country"), rs.getString("supp_phone"), 
                   rs.getString("supp_email"), rs.getString("scp_firstname")
                   , rs.getString("scp_lastname"), rs.getString("scp_phone")
                   , rs.getString("scp_email")));
          
       }
       rs.close();
       return supplierList;
       
        
    }
    
    public SupplierBean getSupplier(int supplierID){
       Connector c = new Connector();
       Connection connection = c.getConnection();
       String query = "SELECT * FROM supplier WHERE supp_id = ?";
       PreparedStatement ps;
       
        try {
            ps = connection.prepareStatement(query);
             ps.setInt(1, supplierID);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
             SupplierBean supplier = new SupplierBean(rs.getInt("supp_id"), rs.getString("supp_name"), 
                   rs.getString("supp_address"), rs.getString("supp_zipcode"), 
                   rs.getString("supp_country"), rs.getString("supp_phone"), 
                   rs.getString("supp_email"), rs.getString("scp_firstname")
                   , rs.getString("scp_lastname"), rs.getString("scp_phone")
                   , rs.getString("scp_email")); 
             return supplier;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
      
       
    }
    
}
