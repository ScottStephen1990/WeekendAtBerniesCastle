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
public class game implements Serializable {
    
    //variables
    private double playTime;
    
    private Player player;
    private InventoryItem[] inventory;
    private Skeleton skeleton;
    private LordBernie lordBernie;
    private map map;

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Skeleton getSkeleton() {
        return skeleton;
    }

    public void setSkeleton(Skeleton skeleton) {
        this.skeleton = skeleton;
    }

    public LordBernie getLordBernie() {
        return lordBernie;
    }

    public void setLordBernie(LordBernie lordBernie) {
        this.lordBernie = lordBernie;
    }
    
    //consturctor
    public game(double playTime) {
        this.playTime = playTime;
    }


    public game() {
        
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

    public void setMap(map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setInventory(Inventory[] inventoryList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setInventoryItem(InventoryItem[] inventoryList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
