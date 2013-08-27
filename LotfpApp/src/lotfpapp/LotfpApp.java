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
        IO IO = new TextIO();
        IO.print("Make character!");
        
        IO.print("Character Name:");
        String character = IO.readString();
        
        IO.print("Player Name");
        String player = IO.readString();
        
        IO.print("Age");
        int age = IO.readInt();
        
      //  System.out.println(new Character(scanner.nextLine(), scanner.nextLine(), Alignment.Lawful, Integer.parseInt(scanner.nextLine()), Sex.Male, CharacterClass.Dwarf).toString());
        IO.print(new Character(character, player, Alignment.Lawful, age, Sex.Male, CharacterClass.Dwarf).toString());
       
    }
}
