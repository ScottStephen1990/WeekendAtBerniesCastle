/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.view;

import java.io.PrintWriter;
import weekendatberniescastle.WeekendAtBerniesCastle;

/**
 *
 * @author Stephen Scott
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = WeekendAtBerniesCastle.getOutFile();
    private static final PrintWriter logFile = WeekendAtBerniesCastle.getLogFile();
    
    public static void display(String className, String errorMessage) {

        errorFile.println(
                  "----------------------------------------------------"
                + "\n- ERROR - " + errorMessage
                + "\n----------------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
}
