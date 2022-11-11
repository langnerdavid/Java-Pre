/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample;

/**
 *
 * @author davidlangner
 */
public class Vector {
    
    //components of vetor
    private double[] data;
    
    //setter method
    public void setData(double[] data){
        this.data = data;
    }
     
    //returns true if the 2 given vectors are the same false if otherwise
    public boolean equals(Vector v1, Vector v2)
    {
        //check if they are of the same length
        if(v1.data.length != v2.data.length) return false;
        
        //loop through every element and check if they are the same
        for(int i = 0; i < v1.data.length; i++){
            if(v1.data[i] != v2.data[i]) return false; 
        }
        //if all elements are the same return true
        return true;
    }
    
    //scalar multiplication method
    public double scalarMultiplication(Vector v1, Vector v2){
       
        //check if they are of the same length
        if(v1.data.length != v2.data.length) return 0;
        
        //init result
        double result = 0;
        //loop through every element and add it to resut
        for(int i = 0; i < v1.data.length; i++){
            result += v1.data[i] * v2.data[i];
        }
        
        //return
        return result;
    }
    
}
