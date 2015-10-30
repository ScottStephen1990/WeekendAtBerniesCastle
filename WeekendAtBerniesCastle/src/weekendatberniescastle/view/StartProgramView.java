/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.view;

import java.util.Scanner;
import weekendatberniescastle.control.ProgramControl;
import weekendatberniescastle.model.Player;


/**
 *
 * @author Phillip
 */
public class StartProgramView {
    
    public void startProgram() {
               
        //display the banner
        this.displayBanner();
        String playersName = this.getPlayersName();
        
        Player player = ProgramControl.createPlayer(playersName);
        
        this.displayWelcomeMessage(player);
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }  

    private void displayBanner() {
        System.out.println("\n\n************************************************");
        
        System.out.println("*                                              *"
                       + "\n* Welcome to your weekend at Bernie's Castle.  *"
                       + "\n* Your adventurous weekend is now begging. I'm *"
                       + "\n* sure you will enjoy all the amenities we have*"
                       + "\n* provided for your entertainment. Our Lord    *"
                       + "\n* Bernie is excited to finally eat... I mean   *"
                       + "\n* meet you. He hopes you will enjoy the        *"
                       + "\n* various wings of his castle. Try not to get  *"
                       + "\n* into too much trouble.                       *"
                       + "\n*                                              *"
                       + "\n************************************************");
    }

    private String getPlayersName() {
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            // prompt for the player's name
            System.out.println("Lord Bernie would like to know the name"
                            +"\nof his guest."
                            +"\n"
                            +"\nPlease enter your name below:");
                           
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            if (playersName.length() < 2 || playersName.length() > 20) {
                System.out.println("Invalid name length - please input a"
                                +"\nname between 2 and 20 characters long");
                continue;
            }
            break;
        }
        
        return playersName;
    } 
    //welcome Message with players name
    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n######################################################");
        System.out.println("\tWelcome to Bernie's Castle " + player.getName());
        System.out.println("\tTry not to die... Muhahahaha");
        System.out.println("######################################################");
    }
}