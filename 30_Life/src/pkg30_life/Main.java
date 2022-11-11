/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg30_life;

import java.util.*;
/**
 *
 * @author davidlangner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // every home has two humans that live there
        //3 lists -> humans that contains all humans
        // corporations contains all corporations
        //home contains all homes
        
        //vars
        int numHumans = 0;
        int numCorporations = 10;
        int numHomes = 0;
        
        //set boundaries for Employee count
        int minEmployees = 5;
        int maxEmployees = 500;
        //Human[] human = new Human[numHumans];*/
        
        
        //human list & corporations list & home list
        ArrayList<Human> humans = new ArrayList<>();
        ArrayList<Corporation> corporations = new ArrayList<>();
        ArrayList<Home> homes = new ArrayList<>(); 
        
        //random
        Random r = new Random();
        
        //first add every corporation to the corporations list
        for(int i = 0; i < numCorporations; i++){
            corporations.add(new Corporation());
        }
        
        //add to every Corporation a random number of employees
        corporations.forEach(Corporation -> {
            //get random number of employees
            int numEmployee = r.nextInt(minEmployees, maxEmployees);
            for(int i = 0; i < numEmployee; i++){
                //add every employee to a corporations list and to the humans list
                Human human = new Human();
                Corporation.employeeList.add(human);
                humans.add(human);
            }
        });
        
        numHumans = humans.size();
        //check if there is a even number of humans
        int random = r.nextInt(numCorporations);
        //if there isnt a even number add one human to a random company
        if (numHumans % 2 != 0){
            Human human = new Human();  
            humans.add(human);
            corporations.get(random).employeeList.add(human);
            numHumans++;
        } 
        
        //distribute all humans into homes where every home can contain 2 humans
        //add every existing home to the homes list
        numHomes = numHumans/2;
        for(int i = 0; i < numHomes; i++){
            homes.add(new Home());
        }
        
        //add the humans to the homes the first human with the last ...
        for(int i = 0; i < numHumans; i++){
            
        }
    }
    
}
