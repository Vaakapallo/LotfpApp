/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp.Character;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Lassi
 */
public class AbilityScores {

    private CharacterClass charClass; // make this matter! In a smart way! If modifiers are a table of their own, the class bonuses are easier.
    private Map<String, Integer> scores = new HashMap();
    private Random random = new Random();
    private String[] stats = {"charisma","constitution","dexterity","intelligence","strength","wisdom"};

    public AbilityScores(CharacterClass charClass) {
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
    
    public int randomScore(){
        int score = 0;
        for (int i = 0; i < 3; i++) {
            score += random.nextInt(6) + 1;
        }
        return score;
    }
    
    public int totalModifierScore(){
        int total = 0;
        for (String string : stats) {
            total += getModifier(string);
        }
        return total;
    }

    @Override
    public String toString() {
        String returnable = "Scores: \n";
        for (String name : scores.keySet()) {
            returnable += name + " " + scores.get(name) + " (" + getModifier(name) + ")\n";
        }
        returnable += "Total Modifier: " + totalModifierScore() + "\n";
        return returnable;
    }
}
