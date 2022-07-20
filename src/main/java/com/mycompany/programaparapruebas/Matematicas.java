/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programaparapruebas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC-1
 */
public class Matematicas 
{
    private List numPar=new ArrayList();
    private List num0_n=new ArrayList();
    private List numDivisibles=new ArrayList();
    private List notas;
    private double notasAprovadas=0;
    private double notasReprovadas=0;
    private int numI;
    private int numF;
    private int n;
    private double sumatoria=0.0;
    public Matematicas(int numI,int numF)
    {
        this.numI=numI;
        this.numF=numF;
    }
    public Matematicas(int n)
    {
       this.n=n;
    }
    public Matematicas(List notas)
    {
        this.notas=notas;
    }
    public List numPares()
    {
        for(int i=numI; i<=numF; i++)
        {
           if(i%2==0)
           {
               numPar.add(i);
           }
        }
        return numPar;
    }
    public List num0_n()
    {
        for(int i=0;i<=n;i++)
        {
            num0_n.add(i);
        }
        return num0_n;
    }
    public List numDivisibles()
    {
        for(int i=numI;i<=numF;i++)
        {
            if(i%3==0)
            {
                numDivisibles.add(i);
            }
        }
        return numDivisibles;
    }
    public double calcularSumatoria()
    {
        for(int i=1;i<=n;i++)
        {
            double decimal=i*1.0;
            sumatoria=sumatoria+(5/decimal);
        }
        return sumatoria;
    }
    public double calcularNotas()
    { 
        int nA=0;
        int nR=0;
        for(int i=0;i<=notas.size();i++)
        {
            double j=(double)notas.get(i);
            
            if(j<7.0)
            {
                notasAprovadas=notasAprovadas+((double)notas.get(i));
                nR++;
            }else{
                notasReprovadas=notasReprovadas+((double)notas.get(i));
                nA++;        
            }
        }
        notasAprovadas=notasAprovadas/(nA*1.0);
        notasReprovadas=notasReprovadas/(nR*1.0);
        return notasAprovadas;
    }
    
    
    
    
    
}
