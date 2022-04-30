
package com.uniba.gestioneArray;
import java.util.Scanner;

public class App{
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args){
        
        int scelta = 0;
        Vettore a_id = new Vettore();
        Vettore a_prezzo = new Vettore();
        Vettore a_charge = new Vettore();
        
        //caricaemto id
        a_id.push(01);
        a_id.push(02);
        a_id.push(03);
        
        //caricamento prezzo
        a_prezzo.push(500);
        a_prezzo.push(600);
        a_prezzo.push(250);
        
        //caricamento charge
        a_charge.push(8);
        a_charge.push(5);
        a_charge.push(3);
        
        switch(scelta)
        {
            case 1 -> a_prezzo.media();
            case 2 -> a_charge.media();
            case 3 -> a_prezzo.max();
            case 4 -> a_id.pop(in.nextInt());
        }
    }      
}

