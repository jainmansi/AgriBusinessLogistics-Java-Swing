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
public class HumiditySensorDirectory {
    private ArrayList<HumiditySensor> humiditySensorList;
    
    public HumiditySensorDirectory(){
        humiditySensorList = new ArrayList<>();
    }

    public ArrayList<HumiditySensor> getHumiditySensorList() {
        return humiditySensorList;
    }

    public void setHumiditySensorList(ArrayList<HumiditySensor> humiditySensorList) {
        this.humiditySensorList = humiditySensorList;
    }          
    
    public HumiditySensor addHumidity(double current, String type){
        HumiditySensor temp = new HumiditySensor();
        humiditySensorList.add(temp);
        temp.setCurrentHumidity(current);
        temp.setType(type);
        return temp;
    }
    
    public void removeHumidity(HumiditySensor temp){
        humiditySensorList.remove(temp);
    }
}
