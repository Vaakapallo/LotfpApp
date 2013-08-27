/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp.Commands;

import lotfpapp.Character.Alignment;
import lotfpapp.Character.CharacterClass;
import lotfpapp.Character.Sex;
import lotfpapp.UI.IO;

/**
 *
 * @author Lassi
 */
public class AddCharacter extends Command {

    public AddCharacter(IO io) {
        super(io);
    }

    @Override
    public void run() {
        io.print("Make character!");
        
        io.print("Character Name:");
        String character = io.readString();
        
        io.print("Player Name");
        String player = io.readString();
        
        io.print("Age");
        int age = io.readInt();
        
        io.print(new lotfpapp.Character.Character(character, player, Alignment.Lawful, age, Sex.Male, CharacterClass.Dwarf).toString());
        
        io.pressEntertoContinue();
    }

    @Override
    public String toString() {
        return "Add Character";
    }
    
}
