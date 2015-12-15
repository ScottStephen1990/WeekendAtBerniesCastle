/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.control;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import weekendatberniescastle.WeekendAtBerniesCastle;
import weekendatberniescastle.exxeptions.GameControlException;
import weekendatberniescastle.model.InventoryItem;
import weekendatberniescastle.model.Item;
import weekendatberniescastle.model.Player;
import weekendatberniescastle.model.game;
import weekendatberniescastle.model.map;
import weekendatberniescastle.model.LordBernie;
import weekendatberniescastle.model.Skeleton;


/**
 *
 * @author MIc
 */
public class GameControl {

    public static void createNewGame(Player player) {
        game game = new game(); //create new game
        WeekendAtBerniesCastle.setCurrentGame(game); //save in WeekendAtBerniesCastle

        game.setPlayer(player); //save player in game

        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        LordBernie lordBernie = new LordBernie();
        game.setLordBernie(lordBernie);
        
        Skeleton skeleton = new Skeleton();
        game.setSkeleton(skeleton);

        map map = MapControl.createMap();
        game.setMap(map);

        MapControl.moveActorsToStartingLocation(map);
    }

    public static InventoryItem[] createInventoryList() {
        
        InventoryItem[] inventory = 
                new InventoryItem[5];
        
        InventoryItem sword = new InventoryItem();
        sword.setDescription("Sword");
        sword.setQuantityInStock(0);
        sword.setRequiredAmount(1);
        inventory[Item.sword.ordinal()] = sword;
        
        InventoryItem boots = new InventoryItem();
        boots.setDescription("Boots of Haste");
        boots.setQuantityInStock(0);
        boots.setRequiredAmount(1);
        inventory[Item.boots.ordinal()] = boots;
        
        InventoryItem breastplate = new InventoryItem();
        breastplate.setDescription("Breastplate");
        breastplate.setQuantityInStock(0);
        breastplate.setRequiredAmount(1);
        inventory[Item.breastplate.ordinal()] = breastplate;
        
        InventoryItem key = new InventoryItem();
        key.setDescription("Key");
        key.setQuantityInStock(0);
        key.setRequiredAmount(1);
        inventory[Item.key.ordinal()] = key;
        
        InventoryItem shield = new InventoryItem();
        shield.setDescription("Shield");
        shield.setQuantityInStock(0);
        shield.setRequiredAmount(1);
        inventory[Item.shield.ordinal()] = shield;
        
        return inventory;
    }

    public static void saveGame(game game, String filePath)
            throws GameControlException {

        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(game);
        } catch (IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath)
            throws GameControlException {

        game game = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream output = new ObjectInputStream(fips);

            game = (game) output.readObject();
        } catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
}
