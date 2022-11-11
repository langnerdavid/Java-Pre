/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12random_walk;

/**
 *
 * @author davidlangner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // simulate a random walk of a figure on a specific line
        // postion of the figure = x start x = 0
        // figure walks coincedentically 1 step left or right (same prob)
        // figure makes that k times = 1 walk
        // there are N walkers
        
        //steps per walk
        int steps = 100;
        
        //num of walks
        int walks = 10;
        
        //start pos
        int x = 0;
        
        //keep track of every postion at every time
        //evera line is a new walk with k steps
        int[][] pos;
        pos = new int[steps][walks];
        
        
        //random
        java.util.Random r = new java.util.Random();
        
        //simulate the program
        for(int i = 1; i < walks; i++) //num of walks
        {
            pos[0][i] = 0;
            
            for(int j = 1; j < steps; j++)//num of steps per walk
            {
                //generate random num if <50 than step left(-1) else step right(+1)
                int num = r.nextInt(100);
                if(num < 50)
                {
                    pos[j][i] = pos[j - 1][i] - 1;
                }
                else
                {
                    pos[j][i] = pos[j - 1][i] + 1;
                }
            }
        }
        
        //add every pos together and calc the medium pos per step
        double total = 0;
        for(int i = 0; i < steps; i++)
        {
            total = 0.0;
            for(int j = 1; j < walks; j ++)
            {
                total += Math.abs(pos[i][j]);
            }
            
            double mean = total / (double) walks;
            System.out.println(i + "\t" + mean);
        }
        
        
        
        
        
        
    }
    
}
