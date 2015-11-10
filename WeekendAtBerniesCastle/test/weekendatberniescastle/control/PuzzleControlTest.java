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
        int redSand = 4;
        int whiteSand = 6;
        int blueSand = 2;
        PuzzleControl instance = new PuzzleControl();
        int expResult = 22;
        int result = PuzzleControl.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
        
        // test case 2
        System.out.println("Test case 2");
        redSand = 2;
        whiteSand = 2;
        blueSand = 2;
        
        expResult = -2;
        result = PuzzleControl.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
        
        // test case 3
        System.out.println("Test case 3");
        redSand = -7;
        whiteSand = 7;
        blueSand = 7;
        
        expResult = -1;
        result = PuzzleControl.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
        
        // test case 4
        System.out.println("Test case 4");
        redSand = 5;
        whiteSand = 5;
        blueSand = -7;
        
        expResult = -1;
        result = PuzzleControl.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
        
        // test case 5
        System.out.println("Test case 5");
        redSand = 4;
        whiteSand = -7;
        blueSand = 3;
        
        expResult = -1;
        result = PuzzleControl.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
        
        // test case 6
        System.out.println("Test case 6");
        redSand = 22;
        whiteSand = 22;
        blueSand = 22;
        
        expResult = -1;
        result = PuzzleControl.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
        
        // test case 7
        System.out.println("Test case 7");
        redSand = 0;
        whiteSand = 0;
        blueSand = 0;
        
        expResult = -2;
        result = PuzzleControl.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
        
         // test case 8
        System.out.println("Test case 8");
        redSand = 12;
        whiteSand = 12;
        blueSand = 12;
        
        expResult = -2;
        result = PuzzleControl.checkBalance(redSand, whiteSand, blueSand);
        assertEquals(expResult, result, 0.0);
    }
     /**
     * Test of checkBalance method, of class PuzzleControl.
     */
    @Test
    public void testcannonTarget() {
        System.out.println("cannonTarget");
        
        // test case 1
        System.out.println("Test case 1");
        int xDeg = 96;
        int yDeg = 13;

        PuzzleControl instance = new PuzzleControl();
        int expResult = 1;
        double result = instance.cannonTarget(xDeg, yDeg);
        assertEquals(expResult, result, 0.0);
        System.out.println("Test case 1 done, you hit target 1");
        
        // test case 2
        System.out.println("Test case 2");
        xDeg = 145;
        yDeg = 88;

        expResult = 2;
        result = instance.cannonTarget(xDeg, yDeg);
        assertEquals(expResult, result, 0.0);
        System.out.println("Test case 2 done, you hit target 2");
        
        // test case 3
        System.out.println("Test case 3");
        xDeg = 123;
        yDeg = 5;

        expResult = 3;
        result = instance.cannonTarget(xDeg, yDeg);
        assertEquals(expResult, result, 0.0);
        System.out.println("Test case 3 done, you hit target 3");
        
        // test case 5
        System.out.println("Test case 5");
        xDeg = 96;
        yDeg = -1;

        expResult = -3;
        result = instance.cannonTarget(xDeg, yDeg);
        assertEquals(expResult, result, 0.0);
        
        // test case 6
        System.out.println("Test case 6");
        xDeg = 361;
        yDeg = 13;

        expResult = -3;
        result = instance.cannonTarget(xDeg, yDeg);
        assertEquals(expResult, result, 0.0);
        
        // test case 7
        System.out.println("Test case 7");
        xDeg = 96;
        yDeg = 91;

        expResult = -3;
        result = instance.cannonTarget(xDeg, yDeg);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of checkBlocks method, of class PuzzleControl.
     */
    @Test
    public void testCheckBlocks() {
        // Test case 1
        System.out.println("checkBlocks");
        double diameter = 54;
        PuzzleControl instance = new PuzzleControl();
        double expResult = 2290.22;
        double result = instance.checkBlocks(diameter);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
         // Test case 2
        System.out.println("checkBlocks");
        diameter = -1;
        
        expResult = -1;
        result = instance.checkBlocks(diameter);
        assertEquals(expResult, result, 0.0);
        
         // Test case 3
        System.out.println("checkBlocks");
        diameter = 99;
        
        expResult = -1;
        result = instance.checkBlocks(diameter);
        assertEquals(expResult, result, 0.0);
        
         // Test case 4
        System.out.println("checkBlocks");
        diameter = 1;
        
        expResult = -2;
        result = instance.checkBlocks(diameter);
        assertEquals(expResult, result, 0.0);
        
         // Test case 5
        System.out.println("checkBlocks");
        diameter = 98;
        
        expResult = -2;
        result = instance.checkBlocks(diameter);
        assertEquals(expResult, result, 0.0);
    }
    
}
