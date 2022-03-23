package com.classeMain;
import java.math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);
        String arg1 = i.nextLine();
        String arg2 = i.nextLine();
        Main.prog(arg1, arg2);
    }

    public static void prog(String arg1, String arg2)
    {
        double n1 = Double.parseDouble(arg1);
        double n2 = Double.parseDouble(arg2);

        System.out.println("la somma dei numeri passati in input è " + Main.somma(n1, n2));
        System.out.println("l'elevamento a potenza è " + Math.pow(n1, n2));

        if (n1 < 100)
        {
            double r = Math.random()*100;
            if(Main.confronto(n1, r))
            {
                System.out.println("il primo numero è ancora più piccolo del numero generato: " + n1 + " < " + r);
            }else
            {
                System.out.println("il primo numero è più grande del numero generato: " + n1 + " > " + r);
            }
        }else
        {
            System.out.println("il primo numero è più grande di 100!");
        }
    }

    static double somma(double n1, double n2)
    {
        return n1 + n2;
    }

    static boolean confronto(double n1, double r)
    {
        if(n1 < r) { return true; }
        else { return false; }
    }
}
