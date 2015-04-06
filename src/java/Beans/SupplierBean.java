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
public class SupplierBean {
    private int supplierID;
    private String supplierName;
    private String supplierAddress;
    private String supplierZipCode;
    private String supplierPhone;
    private String supplierCountry;
    private String supplierEmail;
    private String supplierCPPhone;
    private String supplierCPFirstName;
    private String supplierCPLastName;
    private String supplierCPEmail;

    public SupplierBean( int supplierID, String supplierName,  String supplierAddress, String supplierZipCode, String supplierPhone, String supplierCountry, String supplierEmail, String supplierCPPhone, String supplierCPFirstName, String supplierCPLastName, String supplierCPEmail) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.supplierZipCode = supplierZipCode;
        this.supplierPhone = supplierPhone;
        this.supplierCountry = supplierCountry;
        this.supplierEmail = supplierEmail;
        this.supplierCPPhone = supplierCPPhone;
        this.supplierCPFirstName = supplierCPFirstName;
        this.supplierCPLastName = supplierCPLastName;
        this.supplierCPEmail = supplierCPEmail;
    }
    
    public SupplierBean( String supplierName,  String supplierAddress, String supplierZipCode, String supplierPhone, String supplierCountry, String supplierEmail, String supplierCPPhone, String supplierCPFirstName, String supplierCPLastName, String supplierCPEmail) {
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.supplierZipCode = supplierZipCode;
        this.supplierPhone = supplierPhone;
        this.supplierCountry = supplierCountry;
        this.supplierEmail = supplierEmail;
        this.supplierCPPhone = supplierCPPhone;
        this.supplierCPFirstName = supplierCPFirstName;
        this.supplierCPLastName = supplierCPLastName;
        this.supplierCPEmail = supplierCPEmail;
    }

    
    
    public String getSupplierAddress() {
        return supplierAddress;
    }

    public String getSupplierCPPhone() {
        return supplierCPPhone;
    }

    public void setSupplierCPPhone(String supplierCPPhone) {
        this.supplierCPPhone = supplierCPPhone;
    }
    
    

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierZipCode() {
        return supplierZipCode;
    }

    public void setSupplierZipCode(String supplierZipCode) {
        this.supplierZipCode = supplierZipCode;
    }

    public String getSupplierCountry() {
        return supplierCountry;
    }

    public void setSupplierCountry(String supplierCountry) {
        this.supplierCountry = supplierCountry;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public String getSupplierCPFirstName() {
        return supplierCPFirstName;
    }

    public void setSupplierCPFirstName(String supplierCPFirstName) {
        this.supplierCPFirstName = supplierCPFirstName;
    }

    public String getSupplierCPLastName() {
        return supplierCPLastName;
    }

    public void setSupplierCPLastName(String supplierCPLastName) {
        this.supplierCPLastName = supplierCPLastName;
    }

    public String getSupplierCPEmail() {
        return supplierCPEmail;
    }

    public void setSupplierCPEmail(String supplierCPEmail) {
        this.supplierCPEmail = supplierCPEmail;
    }


    
    
    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }



    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
    }
    
    
    
}
