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
public class regularScene {
    
    //varibles
    private String description;
    
    //constructor
    public regularScene() {
    }

    @Override
    public String toString() {
        return "regularScene{" + "description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.description);
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
        final regularScene other = (regularScene) obj;
        if (!Objects.equals(this.description, other.description)) {
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
    
    
}
