/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.view;


import java.util.Scanner;
import weekendatberniescastle.WeekendAtBerniesCastle;
/**
 *
 * @author MIc
 */
public class HelpMenuView {

    public void startHelp() {
        
    }
    
    private final String MENUHELP = "\n"
            + "\n***************************************"
            + "\n*** Help Menu                       ***"
            + "\n***************************************"
            + "\n*** A - What is the Goal            ***"
            + "\n*** B - How to move around the game ***"
            + "\n*** C - What Items will you need?   ***"
            + "\n*** R - Return to game              ***"
            + "\n***************************************";
    
    static void helpMenu() {
        char selection = ' ';
        do {
            
            System.out.println(MENUHELP);
            
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
                            +"\nPlease enter your menu choice below (A, B, C, or R):");
                           
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
                
                break;
            case 'a':
                
                break;
            case 'B':
                
                break;
            case 'b':
                
                break;
            case 'C':
                
                break;
            case 'c':
                
                break;
            
            case 'R':
                return;
            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
    }    
}
