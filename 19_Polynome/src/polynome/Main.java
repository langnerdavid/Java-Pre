/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polynome;
import java.util.Arrays;
/**
 *
 * @author davidlangner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create object of polynom class
        //init coefficients
        //coeff[0] x^0 && coeff[1] x^1 ....
        double[] coeff = {1, 1, 0, 1, 2};
        
        //print the plan of the function
        System.out.println("[x^0, x^1, x^2, x^3, x^4]");
        //print out the function
        System.out.println("Function " + Arrays.toString(coeff));
        
        Polynom poly = new Polynom(coeff);
        
        //get degree from polynom
        System.out.println("Degree: " + poly.getDegree());
        
        //get derivation (Ableitung)
        double[] array = poly.getDerivation();
        //print out the coefficients
        System.out.println("Derivation: " + Arrays.toString(array));
        
        //print out the value of the polynom at x=1
        double x = 1;
        double value = poly.getValue(x);
        System.out.println("Functional value at x:" + x + " is: " + value);
    }
    
}
