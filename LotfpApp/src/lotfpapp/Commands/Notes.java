/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp.Commands;

import java.util.List;
import lotfpapp.ActiveCharacter;
import lotfpapp.Character.Char;
import lotfpapp.UI.IO;

/**
 *
 * @author Lassi
 */
public class Notes extends Command {

    public Notes(IO io) {
        super(io);
    }

    @Override
    public void run() {
        List<String> notes = ActiveCharacter.getActiveCharacter().getNotes();

        if (notes.isEmpty()) {
            io.print("No old notes");
        } else {
            io.print("Old Notes:");
            for (String string : notes) {
                io.print(string);
            }
        }

        io.print("Add note:");
        notes.add(io.readString());
        io.pressEntertoContinue("Note added");
    }

    @Override
    public String toString() {
        return "Manage Notes";
    }
}
