package pkg24_delegateexception;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author davidlangner
 */
public class SimpleMath {
    
    public double calcSqrt(double x){
       if (x >= 0) return Math.sqrt(x);
       else throw new ArithmeticException("Value cant be negative! Value must be postive!");
    }
    
    
}
