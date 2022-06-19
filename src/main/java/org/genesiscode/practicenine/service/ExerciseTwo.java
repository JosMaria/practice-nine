package org.genesiscode.practicenine.service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.genesiscode.practicenine.view.row.RowResultTwo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PrimitiveIterator;

public class ExerciseTwo {

    private static ExerciseTwo exerciseTwo;
    private List<Double> randomNumbers;

    private ExerciseTwo() {}

    public synchronized static ExerciseTwo getInstance() {
        return exerciseTwo == null ? new ExerciseTwo() : exerciseTwo;
    }

    public void setRandomNumbers(List<Double> randomNumbers) {
        this.randomNumbers = randomNumbers;
    }

    public ObservableList<RowResultTwo> getResultList(int uniformMin, int uniformMax, int formParameter, int expectedValue) {
        ObservableList<RowResultTwo> list = FXCollections.observableArrayList();
        Iterator<Double> iterator = randomNumbers.iterator();
        int assemblies = 1, accumulatedDefectiveParts = 0;
        double randomNumberOne, randomNumberTwo, randomNumberThree, randomNumberFour, randomNumberFive,
                barDimensionA, barDimensionB, totalLength, percentageOfDefectiveParts;
        boolean defective;

        int lowerSpec = 70, topSpec = 90;

        while (iterator.hasNext()) {
            randomNumberOne = iterator.next();
            barDimensionA = Decimal.getDecimal(2, uniformMin+((uniformMax-uniformMin)*randomNumberOne));
            randomNumberTwo = iterator.hasNext() ? iterator.next() : 0;
            randomNumberThree = iterator.hasNext() ? iterator.next() : 0;
            randomNumberFour = iterator.hasNext() ? iterator.next() : 0;
            randomNumberFive = iterator.hasNext() ? iterator.next() : 0;
            barDimensionB = calculate(formParameter, expectedValue, randomNumberTwo, randomNumberThree, randomNumberFour, randomNumberFive);
            totalLength = Decimal.getDecimal(2, barDimensionA + barDimensionB);
            defective = ! (lowerSpec <= totalLength && totalLength <= topSpec);
            if (defective) {
                accumulatedDefectiveParts++;
            }
            percentageOfDefectiveParts = Decimal.getDecimal(2, (double) accumulatedDefectiveParts / assemblies * 100);

            RowResultTwo row = new RowResultTwo(assemblies, randomNumberOne, barDimensionA, randomNumberTwo,
                    randomNumberThree, randomNumberFour, randomNumberFive, barDimensionB, totalLength,
                    lowerSpec, topSpec, defective, accumulatedDefectiveParts, percentageOfDefectiveParts);
            list.add(row);
            assemblies++;
        }
        return list;
    }

    private double calculate(int formParameter, int expectedValue, double... randomNumbers) {
        PrimitiveIterator.OfDouble iterator = Arrays.stream(randomNumbers).iterator();
        double valueAnt = 1;
        while (iterator.hasNext()) {
            valueAnt *= (1 - iterator.next());
        }
        return Decimal.getDecimal(2, -(formParameter * Math.log(valueAnt) / expectedValue));
    }
}
