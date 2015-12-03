/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.view;
import java.util.Scanner;
import weekendatberniescastle.WeekendAtBerniesCastle;
import weekendatberniescastle.control.PuzzleControl;
import weekendatberniescastle.exxeptions.PuzzleContorlException;

/**
 *
 * @author Stephen Scott
 */
public class SandPuzzleView extends View {

    public SandPuzzleView(String message) {
        super(("\n\nYou enter this new room, and as your eyes wander "
                            + "\nacross the scene you see a scale with three sides."
                            + "\nOn the floor you also see 3 piles of sand each a "
                + "\ndifferent color. There is Red Sand, White Sand, and"
                + "\nBlue Sand. The scale looks unblanced. You see a door"
                + "\non the other side of the room. As your eyes catch the"
                + "\ndoor it slams shut almost as if by magic. A voice"
                + "\nechos in the room, and you hear Lord Bernie say 'Solve"
                + "\nthe puzzle " + WeekendAtBerniesCastle.getPlayer()));
    }
    
   @Override
    public boolean doAction(Object obj){
        boolean exit = false;
        do {
            //get the input from the user
            int redSand = this.redSand();
            int blueSand = this.blueSand();
            int whiteSand = this.whiteSand();
            //sends input to the control layer
            try {
                PuzzleControl.checkBalance(redSand, whiteSand, blueSand);
            } catch (PuzzleContorlException me) {
                System.out.println(me.getMessage());
            }
           
        } while (exit != false);
        System.out.println("Congratulations you solved the puzzle");
        return true;
     
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
    
    
    
    
}
