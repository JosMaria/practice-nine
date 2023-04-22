package org.genesiscode.practicenine.service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.genesiscode.practicenine.view.row.RowResultThree;

import java.util.Iterator;
import java.util.List;

public class ExerciseThree {

    private static ExerciseThree exerciseThree;
    private List<Double> randomNumbers;

    private ExerciseThree() {}

    public synchronized static ExerciseThree getInstance() {
        return exerciseThree == null ? new ExerciseThree() : exerciseThree;
    }

    public void setRandomNumbers(List<Double> randomNumbers) {
        this.randomNumbers = randomNumbers;
    }

    public ObservableList<RowResultThree> getResultList(int exponentialMedia, int warehouseCapacity,
                                                        int costOfOrdering, int shortageCost, int maintenanceCost) {
        ObservableList<RowResultThree> list = FXCollections.observableArrayList();
        Iterator<Double> iterator = randomNumbers.iterator();

        int day = 1, demand, initialInventory = 0, totalInventory, sale,
                finalInventory, lostSales, deliveriesSupplier,orderCost, missingCost,
                colMaintenanceCost, totalCost;
        double randomNumber;

        while (iterator.hasNext()) {
            randomNumber = iterator.next();
            demand = calculate(randomNumber, exponentialMedia);

            if (initialInventory == 0) {
                deliveriesSupplier = warehouseCapacity;
                totalInventory = deliveriesSupplier;
                orderCost = costOfOrdering;
            } else if (!iterator.hasNext()) {
                deliveriesSupplier = warehouseCapacity - initialInventory;
                totalInventory = deliveriesSupplier + initialInventory;
                orderCost = costOfOrdering;
            } else {
                deliveriesSupplier = 0;
                totalInventory = initialInventory;
                orderCost = 0;
            }

            sale = Math.min(totalInventory, demand);
            finalInventory = totalInventory - sale;
            finalInventory = Math.max(finalInventory, 0);
            lostSales = demand - sale;
            missingCost = lostSales > 0 ? lostSales * shortageCost : 0;
            colMaintenanceCost = finalInventory * maintenanceCost;
            totalCost = orderCost - missingCost + colMaintenanceCost;
            RowResultThree row = new RowResultThree(day, initialInventory, deliveriesSupplier,
                    totalInventory, randomNumber, demand, sale, finalInventory, lostSales,
                    getCost(orderCost), getCost(missingCost), getCost(colMaintenanceCost),
                    getCost(Math.abs(totalCost)));
            list.add(row);
            initialInventory = finalInventory;
            day++;
        }
        return list;
    }

    private String getCost(int cost) {
        return cost == 0 ? "$\t-" : String.format("$   %s", cost);
    }

    private int calculate(double randomNumber, double exponentialMedia) {
        return (int) Decimal.getDecimal(0, Math.log(1 - randomNumber) * -exponentialMedia);
    }
}
