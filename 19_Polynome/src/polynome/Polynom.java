/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polynome;

import java.lang.Math;


/**
 *
 * @author davidlangner
 */
public class Polynom {
    //arr var that represents the coefficients up until 4th degree
    private double[] coeff;
       
    
    public Polynom(double[] arr){
        coeff = arr;
    }
    
    public int getDegree(){
        //init temp degree
        int tempDegree = -1;
        for(int i = 0; i < coeff.length; i++)
        {
            if(coeff[i] != 0){
                tempDegree = i;
            }
        }
        return tempDegree;
    }
    
    public double[] getDerivation(){
        double[] derivation = new double[coeff.length];
        for(int i = 0; i < coeff.length; i++)
        {
            //updates the coeffitient
            if((i+1) < coeff.length){
                derivation[i] = coeff[i+1] * (i+1);
            }else
            {
                derivation[i] = 0;
            }
        }
        return derivation;
    }
    
    //get a specific function value at a value x
    public double getValue(double x)
    {
        //set value to 0
        double value = 0;
        //loop through the function
        for(int i = 0; i < coeff.length; i++)
        {
            //Math.pow(2,3) = 2^3
            value += coeff[i]*Math.pow(x, (double)i);
        }
        return value;
    }
}
