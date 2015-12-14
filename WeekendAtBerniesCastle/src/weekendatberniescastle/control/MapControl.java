/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.control;

import weekendatberniescastle.WeekendAtBerniesCastle;
import weekendatberniescastle.model.Scene;
import weekendatberniescastle.model.game;
import weekendatberniescastle.model.map;
import weekendatberniescastle.model.openingScene;

/**
 *
 * @author MIc
 */
public class MapControl {

    static map createMap() {
        //create the map
        map map = new map(5, 5);
        
        //create list of different scenes in the game
        Scene[] scenes = createScenes();
        
        // assign the different scenes to locations in the map
        
        assignScenesToLocations(map, scenes);
        
        return map;
    }

    static void moveActorsToStartingLocation(map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Scene[] createScenes() {
        game game = WeekendAtBerniesCastle.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene openingScene = new Scene();
        openingScene.setDescription("\nWelcome to Bernie's Castle. Prepare to be challenged.");
        openingScene.setMapSymbol(" ST ");
        openingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = openingScene;
        
        Scene puzzleScene = new Scene();
        puzzleScene.setDescription("\nTime to challenge your mind"
                + "with a brand new puzzle");
        puzzleScene.setMapSymbol(" PZ ");
        puzzleScene.setBlocked(false);
        scenes[SceneType.puzzle.ordinal()] = puzzleScene;
        
        Scene fightScene
    }

    private static void assignScenesToLocations(map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
