/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import weekendatberniescastle.WeekendAtBerniesCastle;

/**
 *
 * @author Phillip
 */
public abstract class View implements ViewInterface {
    
   
    protected String displayMessage;
    
    protected final BufferedReader keyboard = WeekendAtBerniesCastle.getInFile();
    protected final PrintWriter console = WeekendAtBerniesCastle.getOutFile();
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        char value = ' ';
        boolean done = false;
        do {
            
            this.console.println(this.displayMessage);
            
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
        
        try {
        while(!valid){
            
            // prompt for the player's name
            
                           
            selection = this.keyboard.readLine();
            selection = selection.trim();
            
            if (selection.length() < 1 || selection.length() >= 2) {
                ErrorView.display(this.getClass().getName(),"Invalid input - please input an"
                                +"\noption from the menu list");
                continue;
            }
            break;
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }  
        return selection;
    }
}
