package com.classeBanca;

public class CC {
    private String nomeCliente;
    private int nConto;
    private float saldo;

    public CC(String nomeCliente, int nConto)
    {
        this.nConto = nConto;
        this.nomeCliente = nomeCliente;
        saldo = 0;
    }

    public String getN_C() { return nomeCliente; }
    public int getNconto() { return nConto; }
    public float getSaldo() { return saldo; }

    public void versamento(float s)  { saldo += s; }
    public boolean prelievo(float s)
    {
        boolean prelievoFatto = true;
        if(saldo > s)
        {
            saldo -= s;
        }else { prelievoFatto = false; }

        return prelievoFatto;
    }

    //metodo di stampa dello stato del conto
    public String toString() { return "numero conto: " + getNconto() + " nome intestatario: " + getN_C() + " saldo: " + getSaldo(); }
}
