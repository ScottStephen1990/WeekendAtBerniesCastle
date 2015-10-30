/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.view;

import java.util.Scanner;

/**
 *
 * @author Stephen Scott
 */
public class MainMenuView {
    
    public void startProgram() {
        
    }

    private final String MENU = "\n"
            + "\n**************************"
            + "\n*** Main Menu          ***"
            + "\n**************************"
            + "\n*** G - Start New Game ***"
            + "\n*** H - Help           ***"
            + "\n*** S - Save           ***"
            + "\n*** L - Load           ***"
            + "\n*** E - Exit           ***"
            + "\n**************************";
    
    public void displayMenu() {
        char selection = ' ';
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while (selection != 'E');
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
                            +"\nPlease enter your menu choice below (G, H, S, L, or E):");
                           
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
            case 'G':
                this.startNewGame();
                break; 
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'L':
                this.loadSaveGame();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
    }

    private void startNewGame() {
        System.out.println("\n*** New Game was selected ***");
    }

    private void displayHelpMenu() {
        System.out.println("\n*** Help Menu was selected ***");
    }

    private void saveGame() {
        System.out.println("\n*** save game was selected ***");
    }

    private void loadSaveGame() {
        System.out.println("\n*** Load game was selected ***");
    }
}
