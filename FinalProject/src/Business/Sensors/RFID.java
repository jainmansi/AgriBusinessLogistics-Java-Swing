/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sensors;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author user
 */
public class RFID {
    private int rfid;
    private UserAccount supplier;
    private UserAccount retailer;
    private UserAccount distributor;
    private UserAccount farmer;
    private UserAccount customer;
    private UserAccount driver;
    private Date expiryDate;
    private Date farmerShippingDate;
    private Date supplierReceiveDate;
    private Date supplierShippingDate;
    private Date distributorReceiveDate;
    private Date distributorShippingDate;
    private Date retailerReceiveDate;
    private Date productSoldDate;

    public int getRfid() {
        return rfid;
    }

    public void setRfid(int rfid) {
        this.rfid = rfid;
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

    public UserAccount getDistributor() {
        return distributor;
    }

    public void setDistributor(UserAccount distributor) {
        this.distributor = distributor;
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

    public Date getSupplierReceiveDate() {
        return supplierReceiveDate;
    }

    public void setSupplierReceiveDate(Date supplierReceiveDate) {
        this.supplierReceiveDate = supplierReceiveDate;
    }

    public Date getSupplierShippingDate() {
        return supplierShippingDate;
    }

    public void setSupplierShippingDate(Date supplierShippingDate) {
        this.supplierShippingDate = supplierShippingDate;
    }

    public Date getDistributorReceiveDate() {
        return distributorReceiveDate;
    }

    public void setDistributorReceiveDate(Date distributorReceiveDate) {
        this.distributorReceiveDate = distributorReceiveDate;
    }

    public Date getDistributorShippingDate() {
        return distributorShippingDate;
    }

    public void setDistributorShippingDate(Date distributorShippingDate) {
        this.distributorShippingDate = distributorShippingDate;
    }

    public Date getRetailerReceiveDate() {
        return retailerReceiveDate;
    }

    public void setRetailerReceiveDate(Date retailerReceiveDate) {
        this.retailerReceiveDate = retailerReceiveDate;
    }

    public Date getProductSoldDate() {
        return productSoldDate;
    }

    public void setProductSoldDate(Date productSoldDate) {
        this.productSoldDate = productSoldDate;
    }
    
    
}
