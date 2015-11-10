/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.view;
import java.util.Scanner;
import weekendatberniescastle.WeekendAtBerniesCastle;
import weekendatberniescastle.control.PuzzleControl;

/**
 *
 * @author Stephen Scott
 */
public class SandPuzzleView {
    
     
    
    public void sandPuzzleView(){
        
        this.displayDescription();
        
        
    }
    
    public void doAction (){
        int exit = 0;
        this.displayDescription();
        do {
            //get the input from the user
            int redSand = this.redSand();
            int blueSand = this.blueSand();
            int whiteSand = this.whiteSand();
            //sends input to the control layer
            exit = PuzzleControl.checkBalance(redSand, whiteSand, blueSand);
            //value if one of the inputs is out of range
            if (exit == -1)  {
                System.out.println("Please enter values between 0 and 12");
            
            }
            //value if the scale is unblanced
            else if (exit == -2) {
                System.out.println("The scale is unblanced please try again.");
            }
            
        } while (exit != 22);
        
        if (exit == 22) {
            System.out.println("Congratulations you solved the puzzle");
        }
        
            
    }

    public void displayDescription() {
        System.out.println("\n\nYou enter this new room, and as your eyes wander "
                            + "\nacross the scene you see a scale with three sides."
                            + "\nOn the floor you also see 3 piles of sand each a "
                + "\ndifferent color. There is Red Sand, White Sand, and"
                + "\nBlue Sand. The scale looks unblanced. You see a door"
                + "\non the other side of the room. As your eyes catch the"
                + "\ndoor it slams shut almost as if by magic. A voice"
                + "\nechos in the room, and you hear Lord Bernie say 'Solve"
                + "\nthe puzzle " + WeekendAtBerniesCastle.getPlayer());
    }

    public int redSand() {
        System.out.println("\n\nRed sand amount");
        
        String redString = this.getInput();
        double red = Double.parseDouble(redString);
        int redSand = (int) (Math.round(red*100)/100);
        return redSand;
        }
   
    public int whiteSand() {
       System.out.println("\n\nWhite sand amount");
        
        String whiteString = this.getInput();
        double white = Double.parseDouble(whiteString);
        int whiteSand = (int) (Math.round(white*100)/100);
        return whiteSand; 
    }
    
    public int blueSand() {
        System.out.println("\n\nBlue sand amount");
        
        String blueString = this.getInput();
        double blue = Double.parseDouble(blueString);
        int blueSand = (int) (Math.round(blue*100)/100);
        return blueSand;
    }
    
    public String getInput() {
        boolean valid = false;
        String stringSand = null;
       
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            // prompt for the player's name
            System.out.println("\nPlease enter a value:");
                           
            stringSand = keyboard.nextLine();
            stringSand = stringSand.trim();
            
            if (stringSand.length() < 0 || stringSand.length() > 2) {
                System.out.println("Invalid name length - please input a"
                                +"\nname between 2 and 20 characters long");
                continue;
            }
            break;
        }
        
        return stringSand;
    }
    
    
}
