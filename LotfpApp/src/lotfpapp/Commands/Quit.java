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
public class Quit extends Command {

    public Quit(IO io) {
        super(io);
    }

    @Override
    public void run() {
        io.print("Closing down");
        System.exit(0);
    }

    @Override
    public String toString() {
        return "Quit";
    }
}
