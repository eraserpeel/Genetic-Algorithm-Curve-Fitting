/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gacode;

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class CellPopulation {
    private HashMap geneMap; 
    private ArrayList<FormulaCell> cellPopulation; 
    
    private int     initialPopulationSize; 
    private int     currentPopulationSize;
    private double  mutationRate;
    private boolean sequenceLengthChange;
    private int     initialSequenceLength;
    private int     initialGeneLength;

    
    static private Comparator<FormulaCell> ascTitle;
    static private Comparator<FormulaCell> descPageNumber;

    // We initialize static variables inside a static block.
       
    CellPopulation(int initialPopulationSize, 
                   int initialSequenceLength, 
                   String geneFile) {
       
       geneMap                    = new HashMap(); 
       cellPopulation             = new ArrayList<>(); 
       this.initialPopulationSize = initialPopulationSize; 
       this.initialSequenceLength = initialSequenceLength;
       this.initialGeneLength     = initialGeneLength;
       
       int k = initializeGeneMap(geneFile);
       initialGeneLength = (int)Math.ceil(Math.log(k)/Math.log(2));
       initializeSequences(this.initialPopulationSize, 
                           this.initialGeneLength, 
                           this.initialSequenceLength);
       
       
    }
    
    private void initializeSequences(int populationSize, 
                                     int initialGeneLength,
                                     int initialSequenceLength) { 
        Random rnd = new Random();
        int geneLengthBinaryMaxDigits = (int)Math.pow(2.0, (double)initialGeneLength);
        for(int i = 0; i < populationSize; i++) {
            FormulaCell temp = new FormulaCell();
            for(int j = 0; j < initialSequenceLength; j++) {
                temp.addGene(rnd.nextInt(geneLengthBinaryMaxDigits));
            } 
            cellPopulation.add(temp);
        }
    }
    
    private int initializeGeneMap(String file) {
        int itemCount = 0; 
        try {
            BufferedReader in  = new BufferedReader(new FileReader(file));
            while (in.ready()) {
                geneMap.put(itemCount, in.readLine());
                itemCount++;
            }
        }
        catch(Exception e) {
            //System.out.println(e);
        }
        return itemCount++; 
    }
  

    
    void recombineCells() {
        Random rnd = new Random(); 
        int countLimit = cellPopulation.size();
        for(int i = 0; i < countLimit; i++) {
            FormulaCell fc1 = cellPopulation.get(i);
            for(int j = i + 1; j < countLimit - 1; j++) {
                FormulaCell fc2 = cellPopulation.get(j);
                int splicePoint1 = rnd.nextInt(fc1.sequenceLength()) + 1;
                int splicePoint2 = rnd.nextInt(fc2.sequenceLength()) + 1;
                FormulaCell newCell = new FormulaCell(); 
                ArrayList<Integer> t1 = new ArrayList<Integer>(fc1.getSequence().subList(0, splicePoint1));
                ArrayList<Integer> t2 = new ArrayList<Integer>(fc2.getSequence().subList(splicePoint2, fc2.sequenceLength()));
                t1.addAll(t2);
                newCell.setSequence(t1);
                cellPopulation.add(newCell);
            }
        }
        
    }
    
    int cullPopulation() {
        int count = 0; 
        Iterator<FormulaCell> cellsItr = cellPopulation.iterator(); 
        HashMap exprHash = new HashMap(); 
        String  expr; 
        //Remove all equations that are invalid.
        int totalCells = cellPopulation.size();
        while(cellsItr.hasNext()) {
            expr = convertSequenceToExpression(cellsItr.next().getSequence());
            if((!EvaluateExpressions.isValidExpression(expr)) || 
               (exprHash.containsKey(expr)) ||
               (!expr.contains("x"))) {
                cellsItr.remove();
            }
            else {
               exprHash.put(expr, count);
               count++; 
            }
        }
        sortCellByFitness();
        if(cellPopulation.size() > 100) {
            List<FormulaCell> temp = cellPopulation; 
            temp.subList(100, temp.size()).clear();
        }
        return (totalCells - count);
    }
    
    ArrayList<FormulaCell> calculateFitness(ArrayList<Point2D.Double> coordinates) {
        double target = 0;
        String expression;
        for(int i = 0; i < cellPopulation.size(); i++) {
            double fitnessSum = 0;
            expression = convertSequenceToExpression(cellPopulation.get(i).getSequence());
            
            for(Point2D.Double coord: coordinates) {
                target = EvaluateExpressions.evaluate(expression, coord.x);
                fitnessSum = fitnessSum + Math.abs(target - coord.y);
            }
            cellPopulation.get(i).setFitness(fitnessSum);
         }
        return cellPopulation;
    }
    
    String convertSequenceToExpression(ArrayList<Integer> sequence) {
        String currentSequence = "";
        for(int gene : sequence) {
            currentSequence = currentSequence + geneMap.get(gene);
        }
        return currentSequence;
    }
    
    ArrayList<FormulaCell> getCells() {
        return cellPopulation;
    }
    
    ArrayList<String> getSequencesAsExpressions() {
        ArrayList<String> formulaeAsStrings = new ArrayList<>(); 
        for (FormulaCell cell : cellPopulation) {
            String currentSequence = "";
            for(int gene : cell.getSequence()) {
                currentSequence = currentSequence + geneMap.get(gene);
            }
            formulaeAsStrings.add(currentSequence);
        }
        return formulaeAsStrings;
    }
    
    ArrayList<String> getSequencesAsBinary() {
        ArrayList<String> formulaeAsStrings = new ArrayList<>(); 
        for (FormulaCell cell : cellPopulation) {
            String currentSequence = "";
            for(int gene : cell.getSequence()) {
                currentSequence = currentSequence + Integer.toBinaryString(gene);
            }
            formulaeAsStrings.add(currentSequence);
        }
        return formulaeAsStrings;
    }
    
    private void sortCellByFitness() {
        Collections.sort(cellPopulation, new FormulaCell());
    }
}
