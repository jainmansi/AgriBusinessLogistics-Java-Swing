/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.Sensors.HumiditySensorDirectory;
import Business.Sensors.TemperatureSensor;
import Business.Sensors.TemperatureSensorDirectory;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Inventory {
    private ArrayList<InventoryItem> inventoryList;
    private TemperatureSensorDirectory temperatureSensorDirectory;
    private HumiditySensorDirectory humiditySensorDirectory;
    
    public Inventory(){
        inventoryList = new ArrayList<>();
        temperatureSensorDirectory = new TemperatureSensorDirectory();
        humiditySensorDirectory = new HumiditySensorDirectory();
    }

    public ArrayList<InventoryItem> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<InventoryItem> inventoryList) {
        this.inventoryList = inventoryList;
    }

    public TemperatureSensorDirectory getTemperatureSensorDirectory() {
        return temperatureSensorDirectory;
    }

    public void setTemperatureSensorDirectory(TemperatureSensorDirectory temperatureSensorDirectory) {
        this.temperatureSensorDirectory = temperatureSensorDirectory;
    }   
    
    public InventoryItem addInventory(){
        InventoryItem inventory = new InventoryItem();
        inventoryList.add(inventory);
        return inventory;
    }
    
    public void removeInventory(InventoryItem inventory){
        inventoryList.remove(inventory);
    }   

    public HumiditySensorDirectory getHumiditySensorDirectory() {
        return humiditySensorDirectory;
    }

    public void setHumiditySensorDirectory(HumiditySensorDirectory humiditySensorDirectory) {
        this.humiditySensorDirectory = humiditySensorDirectory;
    }
    
    
}
