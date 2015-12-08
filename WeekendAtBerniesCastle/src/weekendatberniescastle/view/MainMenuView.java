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
        mainRoom.display();
    }

    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println("\n\nEnter the file path for file where the game is "
                + "to be saved.");
        String filePath = this.getInput();
        
        try {
            
            // save the game to the specified file
            GameControl.saveGame(WeekendAtBerniesCastle.getCurrentGame(), filePath);
            } catch (Exception ex) {
                ErrorView.display("MainMenuView", ex.getMessage());
            }
    }

    private void loadSaveGame() {
        System.out.println("\n\nEnter the file path for the file where the "
                + "game is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
            
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
            
    }

    
}
