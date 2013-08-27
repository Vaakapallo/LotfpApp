/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp.Commands;

import lotfpapp.UI.IO;

/**
 *
 * @author Lassi
 */
public abstract class Command {
    
    protected IO io;

    public Command(IO io) {
        this.io = io;
    }
    
    public abstract void run();
   
}
