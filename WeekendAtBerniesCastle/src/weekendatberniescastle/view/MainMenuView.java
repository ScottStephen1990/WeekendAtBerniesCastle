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

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
