package it.figure;

public class Triangolo extends FiguraComp {

    public Triangolo(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        return super.dim1 * super.dim2 / 2;
    }

    @Override
    public String toString() {
        return "Triangolo con dimensioni " + super.dim1 + ", " + super.dim2;
    }
}