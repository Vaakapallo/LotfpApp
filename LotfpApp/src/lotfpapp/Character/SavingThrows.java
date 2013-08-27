/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp.Character;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lassi
 */
public class SavingThrows {

    private CharacterClass charClass; // constructors based on class, also leveling
    private Map<String, Integer> savingThrows = new HashMap();

    public SavingThrows(CharacterClass charClass) {
        savingThrows.put("paralyze", 14);
        savingThrows.put("poison", 11);
        savingThrows.put("breath", 16);
        savingThrows.put("device", 12);
        savingThrows.put("magic", 15);
        this.charClass = charClass;
    }

    public int getSavingThrow(String name){
        return savingThrows.get(name);
    }
    
    @Override
    public String toString() {
        String returnable = "Saving Throws: \n";
        for (String name : savingThrows.keySet()) {
            returnable += name + " " + savingThrows.get(name)+"\n";
        }
        
        return returnable;
    }
}
