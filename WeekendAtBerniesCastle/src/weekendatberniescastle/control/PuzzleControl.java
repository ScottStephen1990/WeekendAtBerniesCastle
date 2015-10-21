/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.control;

/**
 *
 * @author Stephen Scott
 */
public class PuzzleControl {
          
    public double checkBalance(double redSand, double whiteSand, double blueSand) {
         
        
        if (redSand < 0 || redSand > 12) {
		return -1;
        }        
	 if (blueSand < 0 || blueSand > 12) {
		return -1;
        }
	if (whiteSand < 0 || whiteSand > 12) {
		return -1;
        }
	double balance = (redSand * 2) + whiteSand + (blueSand * 4);
	
        if (balance != 22) {
		return -2;
        }
	return balance;
    
    }

}
