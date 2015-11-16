/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.view;

import java.util.Scanner;
import weekendatberniescastle.WeekendAtBerniesCastle;
import weekendatberniescastle.control.GameControl;


/**
 *
 * @author Stephen Scott
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
    
            super("\n"
            + "\n**************************"
            + "\n*** Main Menu          ***"
            + "\n**************************"
            + "\n*** G - Start New Game ***"
            + "\n*** H - Help           ***"
            + "\n*** S - Save           ***"
            + "\n*** L - Load           ***"
            + "\n*** E - Exit           ***"
            + "\n**************************");
    
    }

    
    @Override
    public boolean doAction(Object obj) {
        char value = (char) obj;
        
        switch (value) {
            case 'G':
                this.startNewGame();
                break;
            
            case 'H':
                this.displayHelpMenu();
                break;
            
            case 'S':
                this.saveGame();
                break;
            
            case 'L':
                this.loadSaveGame();
                break;
            
            case 'E':
                return true;
            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(WeekendAtBerniesCastle.getPlayer());
        
        MainRoomView mainRoom = new MainRoomView();
        mainRoom.mainRoomView();
    }

    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.helpMenu();
    }

    private void saveGame() {
        System.out.println("\n*** save game was selected ***");
    }

    private void loadSaveGame() {
        System.out.println("\n*** Load game was selected ***");
    }

    
}
