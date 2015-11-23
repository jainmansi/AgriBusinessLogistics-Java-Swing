/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Inventory {
    private ArrayList<InventoryItem> inventoryList;
    
    public Inventory(){
        inventoryList = new ArrayList<>();
    }

    public ArrayList<InventoryItem> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<InventoryItem> inventoryList) {
        this.inventoryList = inventoryList;
    }
    
    public InventoryItem addInventory(){
        InventoryItem inventory = new InventoryItem();
        inventoryList.add(inventory);
        return inventory;
    }
    
    public void removeInventory(InventoryItem inventory){
        inventoryList.remove(inventory);
    }    
}
