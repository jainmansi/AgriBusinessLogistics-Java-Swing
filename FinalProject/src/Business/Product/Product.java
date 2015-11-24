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
    private int id;
    private int price;
    private RFID rfid;
    private static int counter = 0;
    
    public Product(){
        ++counter;
        id = counter;
        rfid = new RFID();
    }

    public RFID getRfid() {
        return rfid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }   
    
}
