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
public class puzzleScene {
    
    //variables
    private String description;
    private String puzzleType;

    //constructor
    public puzzleScene() {
    }

    //this converts the vars to strings for debuging the game.
    @Override
    public String toString() {
        return "puzzleScene{" + "description=" + description + ", puzzleType=" + puzzleType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + Objects.hashCode(this.puzzleType);
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
        final puzzleScene other = (puzzleScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.puzzleType, other.puzzleType)) {
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

    public String getPuzzleType() {
        return puzzleType;
    }

    public void setPuzzleType(String puzzleType) {
        this.puzzleType = puzzleType;
    }
    
    
}
