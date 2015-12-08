/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sensors;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class TemperatureSensorDirectory {
    private ArrayList<TemperatureSensor> tempSensorList;
    
    public TemperatureSensorDirectory(){
        tempSensorList = new ArrayList<>();
    }

    public ArrayList<TemperatureSensor> getTempSensorList() {
        return tempSensorList;
    }

    public void setTempSensorList(ArrayList<TemperatureSensor> tempSensorList) {
        this.tempSensorList = tempSensorList;
    }       
    
    public TemperatureSensor addTemp(double current, String type){
        TemperatureSensor temp = new TemperatureSensor();
        tempSensorList.add(temp);
        temp.setCurrentTemperature(current);
        temp.setPerishability(type);
        return temp;
    }
    
    public void removeTemp(TemperatureSensor temp){
        tempSensorList.remove(temp);
    }   
}
