/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classtestsimple;

/**
 *
 * @author davidlangner
 */
public class Factorial {
    //calculates with recursion the factorial number
    
    //init an int
    private int i;
    
    public Factorial(){}
    
    //public method to calculate the factorial 
    public int factorial(int i)
    {
        if(i<=1)return 1;
        return i * factorial(i-1);
    }
}
