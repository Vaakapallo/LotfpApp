/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp;

import lotfpapp.Character.Char;
/**
 *
 * @author Lassi
 */
public class ActiveCharacter {

    private static Char activeCharacter;

    public static void setActiveCharacter(Char activeCharacter) {
        ActiveCharacter.activeCharacter = activeCharacter;
    }

    public static Char getActiveCharacter() {
        return activeCharacter;
    }
}
