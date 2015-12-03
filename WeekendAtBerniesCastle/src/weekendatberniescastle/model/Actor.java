/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Stephen Scott
 */
public enum Actor implements Serializable {

    Charles("The butler of the castle."),
    Gwen("The maid"),
    Terry("The mad scientist"),
    Camille("The pretty girl"),
    Jamall("No one really knows why Jamall is here.");
    
    private final String description;
    private final Point coordinates;

    public String getDescription() {
        return description;
    }

   

    public Point getCoordinates() {
        return coordinates;
    }

   
    
    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);

    }
    
   
}
