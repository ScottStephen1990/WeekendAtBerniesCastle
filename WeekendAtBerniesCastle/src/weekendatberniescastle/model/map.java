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
public class map implements Serializable {
    
    //variables
    private int rowCount;
    private int columnCount;
    private location[][] locations;
    
    //constructor
    public map() {
    }

    public map(int rowCount, int columnCount) {
       if (rowCount < 1 || columnCount < 1) {
           System.out.println("The number of rows and columns must be > zero");
           return;
       }
       
       this.rowCount = rowCount;
       this.columnCount = columnCount;
       
       this.locations = new location[rowCount][columnCount];
       
       for (int row = 0; row < rowCount; row++) {
           for(int column = 0; column < columnCount; column++){
               
               location location = new location();
               location.setColumn(column);
               location.setRow(row);
               location.setVisited(false);
               
               locations[row][column] = location;
           }
       }
    }
    
    //converts the vars to Strings for debuging

    @Override
    public String toString() {
        return "map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
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
        final map other = (map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;
    }
    
    //getters and setters
    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
    
    
}
