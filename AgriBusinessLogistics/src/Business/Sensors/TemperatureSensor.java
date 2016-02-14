/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sensors;

/**
 *
 * @author user
 */
public class TemperatureSensor {
    private double currentTemperature;
    private double idealTemperature;
    private String perishability;

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public double getIdealTemperature() {
        return idealTemperature;
    }

    public void setIdealTemperature(double idealTemperature) {
        this.idealTemperature = idealTemperature;
    }

    

    public String getPerishability() {
        return perishability;
    }

    public void setPerishability(String perishability) {
        this.perishability = perishability;
    }
    
    
}
