/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg24_delegateexception;

/**
 *
 * @author davidlangner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test SimpleMath class
        SimpleMath math = new SimpleMath();
        
        //try to calculate the square root
        try{
            double x = math.calcSqrt(-4);
            System.out.println(x);
        }
        //if exception is thrown, catch it and print out the message
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    
}
