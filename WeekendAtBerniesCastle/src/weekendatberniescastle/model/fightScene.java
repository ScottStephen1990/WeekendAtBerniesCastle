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
public class fightScene {
    
    // the instance variables
    private String description;
    private double fightType;
    private String monsterType;
    private double numberOfMonsters;

    //constructor
    public fightScene() {
    }

    
    //this converts the vars to strings for debuging the game.
    @Override
    public String toString() {
        return "fightScene{" + "description=" + description + ", fightType=" + fightType + ", monsterType=" + monsterType + ", numberOfMonsters=" + numberOfMonsters + '}';
    }

    //hash code for debuging
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.fightType) ^ (Double.doubleToLongBits(this.fightType) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.monsterType);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.numberOfMonsters) ^ (Double.doubleToLongBits(this.numberOfMonsters) >>> 32));
        return hash;
    }

   //equals for debuging
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final fightScene other = (fightScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fightType) != Double.doubleToLongBits(other.fightType)) {
            return false;
        }
        if (!Objects.equals(this.monsterType, other.monsterType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numberOfMonsters) != Double.doubleToLongBits(other.numberOfMonsters)) {
            return false;
        }
        return true;
    }

   
    
    //getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getFightType() {
        return fightType;
    }

    public void setFightType(double fightType) {
        this.fightType = fightType;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public double getNumberOfMonsters() {
        return numberOfMonsters;
    }

    public void setNumberOfMonsters(double numberOfMonsters) {
        this.numberOfMonsters = numberOfMonsters;
    }
    
    
    
}
