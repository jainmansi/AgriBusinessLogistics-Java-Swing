/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.Sensors.RFID;

/**
 *
 * @author user
 */
public class Product {
    private String name;
    private int price;
    private String perish;
    private String batchNumber;
    private static int counter = 0;
    
   

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }        

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPerish() {
        return perish;
    }

    public void setPerish(String perish) {
        this.perish = perish;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }
    

    @Override
    public String toString() {
        return name;
    }   
    
}
