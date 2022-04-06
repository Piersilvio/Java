package it.figure;

public abstract class FiguraComp implements Figura, Comparable {

    double dim1;
    double dim2;

    public FiguraComp(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    @Override
    public int compareTo(Object o) {
        if (((Figura) o).area() == this.area()) {
            return 0;
        } else if (((Figura) o).area() < this.area()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Figura) {
            return (((Figura) o).area() == this.area());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.dim1) ^ (Double.doubleToLongBits(this.dim1) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.dim2) ^ (Double.doubleToLongBits(this.dim2) >>> 32));
        return hash;
    }

    @Override
    public abstract double area();

}