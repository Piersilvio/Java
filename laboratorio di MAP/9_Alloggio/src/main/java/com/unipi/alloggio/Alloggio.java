
package com.unipi.alloggio;
import java.util.Scanner;

/**
 *
 * @author unipi
 */
public class Alloggio {
    private int id;
    private double extension;
    private double costo_mq;
    private double perc_tasse;
    private double metriQuadri_calpestabili;
    
    Scanner in = new Scanner(System.in);
    
    /**
     * 
     * @return true if push is succesfully
     */
    public boolean push(){
        System.out.println("Inserire i dati del nuovo alloggio");
        System.out.println();
        
        //inserimento
        this.id++;
        System.out.println("estensione (in metri quadri) ->");
        this.extension = in.nextLong();
        System.out.println("costo al metro quadro ->");
        this.costo_mq = in.nextLong();
        System.out.println("percentuale di tasse ->");
        this.perc_tasse = in.nextLong();
        System.out.println("metri quadri calpestabili ->");
        this.metriQuadri_calpestabili = in.nextLong();
        
        return true;
    }
    
    /**
     * 
     * @param id
     * @return double
     */
    public double valoreAlloggio(int id) { return this.extension * this.costo_mq; }
    
    /**
     * 
     * @param id
     * @return double
     */
    public double tassaDaPagare(int id){ return this.metriQuadri_calpestabili / this.perc_tasse; }
    
    @Override
    public String toString()
    {
        return "codice: " + this.id + "\n" 
                + "estensione: " + this.extension + "\n" 
                + "costo al metro quadro: " + this.costo_mq + "\n" 
                + "percetuale tassa: " + this.perc_tasse + "\n"
                + "metriquadri calpestabili: " + this.metriQuadri_calpestabili + "\n";
    }
}
