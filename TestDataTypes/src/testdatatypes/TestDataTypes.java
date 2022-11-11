/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testdatatypes;

/**
 *
 * @author davidlangner
 */
public class TestDataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //test some data types and math operations
    double y = 1E250 * 1E250;
    System.out.println("y = " + y);
    
    double x = 3.0 / 0.0;
    System.out.println("x = " + x);
    
    double a = 0.7;
    System.out.println("a = " + a);
    
    double b = 0.9;
    System.out.println("b = " + b);
    
    double c = a + 0.1;
    System.out.println("c = " + c);
    
    double d = b - 0.1;
    System.out.println("d = " + d);
    
    java.util.Random r = new java.util.Random();
    
    double x2 = r.nextDouble();
    System.out.println("x2 = " + x2);
    
    int k = r.nextInt(10);
    System.out.println("k = " + k);
    }
    
}
