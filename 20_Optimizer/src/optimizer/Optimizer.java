/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optimizer;

/**
 *
 * @author davidlangner
 */
public class Optimizer {
    // vars
    private final double[] masses;
    private final double[] values;
    
    //every chromosom has its own code
    private int[][] code;
    
    //number of individiums/chromosoms
    private final int nIndividuals;
    //number of masses
    private final int nMasses;
    //num of Generations
    private final int nGenerations = 100;
    
    //every chromosom has its own fitness
    private double[] fitness;
    
    //constructor
    public Optimizer(){
        nIndividuals = 10;
        nMasses = 8;
        
        masses = new double[nMasses];
        values = new double[nMasses];
        fitness = new double[nIndividuals];
        
        //init masses
        masses[0] = 7;
        masses[0] = 7;
        masses[0] = 7;
        masses[0] = 7;
        
        //init values
        values[0] = 10;
        values[0] = 10;
        values[0] = 10;
        values[0] = 10;
        values[0] = 10;
        
        //for every mass a value (in the bagpack or not) and for every chromosom a row
        code = new int[nMasses][nIndividuals];
    }
    
    public void optimize(){
        //code every chromosome coincidentally
        
        //calculate fitness 
        calcFitness();
        
        //generate nGenerations
        for(int i = 0; i < nGenerations; i++)
        {
            //generate new generation 
            //selection (roullete spiel)
            //crossing
            //mutation
        }
    }
    
    public void showResults(){
        
    }
    
    //calc fitness of each chromosome
    private double calcFitness(){
        for(int i = 0; i < nIndividuals; i++)
        {
            fitness[i] = 0;
            for(int j = 0; j < nMasses; j++)
            {
                //add mass to fitness if its packed in the bag if its not than values[j]=0 than dont add it to fitness
                fitness[i] += code[j][i] * values[j];
            }
        }       
    }
}
