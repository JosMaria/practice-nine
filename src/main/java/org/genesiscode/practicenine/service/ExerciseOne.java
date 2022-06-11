package org.genesiscode.practicenine.service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.genesiscode.practicenine.view.row.RowResultOne;

import java.util.List;

public class ExerciseOne {

    private static ExerciseOne exerciseOne;
    private List<Double> randomNumbers;

    private ExerciseOne() {}

    public synchronized static ExerciseOne getInstance() {
        return exerciseOne == null ? new ExerciseOne() : exerciseOne;
    }

    private ObservableList<RowResultOne> buildResultTable() {
        ObservableList<RowResultOne> list = FXCollections.observableArrayList();
        double randomNumberOne = 0.2962;
        list.add(new RowResultOne(1, randomNumberOne, 0, 0, 0, 0, 0, 0, 0, 0));
        return null;
    }

    public List<Double> getRandomNumbers() {
        return randomNumbers;
    }

    public void setRandomNumbers(List<Double> randomNumbers) {
        this.randomNumbers = randomNumbers;
    }

    public static void main(String[] args) {
        System.out.println(-5*(Math.log(1 - 0.2962)));
    }
}
