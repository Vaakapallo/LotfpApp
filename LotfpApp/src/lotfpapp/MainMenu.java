/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lassi
 */
public class MainMenu {

    private Map<Integer, Command> commands = new HashMap();

    public MainMenu(IO io) {
        commands.put(1, new AddCharacter(io));
        commands.put(2, new ShowStats(io));
        commands.put(3, new Notes(io));
        commands.put(4, new Encumbrance(io));
        commands.put(5, new Items(io));
        commands.put(9, new Quit(io));
    }

    public Command getCommand(int command) {
        return commands.get(command);
    }

    @Override
    public String toString() {
        String returnable = "";
        for (Integer number : commands.keySet()) {
            returnable += number + ". " + commands.get(number).toString() + "\n";
        }
        return returnable;
    }
}
