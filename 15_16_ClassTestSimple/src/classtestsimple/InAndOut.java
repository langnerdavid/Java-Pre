package classtestsimple;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author davidlangner
 */
public class InAndOut {
    
    private String s;
    //class where you can input a string with a method and let the string print out afterwards
    public InAndOut(){}
    
    public void input(){
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
    }
    
    public void output(){
        System.out.println(s);
        
    }
}
