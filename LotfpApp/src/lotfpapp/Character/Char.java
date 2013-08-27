/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp.Character;

import java.util.ArrayList;

/**
 *
 * @author Lassi
 */
public class Char {

    private String name;
    private String player;
    private int level;
    private Alignment alignment;
    private int age;
    private Sex sex;
    private int XP;
    private CharacterClass charClass;
    private AbilityScores abilityScores;
    private SavingThrows savingThrows;
    private Equipment equipment;
    private ArrayList<String> notes;

    public Char(String name, String player, Alignment alignment, int age, Sex sex, CharacterClass charClass) {
        this.name = name;
        this.player = player;
        this.alignment = alignment;
        this.age = age;
        this.sex = sex;
        this.charClass = charClass;
        this.level = 1;
        this.XP = 0;
        this.abilityScores = new AbilityScores(charClass);
        this.savingThrows = new SavingThrows(charClass);
        this.equipment = new Equipment();
        notes = new ArrayList();
    }

    @Override
    public String toString() {
        return name + "\n" + "Player: " + player + "\nLevel: " + level + "\nAlignment: " + alignment + "\nAge: " + age + "\nSex: " + sex + "\nXP: " + XP + "\nClass: " + charClass + "\n" + abilityScores.toString() + "\n" + savingThrows.toString() + "\n" + equipment.toString();
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getNotes() {
        return notes;
    }
}
