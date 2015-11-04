/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.view;


import java.util.Scanner;
import weekendatberniescastle.WeekendAtBerniesCastle;
import weekendatberniescastle.control.GameControl;
import weekendatberniescastle.view.StartProgramView;

/**
 *
 * @author MIc
 */
public class HelpMenuView {

    public void startHelp() {
        
    }
    
    private static final String MENUHELP = "\n"
            + "\n***************************************"
            + "\n*** Help Menu                       ***"
            + "\n***************************************"
            + "\n*** A - What is the Goal            ***"
            + "\n*** B - How to move around the game ***"
            + "\n*** C - What Items will you need?   ***"
            + "\n*** R - Return to game              ***"
            + "\n*** T - test the move menu          ***"
            + "\n***************************************";
    
    public void helpMenu() {
        char selection = ' ';
        do {
            
            System.out.println(MENUHELP);
            
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
                this.goalHelp();
                break;
           
            case 'B':
                this.movementHelp();
                break;
            
            case 'C':
                this.itemsHelp();
                break;
            
            case 'T':
                this.displayMoveMenu();
            
            case 'R':
                return;
            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
    }    

    private void goalHelp() {
        System.out.println("\n\nThe goal of this game is to gather the items needed to defeat"
                       + "\nLord Bernie. The items are located in the five wings of the"
                       + "\ncastle. In order to obtain the items you will have to solve"
                       + "\nthe puzzles at the end of each wing. After you have all the"
                       + "\nitems you can face and hopefully defeat Lord Bernie.");
        
        
        
    }

    private void movementHelp() {
        System.out.println("\n\nFrom the game menu choo the movement option. Then select one"
                       + "\nof the available options in the movement menu.");
       
    }   
    
    private void itemsHelp() {
        System.out.println("\n\nThere are five items that you need to collect. The sword, the"
                       + "\nshield, the boots of haste, the key, and the breastplate.");
                
    }
    
    public void displayMoveMenu() {
        MoveMenuView moveMenu = new MoveMenuView();
        moveMenu.moveMenu();
    }
}
