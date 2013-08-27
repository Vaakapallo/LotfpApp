/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp;

/**
 *
 * @author Lassi
 */
class Quit extends Command {

    public Quit(IO io) {
        super(io);
    }

    @Override
    public void run() {
        io.print("closing down");
        System.exit(0);
    }

    @Override
    public String toString() {
        return "Quit";
    }
}
