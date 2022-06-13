package org.genesiscode.practicenine.service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.genesiscode.practicenine.view.row.RowResultOne;

import java.util.Iterator;
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
        /*double randomNumber = 0.7831;
        double deviation = 0.5;
        double media = 4;

        double sqrt = Math.sqrt(-2 * Math.log(1 - randomNumber));
        System.out.println(sqrt);

        double result = 2 * Math.PI * randomNumber;
        System.out.println("resultado: " + result);
        double cos = 0;
        System.out.println("cos: " + cos);
        System.out.println(((cos * sqrt) * deviation) + media);

        System.out.println(
                ((Math.sin(2 * Math.PI * randomNumber) * sqrt) * deviation) + media);*/
        double randomNumber = 0.2883;
        double deviation = 0.5;
        double media = 4;
        //System.out.println(calculate(randomNumber, deviation, media));
    }


    //0.7831 --> 4.18049474891427
    //0.7831 --> 3.144674871064208

    //3,606802485687306 cos
    //3.3795585234058314 sin

    public ObservableList<RowResultOne> getResultList() {
        ObservableList<RowResultOne> list = FXCollections.observableArrayList();
        Iterator<Double> iterator = randomNumbers.iterator();
        int piece = 1;
        double pieceArrivalMinute = 0, inspectionTime;
        double deviation = 0.5, mediaNormal = 4, mediaExponential = 5;

        double randomNumberOne, randomNumberTwo, timeBetweenArrivals, inspectionEndMinute = 0, inspectionStartMinute, totalInspectionTime, standby;
        while (iterator.hasNext()) {
            randomNumberOne = iterator.next();
            timeBetweenArrivals = Decimal.getDecimal(4, Math.log(1-randomNumberOne)*-mediaExponential);
            pieceArrivalMinute += timeBetweenArrivals;
            pieceArrivalMinute = Decimal.getDecimal(4, pieceArrivalMinute);
            inspectionStartMinute = Math.max(pieceArrivalMinute, inspectionEndMinute);
            randomNumberTwo = iterator.hasNext() ? iterator.next() : 0;
            inspectionTime = calculate(randomNumberTwo, deviation, mediaNormal);
            inspectionEndMinute = Decimal.getDecimal(4, inspectionStartMinute + inspectionTime);
            totalInspectionTime = Decimal.getDecimal(4, inspectionEndMinute - pieceArrivalMinute);
            standby = Decimal.getDecimal(4, totalInspectionTime - inspectionTime);
            RowResultOne row = new RowResultOne(piece, randomNumberOne, timeBetweenArrivals,
                    pieceArrivalMinute, inspectionStartMinute, randomNumberTwo, inspectionTime,
                    inspectionEndMinute, totalInspectionTime, standby);
            list.add(row);
            piece++;
        }

        return list;
    }

    private double calculate(double randomNumber, double deviation, double mediaNormal) {
        double var1 = 2 * Math.PI * randomNumber;
        double var2 = Math.sqrt(-2 * Math.log(1 - randomNumber));
        double cosResponse = ((Math.cos(var1) * var2) * deviation) + mediaNormal;
        double sinResponse = ((Math.sin(var1) * var2) * deviation) + mediaNormal;
        return Decimal.getDecimal(4, Math.max(cosResponse, sinResponse));
    }
}
