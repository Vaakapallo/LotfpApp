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
        try{
        io.pressEntertoContinue(ActiveCharacter.getActiveCharacter().toString());
        } catch (NullPointerException e){
            io.print("Make a character first!");
        }
    }

    @Override
    public String toString() {
        return "Show Character Stats";
    }
    
}
