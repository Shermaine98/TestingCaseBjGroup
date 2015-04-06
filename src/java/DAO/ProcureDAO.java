/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.ProcureBean;
import DBConnection.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author colleensasoy
 */
public class ProcureDAO {
    public boolean procureOrder(ArrayList<ProcureBean> procureList) throws SQLException{
        Connector c = new Connector();
        Connection connection = c.getConnection();
        String query = "INSERT INTO procurement (proc_id, supp_id, date_proc, preparedbyid_proc) VALUES (null, ?, CURDATE(),?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, procureList.get(0).getSupplierID());
        ps.setInt(2, procureList.get(0).getUserID());
        ps.executeUpdate();
        ps.close();
        query = "SELECT LAST_INSERT_ID() as max";
        ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        int max = 0;
        while(rs.next()){
            max = rs.getInt("max");
        }
        rs.close();
        ps.close();
        
        for(int i = 0 ; i < procureList.size();i++){
        
        
        
            
        
        if(max == 0)
            return false;
        else{
            ps.close();
      
        query = "INSERT INTO procitems (id, procItems_id, qty, item_id) VALUES(null, ?,?,?)";
        ps = connection.prepareStatement(query);
        ps.setInt(1, max);
        ps.setInt(2, procureList.get(i).getQuantity());
        ps.setInt(3, procureList.get(i).getItemID());
        ps.executeUpdate();
      
        
         
        
            
        ps.close();
        rs.close();
       
        }
        }
                
        return true;
    }
}
