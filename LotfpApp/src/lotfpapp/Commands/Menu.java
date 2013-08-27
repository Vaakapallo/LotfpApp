/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp.Commands;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lassi
 */
public class Menu {
    
    private Map<Integer, Command> commands = new HashMap();

    public Menu(Command ... coms) {
        int i = 1;
        for (Command command : coms) {
            commands.put(i, command);
            i++;
        }
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
