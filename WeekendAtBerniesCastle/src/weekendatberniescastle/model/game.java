/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author MIc
 */
public class game {
    
    //variables
    private double playTime;
    
    //consturctor
    public game(double playTime) {
        this.playTime = playTime;
    }
    
    //converts the var to a String for debuging

    @Override
    public String toString() {
        return "game{" + "playTime=" + playTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.playTime) ^ (Double.doubleToLongBits(this.playTime) >>> 32));
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
        final game other = (game) obj;
        if (Double.doubleToLongBits(this.playTime) != Double.doubleToLongBits(other.playTime)) {
            return false;
        }
        return true;
    }
    
    //getter and setter
    public double getPlayTime() {
        return playTime;
    }

    public void setPlayTime(double playTime) {
        this.playTime = playTime;
    }
    
    
}
