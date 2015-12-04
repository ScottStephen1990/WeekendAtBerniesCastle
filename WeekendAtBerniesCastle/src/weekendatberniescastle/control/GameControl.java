/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.control;

import weekendatberniescastle.WeekendAtBerniesCastle;
import weekendatberniescastle.model.Inventory;
import weekendatberniescastle.model.Items;
import weekendatberniescastle.model.Player;
import weekendatberniescastle.model.game;
import weekendatberniescastle.model.map;

/**
 *
 * @author MIc
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
       game game = new game(); //create new game
       WeekendAtBerniesCastle.setCurrentGame(game); //save in WeekendAtBerniesCastle
       
       game.setPlayer(player); //save player in game
       
       Inventory[] inventoryList = GameControl.createInventoryList();
       game.setInventory(inventoryList);
       
       map map = MapControl.createMap();
       game.setMap(map);
       
       MapControl.moveActorsToStartingLocation(map);
    }
    
    public static Inventory[] createInventoryList() {
        System.out.println("*** called createInventoryList() in GameControl ***");
        return null;
    }
}
