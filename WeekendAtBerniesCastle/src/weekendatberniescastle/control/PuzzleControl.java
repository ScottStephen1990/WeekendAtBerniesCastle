/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.control;
import weekendatberniescastle.view.SandPuzzleView;
import weekendatberniescastle.exxeptions.PuzzleContorlException;

/**
 *
 * @author Stephen Scott
 */

public class PuzzleControl {
          
    public static boolean checkBalance(int redSand, int whiteSand, int blueSand) throws PuzzleContorlException {
         
        
        if (redSand < 0 || redSand > 12) {
		throw new PuzzleContorlException("Not a valid amout of sand to put on the scale.");
        }        
	 if (blueSand < 0 || blueSand > 12) {
		throw new PuzzleContorlException("Not a valid amout of sand to put on the scale.");
        }
	if (whiteSand < 0 || whiteSand > 12) {
		throw new PuzzleContorlException("Not a valid amout of sand to put on the scale.");
        }
	int balance = (redSand * 2) + whiteSand + (blueSand * 4);
	
                if (balance == 22){
            return true;
            }else{
		throw new PuzzleContorlException(balance + " is not the right amout of sand, please try agin.");
            }
        
    }

    public double cannonTarget (int xDeg, int yDeg) {
        
        //X values that don't work
        if (xDeg > 360 || xDeg < 0) {
            return -3;
        }
        if (xDeg > 360 || xDeg < 0) {
            return -1;
        }
        //Y values that don't work
        if (yDeg > 90 || yDeg < 0) {
            return -3;
        }
        
        int xAxes = 0;
        int yAxes = 0;
        
        if (xDeg >= 95 && xDeg <= 100) {
           xAxes = 1;
        }
        if (yDeg >= 10 && yDeg <= 15) {
           yAxes = 0;
        }
        
        if (xDeg >= 142 && xDeg <= 147) {
           xAxes = 1;
        }
        if (yDeg >= 85 && yDeg <= 90) {
           yAxes = 1;
        }
        
        if (xDeg >= 121 && xDeg <= 125) {
           xAxes = 2;
        }
        if (yDeg == 5) {
           yAxes = 1;
        }

        int hit = xAxes + yAxes;
        
        if (hit == 3){
            return hit;
        }
        if (hit == 2){
            return hit;
        }
        if (hit == 1){
            return hit;
        }
        return -2;
    }
    
    public double checkBlocks(double diameter) {
       
        if (diameter < 1 || diameter > 98) {
            return -1;
        }
        double raidius = diameter / 2;
        double circumfrance = (Math.PI * Math.pow(raidius, 2));
        circumfrance = Math.round(circumfrance*100.00) / 100.00;
        
        if (circumfrance != 2290.22) {
            return -2;
            
        }
        return circumfrance;
    }
}
