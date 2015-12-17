/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Stephen
 */
public class game implements Serializable {

    //variables
    private double playTime;

    private Player player;
    private InventoryItem[] inventory;
    private Skeleton skeleton;
    private LordBernie lordBernie;
    private map map;
    private Actors[] actor;

    public game() {
    }

    public Actors[] getActor() {
        return actor;
    }

    public void setActor(Actors[] actor) {
        this.actor = actor;
    }

    public double getPlayTime() {
        return playTime;
    }

    public void setPlayTime(double playTime) {
        this.playTime = playTime;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public map getMap() {
        return map;
    }

    public void setMap(map map) {
        this.map = map;
    }

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.playTime) ^ (Double.doubleToLongBits(this.playTime) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.player);
        hash = 53 * hash + Arrays.deepHashCode(this.inventory);
        hash = 53 * hash + Objects.hashCode(this.skeleton);
        hash = 53 * hash + Objects.hashCode(this.lordBernie);
        hash = 53 * hash + Objects.hashCode(this.map);
        hash = 53 * hash + Arrays.deepHashCode(this.actor);
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
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.skeleton, other.skeleton)) {
            return false;
        }
        if (!Objects.equals(this.lordBernie, other.lordBernie)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Arrays.deepEquals(this.actor, other.actor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "game{" + "playTime=" + playTime + ", player=" + player + ", inventory=" + inventory + ", skeleton=" + skeleton + ", lordBernie=" + lordBernie + ", map=" + map + ", actor=" + actor + '}';
    }

}
