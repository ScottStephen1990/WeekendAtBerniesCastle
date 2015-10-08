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
public class Npc implements Serializable {
    
    //variables
    private String npcType;
    private double hitPoints;
    private double attack;
    private double defense;
    
    //consturctor

    public Npc() {
    }
    
    //converts the vars to strings for debuging

    @Override
    public String toString() {
        return "npc{" + "npcType=" + npcType + ", hitPoints=" + hitPoints + ", attack=" + attack + ", defense=" + defense + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.npcType);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.hitPoints) ^ (Double.doubleToLongBits(this.hitPoints) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.attack) ^ (Double.doubleToLongBits(this.attack) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.defense) ^ (Double.doubleToLongBits(this.defense) >>> 32));
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
        final Npc other = (Npc) obj;
        if (!Objects.equals(this.npcType, other.npcType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hitPoints) != Double.doubleToLongBits(other.hitPoints)) {
            return false;
        }
        if (Double.doubleToLongBits(this.attack) != Double.doubleToLongBits(other.attack)) {
            return false;
        }
        if (Double.doubleToLongBits(this.defense) != Double.doubleToLongBits(other.defense)) {
            return false;
        }
        return true;
    }
    
    //getters and setters
    public String getNpcType() {
        return npcType;
    }

    public void setNpcType(String npcType) {
        this.npcType = npcType;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }
    
    
}
