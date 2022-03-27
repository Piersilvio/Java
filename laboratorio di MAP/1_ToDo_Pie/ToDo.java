package com.example.todolist;
import java.io.*;
import java.util.*;

public class ToDo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BufferedReader inputS = new BufferedReader(new InputStreamReader(System.in));
        ToDo.menu(input, inputS);
    }

    public static void menu(Scanner input, BufferedReader inputS)
    {
        int in;

        System.out.println("\n: ToDo app By Piè");
        System.out.println();
        System.out.println(": 1 = per creare una nuova lista ToDo       2 = per cancellare un file esistente");
        System.out.println(": 3 = per aprirne uno");
        System.out.println(": 0 = per chiudere il programma");
        System.out.println();
        System.out.println(": Scelta -> ");
        in = input.nextInt();

        switch(in)
        {
            case 1:
                ToDo.creaL(input, inputS);
                break;
            case 3:
                ToDo.apriL(input, inputS);
                break;
            case 2:
                ToDo.deleteL(input, inputS);
            case 0:
                System.exit(0);
                break;
        }
    }

    private static void creaL(Scanner input, BufferedReader inputS)
    {
        String percorso = "C:\\Users\\unipi\\Desktop\\ToDoList\\fileTuoi\\";
        System.out.println(": immettere il nome del file da creare -> ");

        try
        {
            String nome = inputS.readLine();
            percorso = percorso + nome + ".txt";

            File file = new File(percorso);

            try
            {
                if(file.exists())
                {
                    System.out.println(": Il file " + percorso + " esiste! ritornerai al menu.");
                    ToDo.menu(input, inputS);
                }else
                {
                    file.createNewFile();
                    System.out.println(": Il file " + percorso + " è stato creato");
                    System.out.println(": tornare al menu per utilizzarlo!");
                    ToDo.menu(input, inputS);
                }
            }catch (IOException err)
            {
                err.printStackTrace();
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static void apriL(Scanner input, BufferedReader inputS)
    {
        String percorso = "C:\\Users\\unipi\\Desktop\\ToDoList\\fileTuoi\\";
        System.out.println(": immettere il nome del file da aprire -> ");

        try{
            String nome = inputS.readLine();
            percorso = percorso + nome + ".txt";
            char[] testo = new char[100];

            File file = new File(percorso);
            FileReader fr = new FileReader(file);
            try{
                BufferedReader br = new BufferedReader(fr);
                int n_c = br.read(testo);
                if(n_c > 0)
                {
                    System.out.println(": contenuto: ");
                    for (int i = 0; i < n_c; i++)
                    {
                        System.out.print(testo[i]);
                    }
                    System.out.println("\n: 1 = per tornare al menu       2 = per ricercare un altro file");
                    if(input.nextInt() == 1)
                    {
                        ToDo.menu(input, inputS);
                    }else{
                        ToDo.apriL(input, inputS);
                    }
                }else
                {
                    System.out.println(": il tuo file è vuoto! ");
                    System.out.println(": 1 = per tornare al menu       2 = per ricercare un altro file");
                    if(input.nextInt() == 1)
                    {
                        ToDo.menu(input, inputS);
                    }else if(input.nextInt() == 2){
                        ToDo.apriL(input, inputS);
                    }
                }
            }
            catch (IOException err)
            {
                err.printStackTrace();
            }
        }
        catch(Exception e) {
            System.out.println(": il nome del file immesso non esiste! ");
            System.out.println(": 1 = per tornare al menu       2 = per ricercare un altro file");
            if(input.nextInt() == 1)
            {
                ToDo.menu(input, inputS);
            }else{
                ToDo.apriL(input, inputS);
            }
        }
    }

    /* FIXME */
    private static void deleteL(Scanner input, BufferedReader inputS)
    {
        String percorso = "C:\\Users\\unipi\\Desktop\\ToDoList\\fileTuoi\\";
        System.out.println(": immettere il nome del file da cancellare -> ");

        try
        {
            String nome = inputS.readLine();
            percorso = percorso + nome + ".txt";
            File file = new File(percorso);

            System.out.println(": sicuro di voler cancellare il file?");
            System.out.println(": 1 = si      2 = no");
            if(input.nextInt() == 1)
            {
                file.delete();
                System.out.println(": file cancellato!");
                System.out.println(": 1 = per tornare al menu       2 = per ricercare un altro file da cancellare");
                if(input.nextInt() == 1)
                {
                    ToDo.menu(input, inputS);
                }else{
                    ToDo.deleteL(input, inputS);
                }
            }else{
                ToDo.menu(input, inputS);
            }
        }
        catch (IOException e){
            System.out.println(": il file da cancellare non esiste! ");
            System.out.println(": 1 = per tornare al menu       2 = per ricercare un altro file da cancellare");
            if(input.nextInt() == 1)
            {
                ToDo.menu(input, inputS);
            }else{
                ToDo.deleteL(input, inputS);
            }
        }
    }
}


