/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.view;

import java.util.Scanner;

/**
 *
 * @author Phillip
 */
public abstract class View implements ViewInterface {
    
    Scanner keyboard = new Scanner(System.in);
    protected String displayMessage;
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        char value = ' ';
        boolean done = false;
        do {
            
            System.out.println(this.displayMessage);
            
            String input = this.getInput();
            input = input.toUpperCase();
            value = input.charAt(0);
            
            done = this.doAction(value);
            
        } while (!done);
    }
    
    @Override
     public String getInput() {
        boolean valid = false;
        String selection = null;
        
        
        while(!valid){
            
            // prompt for the player's name
            
                           
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length() < 1 || selection.length() >= 2) {
                System.out.println("Invalid input - please input an"
                                +"\noption from the menu list");
                continue;
            }
            break;
        }
        
        return selection;
    }
}
