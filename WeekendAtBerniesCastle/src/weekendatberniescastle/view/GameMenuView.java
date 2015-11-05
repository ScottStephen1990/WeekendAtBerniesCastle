/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.view;

import java.util.Scanner;

/**
 *
 * @author MIc
 */
public class GameMenuView {
    
    public final static String GAMEMENUDESCRIPTION = "***********************************************************"
                                               + "\n\nYou find yourself in the foyer of Lord Bernie's Castle. You"
                                               + "\nsee 5 different doors leading apart from the behemoth wooden"
                                               + "\ntest the main entrance and find that the doors have been"
                                               + "\nmagically sealed shut. You hear a voice. 'Choose now a path"
                                               + "\nfrom one of these doors. Solve my puzzles and you may escape"
                                               + "\n... alive. Muahaha!'"
                                               + "\n\nPlease select one of the following options:"
                                               + "\nA - Check Inventory"
                                               + "\nS - Move"
                                               + "\nD - Help"
                                               + "\nR - Exit to Main Menu";
        
       
    
    
    

    public void displayMenu() {
        char selection = ' ';
        do {
            
            System.out.println(GAMEMENUDESCRIPTION);
            
            String input = this.getInput();
            input = input.toUpperCase();
            selection = input.charAt(0);
            
            
            this.doAction(selection);
            
        } while (selection != 'R');
             
            
    }
    
    
    
    
    private String getInput() {
        boolean valid = false;
        String choice = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            // prompt for the player's name
            System.out.println("Lord Bernie would like you to select"
                            +"\na menu option."
                            +"\n"
                            +"\nPlease enter your menu choice below (A, S, D, or R):");
                           
            choice = keyboard.nextLine();
            choice = choice.trim();
            
            if (choice.length() < 1 || choice.length() >= 2) {
                System.out.println("Invalid input - please input an"
                                +"\nname option from the menu list");
                continue;
            }
            break;
        }
        
        return choice;
    }

    private void doAction(char choice) {
        switch (choice) {
            case 'A':
                this.checkInventory();
                break;
           
            case 'B':
                this.move();
                break;
            
            case 'C':
                this.help();
                break;
            
            
            case 'R':
                return;
            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
    }    

    private void move() {
        System.out.println("The Move function is currently unavailable");
    }

    private void help() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.helpMenu();
    }

    private void checkInventory() {
       System.out.println("The Inventory Function is currently unavailable");
    }
}
