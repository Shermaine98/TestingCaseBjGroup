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
public class ItemBean {
        private String itemName;
        private String itemDesc;
        private int itemid;
        private Double itemPrice;

    public ItemBean(String itemName, String itemDesc, int itemid, double itemPrice) {
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemid = itemid;
        this.itemPrice = itemPrice;
    }
    
    public ItemBean(String itemName, String itemDesc, double itemPrice){
         this.itemName = itemName;
        this.itemDesc = itemDesc;

        this.itemPrice = itemPrice;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

        
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
        
        
    
}
