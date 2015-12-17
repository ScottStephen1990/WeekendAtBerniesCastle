/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.model;

/**
 *
 * @author Phillip
 */
public class Skeleton {
    
    int attack;
    int health;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.attack;
        hash = 53 * hash + this.health;
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
        final Skeleton other = (Skeleton) obj;
        if (this.attack != other.attack) {
            return false;
        }
        if (this.health != other.health) {
            return false;
        }
        return true;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Skeleton() {
        this.attack = 2;
        this.health = 10;
    }
        
}
