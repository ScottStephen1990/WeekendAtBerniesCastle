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

    @Override
    public String toString() {
        return "Inventory{" + "maxNumberOfType=" + maxNumberOfType + ", maxSlots=" + maxSlots + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.maxNumberOfType) != Double.doubleToLongBits(other.maxNumberOfType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxSlots) != Double.doubleToLongBits(other.maxSlots)) {
            return false;
        }
        return true;
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
