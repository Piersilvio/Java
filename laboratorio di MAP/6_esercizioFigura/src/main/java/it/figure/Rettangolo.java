package it.figure;

public class Rettangolo extends FiguraComp {

    public Rettangolo(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        return super.dim1 * super.dim2;
    }

    public String toString() {
        return "Rettangolo di dimensioni " + super.dim1 + ", " + super.dim2;
    }

}