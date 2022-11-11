/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11roulette_again;

/**
 *
 * @author davidlangner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4 areas in a wheel
        // spin the wheel and check with what probability the areas are going to appear
        // area 1: size 15 0->15
        // area 2: size 4 15->19
        // area 3: size 14 19 -> 33
        // area 4: size 7 33 -> 40
        
        //num of rounds
        int rounds = 10000;
        
        //init the size of the areas
        double area1 = 15;
        double area2 = 4;
        double area3 = 14;
        double area4 = 7;
        
        //toal area
        double total = (area1 + area2 + area3 + area4);
        
        
        //keep track of how many times each area was hit
        double hit1 = 0, hit2= 0, hit3= 0, hit4= 0;
        
        //random
        java.util.Random r = new java.util.Random();
        
        
        //play roullete 'rounds' times
        for(int i = 0; i < rounds; i++)
        {
            //spin the wheel and keep track which area was hit
            double area_hit = r.nextDouble(40);
            
            //check which area was hit and increase hit counter
            if(area_hit < area1)
            {
                hit1 += 1.0;
            }
            else if (area_hit < (area1+area2))
            {
                hit2 += 1.0;
            }
            else if (area_hit < (area1+area2+area3))
            {
                hit3 += 1.0;
            }
            else
            {
                hit4 += 1.0;
            }
            
        }
        
        //calculate the actual probability
        double act1 = (area1/total);
        double act2 = (area2/total);
        double act3 = (area3/total);
        double act4 = (area4/total);
        //print actual out
        System.out.println("Actual  probs: Area 1: " + act1 + " Area 2: " + act2 + " Area 3: " + act3 + " Area 4: " + act4);
        
        
        //calc the generate prob
        double calc1 = (hit1/rounds);
        double calc2 = (hit2/rounds);
        double calc3 = (hit3/rounds);
        double calc4 = (hit4/rounds);
        //print actual out
        System.out.println("Calcul. probs: Area 1: " + calc1 + " Area 2: " + calc2 + " Area 3: " + calc3 + " Area 4: " + calc4);
        
        
        
        //
    }
    
}
