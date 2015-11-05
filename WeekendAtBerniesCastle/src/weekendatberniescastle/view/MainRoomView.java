/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.view;

/**
 *
 * @author Stephen
 */
public class MainRoomView {
    
    public void mainRoomView() {
    
        this.displayDescription();
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
    }

    
    
    public void displayDescription () {
        System.out.println("\n\nYou find yourself in the foyer of Lord Bernie's Castle. You"
                           + "\nsee 5 different doors leading apart from the behemoth wooden"
                           + "\ntest the main entrance and find that the doors have been"
                           + "\nmagically sealed shut. You hear a voice. 'Choose now a path"
                           + "\nfrom one of these doors. Solve my puzzles and you may escape"
                           + "\n... alive. Muahaha!'");
    }
            
}
