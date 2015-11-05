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
public class MoveMenuView {
    
     public void startMoveMenu() {
        
    }
    
    private static final String MENUMOVEMENT = "\n"
            + "\n*******************************************"
            + "\n*** Room options                        ***"
            + "\n*******************************************"
            + "\n*** S - Head to the door labeled Sand   ***"
            + "\n*** B - Head to the door labeled blocks ***"
            + "\n*** M - Head to the door labeled Make   ***"
            + "\n*** C - Head to the door labeled Cannon ***"
            + "\n*** E - Head to the dorr labeled Bernies***"
            + "\n*** R - open the main menu              ***"
            + "\n*******************************************";
    
    public void moveMenu() {
        char selection = ' ';
        do {
            
            System.out.println(MENUMOVEMENT);
            
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
                            +"\nPlease enter your menu choice below (S, B, M, R and C):");
                           
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
            case 'S':
                System.out.println("S was slected");
                break;
           
            case 'B':
                System.out.println("B was slected");
                break;
            
            case 'M':
                System.out.println("M was slected");
                break;
            
            case 'C':
                System.out.println("C was slected");
                break;
            
            case 'E':
                System.out.println("E was slected");
                break;
                
            case 'R':
                return;
            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
    }    
    
}
