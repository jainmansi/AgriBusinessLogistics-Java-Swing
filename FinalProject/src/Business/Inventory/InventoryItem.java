/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.Product.Product;
import Business.Sensors.RFID;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author user
 */
public class InventoryItem {
    private Product product;
    private String name;
    private int quantity;
    private int threshold;
    private Queue<RFID> rfid;
    
    public InventoryItem(){
        rfid = new LinkedList<>();
    }

    public Product getProduct() {
        return product;
    }

    public Queue<RFID> getRfid() {
        return rfid;
    }

    public void setRfid(Queue<RFID> rfid) {
        this.rfid = rfid;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public String toString() {
        return name;
    }   
    
    
    
}
