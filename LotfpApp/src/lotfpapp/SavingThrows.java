/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp;

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

    @Override
    public String toString() {
        return "SavingThrows" + savingThrows;
    }
    
    public int getSavingThrow(String name){
        return savingThrows.get(name);
    }
}
