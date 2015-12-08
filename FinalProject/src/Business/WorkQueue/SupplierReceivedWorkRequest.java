/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Order.Order;

/**
 *
 * @author user
 */
public class SupplierReceivedWorkRequest extends WorkRequest{
    private int Quantity;
    private String productName;
    private int orderId;
    
    public int getQuantity() {
        return Quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }   

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName;
    }
    
}
