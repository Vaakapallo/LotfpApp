/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp;

/**
 *
 * @author Lassi
 */
public class Character {
    
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

    public Character(String name, String player, Alignment alignment, int age, Sex sex, CharacterClass charClass) {
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
    }

    
    
}
