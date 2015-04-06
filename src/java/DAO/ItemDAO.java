/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.ItemBean;
import DBConnection.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author colleensasoy
 */
public class ItemDAO {
    public void addItem(ItemBean itemBean, int supplierID) throws SQLException{
        Connector c = new Connector();
        Connection connection = c.getConnection();
        String query = "INSERT INTO items (itemid, itemname, itemmodel, itemprice) VALUES(null,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, itemBean.getItemName());
        ps.setString(2, itemBean.getItemDesc());
        ps.setDouble(3, itemBean.getItemPrice());
        ps.executeUpdate();
        query = "SELECT LAST_INSERT_ID() as itemid";
        ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        rs.next();
        int itemid = rs.getInt("itemid");
        query = "INSERT INTO supplier_inventory (idsupplier, iditem) VALUES (?, ?)";
        ps = connection.prepareStatement(query);
        ps.setInt(1, supplierID);
        ps.setInt(2, itemid);
        ps.executeUpdate();
                
    }
    
    public ArrayList<ItemBean> getAllItems() throws SQLException{
        Connector c = new Connector();
        Connection connection = c.getConnection();
        String query = "SELECT * FROM items";
        PreparedStatement ps = connection.prepareStatement(query);
        ArrayList<ItemBean> itemList = new ArrayList();
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
         itemList.add(new ItemBean(rs.getString("itemname"),rs.getString("itemmodel"), rs.getInt("itemid"), rs.getDouble("itemprice")));
         
        }
        rs.close();
        return itemList;
        
    }
    
    public ArrayList<ItemBean> getAllItems(int supplierID) throws SQLException{
        Connector c = new Connector();
        Connection connection = c.getConnection();
        String query = "SELECT * FROM items, supplier_inventory WHERE supplier_inventory.iditem = items.itemid AND supplier_inventory.idsupplier = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, supplierID);
        ArrayList<ItemBean> itemList = new ArrayList();
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
         itemList.add(new ItemBean(rs.getString("itemname"),rs.getString("itemmodel"), rs.getInt("itemid"), rs.getDouble("itemprice")));
         
        }
        rs.close();
        return itemList;
        
    }
    
    public ItemBean getItem(int itemID) throws SQLException{
     Connector c = new Connector();
     Connection connection = c.getConnection();
     ItemBean itemBean = null;
     String query = "SELECT * FROM items where itemid = ?";
     PreparedStatement ps = connection.prepareStatement(query);
     ps.setInt(1, itemID);
     ResultSet rs = ps.executeQuery();
     while(rs.next()){
         itemBean = new ItemBean(rs.getString("itemname"),rs.getString("itemmodel"),rs.getInt("itemid"),rs.getDouble("itemprice"));
      
     }
     rs.close();
     
     return itemBean;
        
    }
    
}
