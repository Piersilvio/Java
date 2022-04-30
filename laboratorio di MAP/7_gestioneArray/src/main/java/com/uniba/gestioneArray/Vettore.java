
package com.uniba.gestioneArray;

/**
 *
 * @author unipi
 */
public class Vettore {
    private int[] a = new int[100];
    private int n;
    
    public Vettore(){
        n = 0;
    }
    
    public void push(int el)
    {
        a[n] = el;
        n++;
    }
    
    public int max(){
        int i;
        int max = a[0], p = 0;
        
        for(i = 0; i < n; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
                p = i;
            }
        }
        
        return p;
    }
    
    public double media()
    {
        int i;
        double s = 0;
        
        for(i = 0; i < n; i++){
            s += a[i];
        }
        s /= n;
        
        return s;
    }
    
    public void pop(int el)
    {
        for(int i = 0; i < n; i++)
        {
            if(a[i] == el)
            {
                for(; i < n - 1; i++)
                {
                    a[i] = a[i + 1];
                    a[n - 1] = 0;
                    i++;
                }
            }
        }
    }
}
