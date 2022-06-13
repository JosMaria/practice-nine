package org.genesiscode.practicenine.service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.genesiscode.practicenine.view.row.RowResultTwo;

import java.util.Iterator;
import java.util.List;

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

    public ObservableList<RowResultTwo> getResultList() {
        ObservableList<RowResultTwo> list = FXCollections.observableArrayList();
        Iterator<Double> iterator = randomNumbers.iterator();
        int assemblies = 1;
        double randomNumberOne, randomNumberTwo, randomNumberThree, randomNumberFour, randomNumberFive,
                barDimensionA;
        int uniformMin = 45, uniformMax = 55;
        while (iterator.hasNext()) {
            randomNumberOne = iterator.next();
            barDimensionA = Decimal.getDecimal(4, uniformMin + ((uniformMax - uniformMin) * randomNumberOne));
            randomNumberTwo = iterator.hasNext() ? iterator.next() : 0;
            randomNumberThree = iterator.hasNext() ? iterator.next() : 0;
            randomNumberFour = iterator.hasNext() ? iterator.next() : 0;
            randomNumberFive = iterator.hasNext() ? iterator.next() : 0;

            RowResultTwo row = new RowResultTwo(assemblies, randomNumberOne, barDimensionA, randomNumberTwo,
                    randomNumberThree, randomNumberFour, randomNumberFive, 0, 0, 0,
                    0, false, 0, 0);
            list.add(row);
            assemblies++;
        }
        return list;
    }


}
