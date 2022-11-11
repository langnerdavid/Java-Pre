/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg29_polygon;

import java.util.*;
import java.awt.Point;
/**
 *
 * @author davidlangner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create container of array list 
        ArrayList<Point> polygon = new ArrayList<>();
        polygon.add(new Point(0 , 0));
        polygon.add(new Point(1 , 0));
        polygon.add(new Point(0 , 1));
        
        //print each element out with a lambda expression
        polygon.forEach(point -> {
            System.out.format("(%d, %d) \n", point.x, point.y);
        });
        
        //other way with for loop
        for(int i = 0; i < polygon.size(); i++){
            System.out.format("(%d, %d)\n", polygon.get(i).x, polygon.get(i).y);
        }
    }
    
}
