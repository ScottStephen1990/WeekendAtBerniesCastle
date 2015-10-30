/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.view;

/**
 *
 * @author Stephen Scott
 */
public class MainMenuView {
    
    public void startProgram() {
        
    }

    private final String MENU = "\n"
            + "\n**************************"
            + "\n*** Main Menu          ***"
            + "\n**************************"
            + "\n*** G - Start New Game ***"
            + "\n*** H - Help           ***"
            + "\n*** S - Save           ***"
            + "\n*** L - Load           ***"
            + "\n*** E - Exit           ***"
            + "\n**************************";
    
    public void displayMenu() {
        char selection = ' ';
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while (selection != 'E');
    }

    private String getInput() {
        
    }
}
