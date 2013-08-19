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
        scores.put("Charisma", 7);
        scores.put("Constitution", 7);
        scores.put("Dexterity", 7);
        scores.put("Intelligence", 7);
        scores.put("Strength", 7);
        scores.put("Wisdom", 7);
        this.charClass = charClass;
    }

    public Collection<Integer> getScores() {
        return scores.values();
    }
}
