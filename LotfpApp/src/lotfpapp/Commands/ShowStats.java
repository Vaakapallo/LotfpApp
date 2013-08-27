/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp.Commands;

import lotfpapp.ActiveCharacter;
import lotfpapp.UI.IO;

/**
 *
 * @author Lassi
 */
public class ShowStats extends Command {

    public ShowStats(IO io) {
        super(io);
    }

    @Override
    public void run() {
        io.pressEntertoContinue(ActiveCharacter.getActiveCharacter().toString());
    }

    @Override
    public String toString() {
        return "Show Character Stats";
    }
    
}
