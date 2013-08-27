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
import java.util.Scanner;

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
        io.print(menu.toString());
        
        io.print("Make character!");
        
        io.print("Character Name:");
        String character = io.readString();
        
        io.print("Player Name");
        String player = io.readString();
        
        io.print("Age");
        int age = io.readInt();
        
        io.print(new Character(character, player, Alignment.Lawful, age, Sex.Male, CharacterClass.Dwarf).toString());
    }
}
