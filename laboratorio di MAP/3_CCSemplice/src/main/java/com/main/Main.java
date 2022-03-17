package com.main;
import com.classeBanca.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int scelta = 0;
        String nomeC;
        int nC = 0;
        float s = 0;

        System.out.println("immettere i tuoi dati bancari:");
        System.out.println("nome cliente _> ");
        nomeC = input.nextLine();
        System.out.println("numero di conto _> ");
        nC = input.nextInt();

        CC conto = new CC(nomeC, nC);

        do{
            //stampo lo stato dell'oggetto col metodo in @override di toString();
            System.out.println(conto);

            System.out.println("1 - per prelevare       2 - per versare         0 - per uscire dal conto");
            scelta = input.nextInt();
            switch(scelta)
            {
                case 1:
                    System.out.println("inserire il saldo da prelevare_> ");
                    s = input.nextFloat();
                    if(!conto.prelievo(s))  { System.out.println("Impossibile prelevare la cifra richiesta!"); }
                    else { System.out.println("prelievo avvenuto con successo"); }
                    break;
                case 2:
                    System.out.println("inserire il saldo da versare_> ");
                    s = input.nextFloat();
                    conto.versamento(s);
                    break;
            }
        }while(scelta != 0);
        System.exit(0);
    }
}
