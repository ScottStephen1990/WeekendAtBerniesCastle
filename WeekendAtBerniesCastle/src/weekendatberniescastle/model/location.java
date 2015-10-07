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
public class location {
    
    //variables
    private double row;
    private double column;
    private double visited;
    private String event;
    
    //constructor

    public location() {
    }

    //this converts the vars to strings for debuging the game.
    @Override
    public String toString() {
        return "location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", event=" + event + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.visited) ^ (Double.doubleToLongBits(this.visited) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.event);
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
        final location other = (location) obj;
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        if (Double.doubleToLongBits(this.visited) != Double.doubleToLongBits(other.visited)) {
            return false;
        }
        if (!Objects.equals(this.event, other.event)) {
            return false;
        }
        return true;
    }
    
    //getters and seteers
    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public double getVisited() {
        return visited;
    }

    public void setVisited(double visited) {
        this.visited = visited;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
    
    
}
