/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp.Commands;

import java.util.Random;
import lotfpapp.ActiveCharacter;
import lotfpapp.Character.*;
import lotfpapp.Character.CharacterClass;
import lotfpapp.Character.Sex;
import lotfpapp.UI.IO;

/**
 *
 * @author Lassi
 */
public class AddCharacter extends Command {
    
    private Random random = new Random();

    public AddCharacter(IO io) {
        super(io);
    }

    @Override
    public void run() {
        io.print("Make character!");

        io.print("Character Name:");
        String name = io.readString();

        io.print("Player Name");
        String player = io.readString();

        io.print("Age");
        int age = io.readInt();
        
        Char character = new Char(name, player, Alignment.Lawful, age, randomGender(), randomClass());
        
        io.print("Total modifier score is: " + character.getAbilityScores().totalModifierScore());
        

        ActiveCharacter.setActiveCharacter(character);

        io.pressEntertoContinue("Character created");
    }

    @Override
    public String toString() {
        return "Add Character";
    }

    private CharacterClass randomClass() {
        CharacterClass[] chars = CharacterClass.values();
        
        return chars[random.nextInt(chars.length)];
    }
    
    private Sex randomGender() {
        Sex[] sexes = Sex.values();
        
        return sexes[random.nextInt(sexes.length)];
    }
}
