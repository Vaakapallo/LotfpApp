/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp;

import lotfpapp.UI.IO;
import lotfpapp.UI.TextIO;
import lotfpapp.Commands.MainMenu;
import lotfpapp.Character.Sex;
import lotfpapp.Character.CharacterClass;
import lotfpapp.Character.Character;
import lotfpapp.Character.Alignment;
import lotfpapp.Commands.Command;

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

        MainMenu menu = new MainMenu(io);

        while (true) {
            io.print(menu.toString());
            io.print("Give command");
            int input = io.readInt();
            Command com = menu.getCommand(input);
            if (com != null) {
                try {
                    com.run();
                } catch (UnsupportedOperationException e) {
                    io.print("Not yet done, working on it");
                    io.pressEntertoContinue();
                }
            } else {
                io.print("No such command, try again");
                io.pressEntertoContinue();
            }
        }
    }
}
