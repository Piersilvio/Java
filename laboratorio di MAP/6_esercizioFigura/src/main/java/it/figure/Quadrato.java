package it.figure;

public class Quadrato extends Rettangolo {

    public Quadrato(double lato) {
        super(lato, lato);
    }

    public String toString() {
        return "Quadrato di lato " + super.dim1;
    }

}