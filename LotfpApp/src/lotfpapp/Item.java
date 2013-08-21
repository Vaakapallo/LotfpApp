/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp;

import java.util.List;

/**
 *
 * @author Lassi
 */
public class Item {

    private String name;
    private int price;
    private boolean encumbering = false;
    private List<String> notes;

    public Item(String name) {
        this.name = name;
    }
    
    public Item(String name, boolean encumbering){
        this(name);
        this.encumbering = encumbering;
    }

    public Item(String name, int price) {
        this(name);
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void addNote(String note) {
        notes.add(note);
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
