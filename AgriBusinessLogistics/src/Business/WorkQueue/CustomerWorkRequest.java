/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Product.Product;
import Business.Sensors.RFID;

/**
 *
 * @author user
 */
public class CustomerWorkRequest extends WorkRequest{
    private Product product;
    private String issue;
    private String FDAMessage;
    private RFID rfid;

    public RFID getRfid() {
        return rfid;
    }

    public void setRfid(RFID rfid) {
        this.rfid = rfid;
    }
   
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }  

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getFDAMessage() {
        return FDAMessage;
    }

    public void setFDAMessage(String FDAMessage) {
        this.FDAMessage = FDAMessage;
    }

    @Override
    public String toString() {
        return this.getProduct().getName();
    }
    
}
