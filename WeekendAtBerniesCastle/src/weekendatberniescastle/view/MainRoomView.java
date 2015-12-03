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
public class MainRoomView extends View {

    public MainRoomView() {

        super("\n\nYou find yourself in the foyer of Lord Bernie's Castle. You"
                + "\nsee 5 different doors leading apart from the behemoth wooden"
                + "\ntest the main entrance and find that the doors have been"
                + "\nmagically sealed shut. You hear a voice. 'Choose now a path"
                + "\nfrom one of these doors. Solve my puzzles and you may escape"
                + "\n... alive. Muahaha!'"
                + "\n\n***********************************************************"
                + "\n\nPlease select one of the following options:"
                + "\nA - Check Inventory"
                + "\nS - Move"
                + "\nD - Help"
                + "\nR - Exit to Main Menu");

    }

    @Override
    public boolean doAction(Object obj) {

        char choice = (char) obj;
        switch (choice) {
            case 'A':
                this.checkInventory();
                break;

            case 'S':
                this.move();
                break;

            case 'D':
                this.help();
                break;

            case 'R':

            default:
                System.out.println("\n*** Invalid Selection ***");
                break;
        }
        return false;
    }

    public void move() {
        MoveMenuView moveMenu = new MoveMenuView();
        moveMenu.moveMenu();
    }

    public void help() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    public void checkInventory() {
        System.out.println("The Inventory Function is currently unavailable");
    }

}
