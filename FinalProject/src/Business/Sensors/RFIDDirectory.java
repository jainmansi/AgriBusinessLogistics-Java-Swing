/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sensors;

import Business.Product.Product;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class RFIDDirectory {
    private ArrayList<RFID> rfidList;
    
    public RFIDDirectory(){
        rfidList = new ArrayList<RFID>();
    }

    public ArrayList<RFID> getRfidList() {
        return rfidList;
    }

    public void setRfidList(ArrayList<RFID> rfidList) {
        this.rfidList = rfidList;
    }   
    
    public RFID addRFID(){
        RFID rfid = new RFID();
        rfidList.add(rfid);
        return rfid;        
    }
    
    public void removeRFID(RFID rfid){
        rfidList.remove(rfid);
    }
}
