/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author colleensasoy
 */
public class ProcureBean {
        private int supplierID;
        private int quantity;
        private int itemID;
        private int userID;

    public ProcureBean(int supplierID, int quantity, int itemID, int userID) {
        this.supplierID = supplierID;
        this.quantity = quantity;
        this.userID = userID;
        this.itemID = itemID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    
    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
       
        
        
        
        
}
