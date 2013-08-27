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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make character!");
        
        System.out.println("Character Name:");
        String character = scanner.nextLine();
        
        System.out.println("Player Name");
        String player = scanner.nextLine();
        
        System.out.println("Age");
        int age = Integer.parseInt(scanner.nextLine());
        
      //  System.out.println(new Character(scanner.nextLine(), scanner.nextLine(), Alignment.Lawful, Integer.parseInt(scanner.nextLine()), Sex.Male, CharacterClass.Dwarf).toString());
        System.out.println(new Character(character, player, Alignment.Lawful, age, Sex.Male, CharacterClass.Dwarf).toString());
       
    }
}
