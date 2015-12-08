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
