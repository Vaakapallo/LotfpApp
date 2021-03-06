/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp.Character;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lassi
 */
public class Equipment {

    private List<Item> items;

    public Equipment() {
        items = new ArrayList();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addItem(String name) {
        this.addItem(new Item(name));
    }

    public void addItem(String name, int price) {
        this.addItem(new Item(name, price));
    }

    public void addEncumberingItem(String name) {
        this.addItem(new Item(name, true));
    }

    @Override
    public String toString() {
        String returnable = "Equipment: \n";
        for (Item item : items) {
            returnable += item.toString() + "\n";
        }

        return returnable;
    }
}
