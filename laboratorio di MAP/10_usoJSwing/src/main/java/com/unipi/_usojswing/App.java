

package com.unipi._usojswing;
import java.util.Scanner;

/**
 *
 * @author unipi
 */
public class App {
    
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        
        String title;
        
        System.out.print("Imposta il titolo per il tuo nuovo gioco!: ");
        title = in.nextLine();
        
        Panel  p = new Panel(title);
    }
}
