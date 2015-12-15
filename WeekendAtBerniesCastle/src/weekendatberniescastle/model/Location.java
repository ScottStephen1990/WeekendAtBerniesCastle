/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author MIc
 */
public class Location implements Serializable {
    
    public int row;
    public int column;
    public boolean visited;
    public String event;
    public Scene scene;
    public ArrayList<Actor> actors;

    public Location() {
    }

    
    
    public double getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    //variables
    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.row;
        hash = 61 * hash + this.column;
        hash = 61 * hash + (this.visited ? 1 : 0);
        hash = 61 * hash + Objects.hashCode(this.event);
        hash = 61 * hash + Objects.hashCode(this.scene);
        hash = 61 * hash + Objects.hashCode(this.actors);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.event, other.event)) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        if (!Objects.equals(this.actors, other.actors)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", event=" + event + ", scene=" + scene + ", actors=" + actors + '}';
    }
    
  
}
