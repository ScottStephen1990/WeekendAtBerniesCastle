/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle;

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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create StartProgramView and start the program
        StartProgramView startProgramview = new StartProgramView();
        startProgramview.startProgram();
    }

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
