/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp;

import lotfpapp.Commands.Command;
import lotfpapp.UI.CharacterRandomizer;
import lotfpapp.UI.IO;

/**
 *
 * @author Lassi
 */
class RandomizeCharacter extends Command {

    public RandomizeCharacter(IO io) {
        super(io);
    }

    @Override
    public void run() {
        ActiveCharacter.setActiveCharacter(CharacterRandomizer.randomChar());
    }

    @Override
    public String toString() {
        return "Randomize Character";
    }
}
