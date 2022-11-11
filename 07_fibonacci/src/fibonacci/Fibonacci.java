/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author davidlangner
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //prints out the fibonacci number without recursion
        //and print out the ratio
        //make sure the ratio is near the golden cut (1+sqrt(5))/2= 1.618
        
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        int fMax = 1000;
        
        while(f3 < fMax)
        {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.println(f3 + "\t" + (double)f2/(double)f1 + "\t" + 0.5*(1+Math.sqrt(5)));
        }
        
        
    }
    
}
