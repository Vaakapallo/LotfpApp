/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Lassi
 */
public class AbilityScores {

    private CharacterClass charClass;
    private Map<String, Integer> scores = new HashMap();

    public AbilityScores(CharacterClass charClass) {
        scores.put("charisma", 7);
        scores.put("constitution", 7);
        scores.put("dexterity", 7);
        scores.put("intelligence", 7);
        scores.put("strength", 7);
        scores.put("wisdom", 7);
        this.charClass = charClass;
    }

    public Collection<Integer> getScores() {
        return scores.values();
    }
    
    public int getAbilityScore(String name){
        return scores.get(name.toLowerCase());
    }
}
