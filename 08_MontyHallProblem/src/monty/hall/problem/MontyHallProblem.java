/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monty.hall.problem;

/**
 *
 * @author davidlangner
 */
public class MontyHallProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a player stands in front of 3 doors behind one of them is a price behind the other two is a rivet
        //after the player makes his choice his door isnt going to be opened
        //another gets opened with a rivet in it 
        //then the player gets asked if he stays at his initial door or 
        //if he would open the other closed door
        
        //write a program that simulates a lot of games and calculate number of wins the player has bei any of the 2 choices 
        // -> (stay at his initial door or change)
        
        //number of rounds
        int num_rounds = 1000;
        
        //init hits
        int hit = 0;
        
        //random number
        java.util.Random r = new java.util.Random();
        
        
        //calculate random number and in dependecy of which one door gets the price
        
        
        for(int i = 0; i < num_rounds; i++)
        {
            //random number 1-3 behind which the prize is
            int prize_door = r.nextInt(3);
            
            //player takes a random guess 
            int player_door1 = r.nextInt(3);
            
            //players 2nd guess init to 0
            //we need the second guess because we are going to assume the player is going to redecide every time
            int player_door2 = 0;
            
            //eliminate one door with a rivet behind it
            //get that door randomly
            int rivet;
            while(true)
            {
                rivet = r.nextInt(3);
                if(rivet != prize_door && rivet != player_door1) break;
            }
            
            for(int j = 0; j < 3; j ++)
            {
                if(j != player_door1 && j != rivet) 
                {
                    player_door2 = j;
                    break;
                }
            }
            
            if(player_door2 == prize_door)
            {
                hit++;
            }
            
        }
        
        //print out the result
        System.out.println("If you would redecide every time your chance of winning would be roughly: " + (hit / (float) num_rounds * 100) + "%");
        
        
    }
    
}
