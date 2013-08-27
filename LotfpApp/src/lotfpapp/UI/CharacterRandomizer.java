/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp.UI;

import java.util.Random;
import lotfpapp.Character.Alignment;
import lotfpapp.Character.Char;
import lotfpapp.Character.CharacterClass;
import lotfpapp.Character.Sex;

/**
 *
 * @author Lassi
 */
public class CharacterRandomizer {
    
    private static Random random = new Random();
    
    public static Char randomChar(){
        return new Char("Randomman", "Computer", randomAlignment(), randomAge(), randomGender(), randomClass());
    }
    
    private static CharacterClass randomClass() { // based on modifiers
        CharacterClass[] chars = CharacterClass.values();
        
        return chars[random.nextInt(chars.length)];
    }
    
    private static int randomAge(){ // based on class
        return random.nextInt(200);
    }
    
    private static Sex randomGender() {
        Sex[] sexes = Sex.values();
        
        return sexes[random.nextInt(sexes.length)];
    }
    
    private static Alignment randomAlignment(){
        Alignment[] aligns = Alignment.values();
        
        return aligns[random.nextInt(aligns.length)];
    }
}
