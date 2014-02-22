/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gacode;

import java.util.ArrayList;
import java.util.Comparator;

public class FormulaCell implements Comparator<FormulaCell>  {
    private ArrayList<Integer> sequence; 
    private double fitness; 
    
    FormulaCell() {
        sequence = new ArrayList<>(); 
    }
    
    int sequenceLength() {
        return sequence.size();
    }
    
    double getFitness() {
        return fitness; 
    }
    
    void setFitness(double fitness) {
        this.fitness = fitness; 
    }
    
    void addGene(int gene) {
        if(gene >= 0)
            sequence.add(gene);
    }
    
    boolean setGene(int index, int value) {
        if((index >= 0 ) && (index < sequence.size())) {
            sequence.set(value, index);
            return true;
        }
        return false;
    }
    
    int getGene(int index) {
        if((index >= 0 ) && (index < sequence.size())) {
            return sequence.get(index);
        }
        return -1;
    }
    
    boolean setSequence(ArrayList<Integer> newSequence) {
        for(int item : newSequence) {
            if(item < 0) return false;
        }
        sequence = new ArrayList<Integer>(newSequence);
        return true;
    }
        
    ArrayList<Integer> getSequence() {
       return new ArrayList<Integer>(sequence);
    }
   
   // Overriding the compare method to sort the age 
   public int compare(FormulaCell d, FormulaCell d1){
       
       return Double.compare(d.fitness, d1.fitness);
   }
}