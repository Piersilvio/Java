package com.figura;

public class Triangolo {
    private float l1;
    private float l2;
    private float l3;

    public Triangolo(float l1)
    {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public Triangolo(float l1, float l2)
    {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public Triangolo(float l1, float l2, float l3)
    {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public float per() {
        return  l1 + l2 + l3;
    }
}
