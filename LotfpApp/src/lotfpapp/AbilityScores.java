/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Lassi
 */
public class AbilityScores {

    private CharacterClass charClass; // make this matter! In a smart way!
    private Map<String, Integer> scores = new HashMap();
    private Random random = new Random();

    public AbilityScores(CharacterClass charClass) {
        String[] stats = {"charisma","constitution","dexterity","intelligence","strength","wisdom"};
        for (String string : stats) {
            scores.put(string, randomScore());
        }
        this.charClass = charClass;
    }

    public Collection<Integer> getScores() {
        return scores.values();
    }

    public int getAbilityScore(String name) {
        return scores.get(name.toLowerCase());
    }

    public int getModifier(String name) {
        return scoreToModifier(getAbilityScore(name));
    }

    private int scoreToModifier(int abilityScore) {
        if (abilityScore == 3) {
            return -3;
        } else if (abilityScore < 6) {
            return -2;
        } else if (abilityScore < 9) {
            return -1;
        } else if (abilityScore < 13) {
            return 0;
        } else if (abilityScore < 15) {
            return 1;
        } else if (abilityScore < 18) {
            return 2;
        } else {
            return 3;
        }
    }
    
    private int randomScore(){
        return random.nextInt(16) + 2;
    }

    @Override
    public String toString() {
        String returnable = "Scores: \n";
        for (String name : scores.keySet()) {
            returnable += name + " " + scores.get(name) + " (" + getModifier(name) + ")\n";
        }
        return returnable;
    }
}
