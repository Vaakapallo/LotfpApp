/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp;

import lotfpapp.Character.Char;
import lotfpapp.Commands.AddCharacter;
import lotfpapp.UI.IO;
import lotfpapp.UI.TextIO;
import lotfpapp.Commands.*;

/**
 *
 * @author Lassi
 */
public class LotfpApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IO io = new TextIO();

        Command[] commands = {new AddCharacter(io), new RandomizeCharacter(io), new ShowStats(io), new Notes(io), new Encumbrance(io), new Items(io), new Quit(io)};

        Menu menu = new Menu(commands);

        while (true) {
            io.print(menu.toString());
            Char character = ActiveCharacter.getActiveCharacter();
            if (character != null) {
                io.print("Current Character: " + character.getName());
            }
            io.print("Give command:");
            int input = io.readInt();
            Command com = menu.getCommand(input);
            if (com != null) {
                try {
                    com.run();
                } catch (UnsupportedOperationException e) {
                    io.pressEntertoContinue("Not yet done, working on it");
                }
            } else {
                io.pressEntertoContinue("No such command, try again");
            }
        }
    }
}
