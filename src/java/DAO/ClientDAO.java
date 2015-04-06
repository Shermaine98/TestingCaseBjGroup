/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.ClientBean;
import DBConnection.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author JManacmol
 */
public class ClientDAO {
    
    public boolean addClient(ClientBean client){
        try{
        Connector c = new Connector();
        Connection connection = c.getConnection();
        String query = "INSERT INTO client (comp_id, comp_name, comp_address,comp_zipcode"
                + ", comp_country, comp_phone, comp_email, ccp_name, ccp_phone, ccp_email)" + " VALUES(null, ?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, client.getCompanyName());
        ps.setString(2, client.getCompanyAddress());
        ps.setString(3, client.getZip());
        ps.setString(4, client.getCountry());
        ps.setString(5, client.getPhone());
        ps.setString(6, client.getEmail());
        ps.setString(7, client.getContactPerson());
        ps.setString(8, client.getContactPhone());
        ps.setString(9, client.getContactEmail());
        
        ps.executeUpdate();
        return true;
        }catch(SQLException exc){
         return false;   
        }
    }
    
}
