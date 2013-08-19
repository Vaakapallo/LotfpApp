/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import lotfpapp.AbilityScores;
import lotfpapp.CharacterClass;
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
    
}