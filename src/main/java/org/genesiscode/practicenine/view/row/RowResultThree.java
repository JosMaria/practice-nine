package org.genesiscode.practicenine.view.row;

public class RowResultThree {

    private int day;
    private int initialInventory;
    private int deliveriesSupplier;
    private int totalInventory;
    private double randomNumber;
    private int demand;
    private int sale;
    private int finalInventory;
    private int lostSales;
    private double orderCost;
    private double missingCost;
    private double maintenanceCost;
    private double totalCost;

    public RowResultThree(int day, int initialInventory, int deliveriesSupplier, int totalInventory,
                          double randomNumber, int demand, int sale, int finalInventory, int lostSales,
                          double orderCost, double missingCost, double maintenanceCost, double totalCost) {
        this.day = day;
        this.initialInventory = initialInventory;
        this.deliveriesSupplier = deliveriesSupplier;
        this.totalInventory = totalInventory;
        this.randomNumber = randomNumber;
        this.demand = demand;
        this.sale = sale;
        this.finalInventory = finalInventory;
        this.lostSales = lostSales;
        this.orderCost = orderCost;
        this.missingCost = missingCost;
        this.maintenanceCost = maintenanceCost;
        this.totalCost = totalCost;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getInitialInventory() {
        return initialInventory;
    }

    public void setInitialInventory(int initialInventory) {
        this.initialInventory = initialInventory;
    }

    public int getDeliveriesSupplier() {
        return deliveriesSupplier;
    }

    public void setDeliveriesSupplier(int deliveriesSupplier) {
        this.deliveriesSupplier = deliveriesSupplier;
    }

    public int getTotalInventory() {
        return totalInventory;
    }

    public void setTotalInventory(int totalInventory) {
        this.totalInventory = totalInventory;
    }

    public double getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(double randomNumber) {
        this.randomNumber = randomNumber;
    }

    public int getDemand() {
        return demand;
    }

    public void setDemand(int demand) {
        this.demand = demand;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getFinalInventory() {
        return finalInventory;
    }

    public void setFinalInventory(int finalInventory) {
        this.finalInventory = finalInventory;
    }

    public int getLostSales() {
        return lostSales;
    }

    public void setLostSales(int lostSales) {
        this.lostSales = lostSales;
    }

    public double getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(double orderCost) {
        this.orderCost = orderCost;
    }

    public double getMissingCost() {
        return missingCost;
    }

    public void setMissingCost(double missingCost) {
        this.missingCost = missingCost;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
