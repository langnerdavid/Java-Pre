/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teststring;

/**
 *
 * @author davidlangner
 */
public class Teststring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //init vars
        String s1 = "hallo";
        String s2 = "Hallo";
        
        
        //compares two strings and prints out if they are the same
        if(s1.compareTo(s2) == 0)
        {
            System.out.println("Strings are the same!");
        }
        else
        {
            System.out.println("Strings are not the same!");
        }
        
        //init two more strings
        String s3,s4;
        s3 = "hallo";
        s4 = "HALLO";
        
        // do not compare strings with == instead use string.compareTo
        System.out.println(s3==s4);
        
        //change s4 to all lowercase
        //s4 = "hallo"
        s4 = s4.toLowerCase();
        
        //must be identical but if you compare them with == you get false
        //== compares the memory location   
        System.out.println(s3==s4);
        
    }
    
}
