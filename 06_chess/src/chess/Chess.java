/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chess;

/**
 *
 * @author davidlangner
 */
public class Chess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //prints out a chess board in quadratical function
        // . and * 
        
        //var for width and height of a field
        int length = 2;
        
        //a chess board is 8*8
        //init a var that matches the size
        int size = 8;
        
        String dot = "";
        String star = "";
        
        //init the two lines
        //one with * at the begining and one with . at the begining
        String line_star = "";
        String line_dot = "";
        
        //update the dot and star strings that it matches the length (width and height of a field)
        for(int i = 0; i < length; i++)
        {
            dot += ".";
            star += "*";
        }
        
        
       //add * and . to the lines
       for(int i = 0; i < (size/2); i++)
       {
           line_star += star;
           line_star += dot;
           line_dot += dot;
           line_dot += star;
       }
       
       //print out the result
       for(int i = 0; i < (size); i++)
       {
           if(i%2 == 0)
           {
               for(int j = 0; j < length; j++)
               {
                   System.out.println(line_dot);
               }
           }
           else
           {
               for(int j = 0; j < length; j++)
               {
                   System.out.println(line_star);
               }
           }
       }     
    }
    
}
