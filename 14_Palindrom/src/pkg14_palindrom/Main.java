/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14_palindrom;

/**
 *
 * @author davidlangner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // checks if the user input is a palindrom
        //forwards and backwards the same word
        
        //get user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        
        //remove everthying expcetp letters from the string
        string = string.replaceAll("[^a-zA-Z]", "");
        
        //init String builder
        StringBuilder sb = new StringBuilder();
        
        //append the initial string to stringbuilder
        sb.append(string);
        
        //reverse the string in the stringbuilder and make it to a string
        String reverse = sb.reverse().toString();
        
        //check if its a palindrom and print out the result
        if(string.equalsIgnoreCase(reverse))
        {
            System.out.println("String is a Palindrom");
        }
        else
        {
            System.out.println("String is not a Palindrom");
        }
    } 
}
