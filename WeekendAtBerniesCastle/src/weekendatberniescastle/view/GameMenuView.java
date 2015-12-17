/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.view;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.tools.ShellFunctions.input;
import weekendatberniescastle.WeekendAtBerniesCastle;
import weekendatberniescastle.control.GameControl;
import weekendatberniescastle.control.WriteInventoryToArrayControl;
import weekendatberniescastle.model.InventoryItem;
import weekendatberniescastle.model.Locationn;
import weekendatberniescastle.model.map;

/**
 *
 * @author Stephen Scott
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n***********************************************************"
                + "\n\nPlease select one of the following options:"
                + "\nA - Check Inventory"
                + "\nS - Move"
                + "\nD - Help"
                + "\nP - print inventory to file"
                + "\nR - Exit to Main Menu");

    }

    @Override
    public boolean doAction(Object obj) {

        char choice = (char) obj;
        switch (choice) {
            case 'A':
                this.checkInventory();
                break;

            case 'S':
                this.displayMap(WeekendAtBerniesCastle.getCurrentGame().getMap());
                break;

            case 'D':
                this.help();
                break;

            case 'P':
                this.print();
                break;

            case 'R':

            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
        return false;
    }

    public void displayMap(map map) {
        Locationn[][] locations = map.getLocations();

        System.out.println("\n\n---------------THE CASTLE--------------");
        System.out.println("  1  2  3  4  5  ");
        for (int i = 0; i < map.getRowCount(); i++) {
            if (i == 0) {
                System.out.println("-----------------");
            } else {
                System.out.println("\n-----------------");
            }

            if (i == 0) {
                System.out.println((i + 1) + " ");
            } else {
                System.out.println("\n" + (i + 1) + " ");
            }
            for (int c = 0; c < map.getColumnCount(); c++) {
                System.out.println("|");
                if (locations[i][c].explored()) {
                    System.out.println("" + locations[i][c].getScene().getMapSymbol());
                } else {
                    System.out.println("??");
                }
                if (c == map.getColumnCount() - 1) {
                    System.out.println("|");
                }
            }
        }
    }

    public void help() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    public void checkInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();

        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t"
                + "Required" + "\t"
                + "Obtained");

        for (InventoryItem inventoryItem : inventory) {

            System.out.println(inventoryItem.getDescription() + "\t     "
                    + inventoryItem.getRequiredAmount() + "\t     "
                    + inventoryItem.getQuantityInStock());
        }
    }

    private void print() {
        InventoryItem[] input = GameControl.getSortedInventoryList();
        try {
            WriteInventoryToArrayControl.writeToFile(displayMessage, input);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
