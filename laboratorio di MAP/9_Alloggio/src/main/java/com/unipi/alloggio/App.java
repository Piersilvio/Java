

package com.unipi.alloggio;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unipi
 * tips: creare una lista di Alloggi
 */
public class App {
    
    public static List<Alloggio> l = new ArrayList<>();
    public static Scanner in  = new Scanner(System.in);
    
    public static void main(String[] args) {
        int ch = 0;
        
        App.menu();
        
        do{
            switch(ch)
            {
                case 1 -> {
                    System.out.println("Inserire id alloggio da ricercare: ");
                    int id = l.indexOf(in.nextInt());
                    if(id != -1)
                    {
                        l.toString();
                    }
                }
                    
            }
        }while(ch != 6);
    }
    
    public static void menu(){
        System.out.println("1: stampare i dati dell'alloggio specificato");
        System.out.println("2: stampare i dati degli alloggi cui valore è all'interno di un range specificato");
        System.out.println("3: stampare i dati dell' alloggio che ha il massimo valore calpestabile");
        System.out.println("4: stampare la tassa media");
    }
}
