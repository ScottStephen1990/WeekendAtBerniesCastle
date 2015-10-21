/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Phillip
 */
public class PuzzleControlTest {
    
    public PuzzleControlTest() {
    }

    /**
     * Test of checkBalance method, of class PuzzleControl.
     */
    @Test
    public void testCheckBalance() {
        System.out.println("checkBalance");
        
        // test case 1
        System.out.println("Test case 1");
        double redSand = 4;
        double whiteSand = 6;
        double blueSand = 2;
        PuzzleControl instance = new PuzzleControl();
        double expResult = 22;
        double result = instance.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
        
        // test case 2
        System.out.println("Test case 2");
        redSand = 2;
        whiteSand = 2;
        blueSand = 2;
        
        expResult = -2;
        result = instance.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
        
        // test case 3
        System.out.println("Test case 3");
        redSand = -7;
        whiteSand = 7;
        blueSand = 7;
        
        expResult = -1;
        result = instance.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
        
        // test case 4
        System.out.println("Test case 4");
        redSand = 5;
        whiteSand = 5;
        blueSand = -7;
        
        expResult = -1;
        result = instance.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
        
        // test case 5
        System.out.println("Test case 5");
        redSand = 4;
        whiteSand = -7;
        blueSand = 3;
        
        expResult = -1;
        result = instance.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
        
        // test case 6
        System.out.println("Test case 6");
        redSand = 22;
        whiteSand = 22;
        blueSand = 22;
        
        expResult = -1;
        result = instance.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
        
        // test case 7
        System.out.println("Test case 7");
        redSand = 0;
        whiteSand = 0;
        blueSand = 0;
        
        expResult = -2;
        result = instance.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
        
         // test case 8
        System.out.println("Test case 8");
        redSand = 12;
        whiteSand = 12;
        blueSand = 12;
        
        expResult = -2;
        result = instance.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
    }
    
}
