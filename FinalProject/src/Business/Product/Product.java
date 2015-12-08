/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.Comparator;

/**
 *
 * @author user
 */
public class Product implements Comparable<Product>, Comparator<Product>{
    private String name;
    private int price;
    private String perish;
    private String batchNumber;
    private int unresolvedcases;
    private int totalCases = 0;
    private int soldCount = 0;
   

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

    public int getUnresolvedcases() {
        return unresolvedcases;
    }

    public void setUnresolvedcases(int unresolvedcases) {
        this.unresolvedcases = unresolvedcases;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }  
    
    @Override
    public String toString() {
        return name;
    }   

    public int getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(int soldCount) {
        this.soldCount = soldCount;
    }
    

    @Override
    public int compareTo(Product p) {
        int compareTotalCases = ((Product)p).getTotalCases();
        return compareTotalCases - this.totalCases;
    }
    @Override
    public int compare(Product o1, Product o2) {
        int soldCount1=o1.soldCount;
        int soldCount2=o2.soldCount;
        if(soldCount1>soldCount2)
        {
            return -1;
        }
        else if(soldCount1<soldCount2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
