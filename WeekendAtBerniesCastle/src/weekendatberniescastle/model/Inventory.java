/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.model;

import java.io.Serializable;
/**
 *
 * @author Stephen Scott
 */
public class Inventory implements Serializable {
    
    private double maxNumberOfType;
    private double maxSlots;
    
    public Inventory(){
    }

    public double getMaxNumberOfType() {
        return maxNumberOfType;
    }

    public void setMaxNumberOfType(double maxNumberOfType) {
        this.maxNumberOfType = maxNumberOfType;
    }

    public double getMaxSlots() {
        return maxSlots;
    }

    public void setMaxSlots(double maxSlots) {
        this.maxSlots = maxSlots;
    }
    
}
