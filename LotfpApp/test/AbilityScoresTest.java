/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import lotfpapp.Character.AbilityScores;
import lotfpapp.Character.CharacterClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lassi
 */
public class AbilityScoresTest {
    
    @Before
    public void setUp() {
    }
    
   
    @Test
    public void scoresHasSixScores(){
        AbilityScores AS = new AbilityScores(CharacterClass.Cleric);
        assertEquals(6, AS.getScores().size());
    }
    
    @Test
    public void canGetCharisma(){
        AbilityScores AS = new AbilityScores(CharacterClass.Cleric);
        assertNotNull(AS.getAbilityScore("Charisma"));
    }
    
    @Test
    public void canGetCharismaModifier(){
        AbilityScores AS = new AbilityScores(CharacterClass.Cleric);
        assertEquals(-1, AS.getModifier("Charisma"));
    }
    
    @Test
    public void randomScoreIsEqualToDiceRolling(){
        AbilityScores AS = new AbilityScores(CharacterClass.Cleric);
        int[] scores = new int[19];
        for (int i = 0; i < 100000; i++) {
            scores[AS.randomScore()]++;
        }
        for (int i = 3; i < 19; i++) {
            System.out.println("score " + i + "amount " + scores[i]);
        }
    }
}