/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.control;

import weekendatberniescastle.WeekendAtBerniesCastle;
import weekendatberniescastle.model.Scene;
import weekendatberniescastle.model.SceneType;
import weekendatberniescastle.model.game;
import weekendatberniescastle.model.Location;
import weekendatberniescastle.model.map;
import weekendatberniescastle.model.openingScene;

/**
 *
 * @author Stephen
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
        
        Scene sandPuzzleScene = new Scene();
        sandPuzzleScene.setDescription("\nTime to challenge your mind"
                + "with a brand new puzzle");
        sandPuzzleScene.setMapSymbol(" SP ");
        sandPuzzleScene.setBlocked(false);
        scenes[SceneType.sandPuzzle.ordinal()] = sandPuzzleScene;
        
        Scene potionPuzzleScene = new Scene();
        potionPuzzleScene.setDescription("\nTime to challenge your mind"
                + "with a brand new puzzle");
        potionPuzzleScene.setMapSymbol(" PP ");
        potionPuzzleScene.setBlocked(false);
        scenes[SceneType.potionPuzzle.ordinal()] = potionPuzzleScene;
        
        Scene cannonPuzzleScene = new Scene();
        cannonPuzzleScene.setDescription("\nTime to challenge your mind"
                + "with a brand new puzzle");
        cannonPuzzleScene.setMapSymbol(" CP ");
        cannonPuzzleScene.setBlocked(false);
        scenes[SceneType.cannonPuzzle.ordinal()] = cannonPuzzleScene;
        
        Scene riddlePuzzleScene = new Scene();
        riddlePuzzleScene.setDescription("\nTime to challenge your mind"
                + "with a brand new puzzle");
        riddlePuzzleScene.setMapSymbol(" RP ");
        riddlePuzzleScene.setBlocked(false);
        scenes[SceneType.riddlePuzzle.ordinal()] = riddlePuzzleScene;
        
        Scene blockPuzzleScene = new Scene();
        blockPuzzleScene.setDescription("\nTime to challenge your mind"
                + "with a brand new puzzle");
        blockPuzzleScene.setMapSymbol(" BP ");
        blockPuzzleScene.setBlocked(false);
        scenes[SceneType.blockPuzzle.ordinal()] = blockPuzzleScene;
        
        Scene regularScene = new Scene();
        regularScene.setDescription("\nYou look around and this room appears to be normal"
                + ", move on to the next one I guess.");
        regularScene.setMapSymbol(" RR ");
        regularScene.setBlocked(false);
        scenes[SceneType.regular.ordinal()] = regularScene;
        
        Scene FightScene = new Scene();
        FightScene.setDescription("Time to fight for your life you fragile bunny");
        FightScene.setMapSymbol(" FT ");
        FightScene.setBlocked(false);
        scenes [SceneType.fight.ordinal()] = FightScene;
        
        Scene lordBernie = new Scene();
        lordBernie.setDescription("Time to test your mettle against the big boss");
        lordBernie.setMapSymbol(" LB ");
        lordBernie.setBlocked(false);
        scenes [SceneType.lordBernie.ordinal()] = lordBernie;
        
        return scenes;
    }

    private static void assignScenesToLocations(map map, Scene[] scenes) {
        Location[][] locations = map.getLocations(); 
        
        // start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.fight.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.regular.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.regular.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.fight.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.sandPuzzle.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.regular.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.regular.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.fight.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.fight.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.cannonPuzzle.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.fight.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.regular.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.fight.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.potionPuzzle.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.regular.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.fight.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.regular.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.fight.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.riddlePuzzle.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.fight.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.blockPuzzle.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.fight.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.lordBernie.ordinal()]);
        
        
        
    }
    
    
    
}
