package com.main;
import com.figura.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        float l1 = 0, l2 = 0, l3 = 0;
        int scelta = 0;

        do{
            System.out.println("immettere il tipo di triangolo:");
            System.out.println("1 - scaleno     2 - isoscele    3 - equilatero     0 - esci");
            scelta = input.nextInt();

            switch(scelta)
            {
                    case 1:
                        Main.scaleno(l1, l2, l3, input);
                        break;
                    case 2:
                        Main.isoscele(l1, l2, l3, input);
                        break;
                    case 3:
                        Main.equilatero(l1, l2, l3, input);
                        break;
            }
        }while(scelta != 0);
        System.exit(0);
    }

    public static void scaleno(float l1, float l2, float l3, Scanner input)
    {
        System.out.println("immettere i lati dando un colpo di spazio fra loro");
        l1 = input.nextFloat();
        l2 = input.nextFloat();
        l3 = input.nextFloat();
        Triangolo t = new Triangolo(l1, l2, l3);
        System.out.println("perimetro: " + t.per());
    }

    public static void isoscele(float l1, float l2, float l3, Scanner input)
    {
        System.out.println("immettere i lati dando un colpo di spazio fra loro");
        l1 = input.nextFloat();
        l2 = input.nextFloat();
        Triangolo t = new Triangolo(l1, l2);
        System.out.println("perimetro: " + t.per());
    }

    public static void equilatero(float l1, float l2, float l3, Scanner input)
    {
        System.out.println("immettere i lati dando un colpo di spazio fra loro");
        l1 = input.nextFloat();
        Triangolo t = new Triangolo(l1);
        System.out.println("perimetro: " + t.per());
    }
}
