package org.genesiscode.practicenine.service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.genesiscode.practicenine.view.row.RowResult;

public class ExerciseOne {

    private ObservableList<RowResult> buildResultTable() {
        ObservableList<RowResult> list = FXCollections.observableArrayList();
        double randomNumberOne = 0.2962;
        list.add(new RowResult(1, randomNumberOne, 0, 0, 0, 0, 0, 0, 0, 0));
        return null;
    }

    public static void main(String[] args) {
        System.out.println(-5*(Math.log(1 - 0.2962)));
    }
}
