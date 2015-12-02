/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sensors;

import Business.UserAccount.UserAccount;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author user
 */
public class RFID {
    private String rfid;
    private UserAccount supplier;
    private UserAccount retailer;
    private UserAccount farmer;
    private UserAccount customer;
    private UserAccount driver;
    private Date expiryDate;
    private Date farmerShippingDate;
    private Date supplierShippingDate;
    private Date productSoldDate;

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }
    
    public RFID(){
        rfid = getRandomHexString();
    }
    
    private String getRandomHexString(){
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        while(sb.length() < 6){
            sb.append(Integer.toHexString(r.nextInt()));
        }
        return sb.toString().substring(0, 6);
    }

    public UserAccount getSupplier() {
        return supplier;
    }

    public void setSupplier(UserAccount supplier) {
        this.supplier = supplier;
    }

    public UserAccount getRetailer() {
        return retailer;
    }

    public void setRetailer(UserAccount retailer) {
        this.retailer = retailer;
    }

    public UserAccount getFarmer() {
        return farmer;
    }

    public void setFarmer(UserAccount farmer) {
        this.farmer = farmer;
    }

    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
        this.customer = customer;
    }

    public UserAccount getDriver() {
        return driver;
    }

    public void setDriver(UserAccount driver) {
        this.driver = driver;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getFarmerShippingDate() {
        return farmerShippingDate;
    }

    public void setFarmerShippingDate(Date farmerShippingDate) {
        this.farmerShippingDate = farmerShippingDate;
    }

    public Date getSupplierShippingDate() {
        return supplierShippingDate;
    }

    public void setSupplierShippingDate(Date supplierShippingDate) {
        this.supplierShippingDate = supplierShippingDate;
    }

    public Date getProductSoldDate() {
        return productSoldDate;
    }

    public void setProductSoldDate(Date productSoldDate) {
        this.productSoldDate = productSoldDate;
    }

    @Override
    public String toString() {
        return rfid;
    } 
    
}
