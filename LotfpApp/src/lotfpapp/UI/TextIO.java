/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotfpapp.UI;

import java.util.Scanner;

/**
 *
 * @author Lassi
 */
public class TextIO implements IO{
    
    private Scanner scanner = new Scanner(System.in);

    @Override
    public int readInt() {
        String line = nonEmptyLine();
        return Integer.parseInt(line);
    }

    @Override
    public String readString() {
        return nonEmptyLine();
    }
    
    private String nonEmptyLine() {
        String line = "";
        while(true){
            line = scanner.nextLine();
            if(!"".equals(line)){
                break;
            }
            print("Give at least something, please:");
        }
        return line;
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void print(String... texts) {
        for (String text : texts) {
            System.out.println(text);
        }
    }

    @Override
    public void pressEntertoContinue() {
        System.out.print("<Press enter to continue>"); scanner.nextLine();
    }
}
