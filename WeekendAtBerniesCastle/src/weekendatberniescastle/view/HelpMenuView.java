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
public class HelpMenuView extends View {

    public HelpMenuView() {
        
    
    
    super ("\n"
            + "\n***************************************"
            + "\n*** Help Menu                       ***"
            + "\n***************************************"
            + "\n*** A - What is the Goal            ***"
            + "\n*** B - How to move around the game ***"
            + "\n*** C - What Items will you need?   ***"
            + "\n*** R - Return to game              ***"
            + "\n***************************************");
    
    }

   
    @Override
    public boolean doAction(Object obj) {
        
        char choice = (char) obj;
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
            
            case 'R':
                
            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
        return false;
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
    

}
