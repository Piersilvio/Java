
//con collection!
package com.uniba._segreteriaospedale;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


/**
 *
 * @author unipi
 */
public class App {
    
    public static Deque<String> l = new ArrayDeque<>();
    public static Scanner i = new Scanner(System.in);
    static int ch = 0; //variabile scelta
    
    
    public static void main(String[] args) {
        String s;
        
        do
        {
            App.menu();
            ch = i.nextInt();
           
            switch(ch)
            {
                case 1 -> { 
                    System.out.println("Immetti il nuovo paiente -> ");
                    s = i.nextLine();
                    l.add(s);
                    break;
                }
                case 2 -> System.out.println("Paziente processato! nome -> " + l.pop());
                case 3 -> {
                    System.out.println("Pazienti in coda:");
                    l.iterator();
                }
                case 4 -> {
                    System.out.println("Inserire il nome del paziente -> ");
                    s = i.nextLine();
                    if(l.contains(s))
                    {
                        System.out.println("Il paziente " + s + " è in lista");
                    }
                }
            }
        }while(ch != 5);
    }
    
    public static void menu()
    {
        System.out.println("1: inserimento nuovo paziente");
        System.out.println("2: processa paziente");
        System.out.println("3: pazienti in attesa");
        System.out.println("4: posizione del paziente");
        System.out.println("5: esci");
    }
}
