/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.control;

import java.io.*;
import weekendatberniescastle.WeekendAtBerniesCastle;
import weekendatberniescastle.model.InventoryItem;

/**
 *
 * @author Stephen
 */
public class WriteInventoryToArrayControl {

    public static void writeToFile(String printedInventory, InventoryItem[] input) throws FileNotFoundException {
        
        InventoryItem[] originalInventoryList =
                WeekendAtBerniesCastle.getCurrentGame().getInventory();
        
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        InventoryItem tempInventoryItem;
        printedInventory = "Inventory.txt";
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileOutputStream(printedInventory));
            for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++){
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
            for (int i = 0; i < input.length; i++) {
                printWriter.println(inventoryList[i].getDescription());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }

   
    
}
