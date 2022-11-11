/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10arraystestbench;

/**
 *
 * @author davidlangner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //programm that makes an array with 100 coincidentally double numbers
        //sort the array with java.util.Arrays and print everything out
        //compare two arrays
        
        //bound for the numbers
        double bound = 100;
        
        //init the array with 100 values
        int size = 100;
        double[] arr;
        arr = new double[100];
        
        //random
        java.util.Random r = new java.util.Random();
        
        //generate 'size' times a random double number and put it in the array
        for(int i = 0; i < size; i++)
        {
            double temp = r.nextDouble(100);
            arr[i] = temp;
        }
        
        //sort the array
        java.util.Arrays.sort(arr);
        
        //print out the sorted array
        for(int i = 0; i < size; i++)
        {
            System.out.println(arr[i]);
        }

    }
    
}
