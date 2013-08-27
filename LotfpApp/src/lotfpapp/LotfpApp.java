/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp;

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
        
      //  System.out.println(new Character(scanner.nextLine(), scanner.nextLine(), Alignment.Lawful, Integer.parseInt(scanner.nextLine()), Sex.Male, CharacterClass.Dwarf).toString());
        io.print(new Character(character, player, Alignment.Lawful, age, Sex.Male, CharacterClass.Dwarf).toString());
       
    }
}
