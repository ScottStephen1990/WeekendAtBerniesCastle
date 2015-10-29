/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.control;

import weekendatberniescastle.WeekendAtBerniesCastle;
import weekendatberniescastle.model.Player;

/**
 *
 * @author Phillip
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        WeekendAtBerniesCastle.setPlayer(player);
        
        return player;
    }
    
}
