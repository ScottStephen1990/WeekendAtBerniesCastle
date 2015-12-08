/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import weekendatberniescastle.model.Player;
import weekendatberniescastle.model.game;
import weekendatberniescastle.view.StartProgramView;

/**
 *
 * @author Phillip
 */
public class WeekendAtBerniesCastle {

    private static game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static void main(String[] args) {
       

        try {
            // open charcter stream files for end user input and output
            WeekendAtBerniesCastle.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            WeekendAtBerniesCastle.outFile = new PrintWriter(System.out, true);
            
            StartProgramView startProgramView = new StartProgramView("");
            startProgramView.display();
            //open log file
            String filePath = "log.txt";
            WeekendAtBerniesCastle.logFile = new PrintWriter(filePath);
        } catch (Exception e) {

            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());
        }catch (Throwable e) {

            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());
            e.printStackTrace();;
        } finally {
            try {
                if (WeekendAtBerniesCastle.inFile != null) 
                    WeekendAtBerniesCastle.inFile.close();
                

                if (WeekendAtBerniesCastle.outFile != null) 
                    WeekendAtBerniesCastle.outFile.close();
                
                if (WeekendAtBerniesCastle.logFile != null) 
                    WeekendAtBerniesCastle.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }

        }

    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        WeekendAtBerniesCastle.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        WeekendAtBerniesCastle.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        WeekendAtBerniesCastle.inFile = inFile;
    }

    /**
     * @param args the command line arguments
     */
    

    public static game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(game currentGame) {
        WeekendAtBerniesCastle.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        WeekendAtBerniesCastle.player = player;
    }

}
