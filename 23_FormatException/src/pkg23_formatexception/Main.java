/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23_formatexception;

import java.util.Scanner;
/**
 *
 * @author davidlangner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //scanner 
    Scanner scanner = new Scanner(System.in);
    
    //init String
    String stringToConvert = "";
    
    int num;
    while(true){
        
        //try to get user input as string and convert it to an int if possible 
        try{
            //get user input
            System.out.println("Please enter an integer number: ");
            stringToConvert = scanner.nextLine();
            //convert string into an int
            num = Integer.parseInt(stringToConvert);
            if(num < 0) throw new IllegalArgumentException("Integer number has to be positive!");
            break;
        }
        //if its not working catch an exception
        catch (NumberFormatException e){
            System.err.printf("'%s' kann man nicht in eine Zahl konvertieren! \n",stringToConvert);
            //e.printStackTrace();
            System.err.println(e.getMessage());
        } 
        //if Illegal Argument Excpetion
        catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
    
    //move on
    System.out.println( "Weiter geht's" );
    } 
}
