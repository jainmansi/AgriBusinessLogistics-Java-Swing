/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Product.Product;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Order {
    private static int count = 0;
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private UserAccount buyer;
    private UserAccount seller;
    private String type;

    public Order() {
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<>();
    }
    
    public UserAccount getBuyer() {
        return buyer;
    }

    public void setBuyer(UserAccount buyer) {
        this.buyer = buyer;
    }

    public UserAccount getSeller() {
        return seller;
    }

    public void setSeller(UserAccount seller) {
        this.seller = seller;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }    

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public OrderItem addOrderItem(Product p, int q) {
        OrderItem o = new OrderItem();
        o.setProduct(p);
        o.setQuantity(q);
        orderItemList.add(o);
        return o;
    }
    public void removeOrderItem(OrderItem o) {
        orderItemList.remove(o);
    }    
}
