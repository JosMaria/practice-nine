package org.genesiscode.practicenine.view.row;

public class RowResultOne {

    private int piece;
    private double randomNumberOne;
    private double timeBetweenArrivals;
    private double pieceArrivalMinute;
    private double inspectionStartMinute;
    private double randomNumberTwo;
    private double inspectionTime;
    private double inspectionEndMinute;
    private double totalInspectionTime;
    private double standby;

    public RowResultOne(int piece, double randomNumberOne, double timeBetweenArrivals, double pieceArrivalMinute,
                        double inspectionStartMinute, double randomNumberTwo, double inspectionTime,
                        double inspectionEndMinute, double totalInspectionTime, double standby) {
        this.piece = piece;
        this.randomNumberOne = randomNumberOne;
        this.timeBetweenArrivals = timeBetweenArrivals;
        this.pieceArrivalMinute = pieceArrivalMinute;
        this.inspectionStartMinute = inspectionStartMinute;
        this.randomNumberTwo = randomNumberTwo;
        this.inspectionTime = inspectionTime;
        this.inspectionEndMinute = inspectionEndMinute;
        this.totalInspectionTime = totalInspectionTime;
        this.standby = standby;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public double getRandomNumberOne() {
        return randomNumberOne;
    }

    public void setRandomNumberOne(double randomNumberOne) {
        this.randomNumberOne = randomNumberOne;
    }

    public double getTimeBetweenArrivals() {
        return timeBetweenArrivals;
    }

    public void setTimeBetweenArrivals(double timeBetweenArrivals) {
        this.timeBetweenArrivals = timeBetweenArrivals;
    }

    public double getPieceArrivalMinute() {
        return pieceArrivalMinute;
    }

    public void setPieceArrivalMinute(double pieceArrivalMinute) {
        this.pieceArrivalMinute = pieceArrivalMinute;
    }

    public double getInspectionStartMinute() {
        return inspectionStartMinute;
    }

    public void setInspectionStartMinute(double inspectionStartMinute) {
        this.inspectionStartMinute = inspectionStartMinute;
    }

    public double getRandomNumberTwo() {
        return randomNumberTwo;
    }

    public void setRandomNumberTwo(double randomNumberTwo) {
        this.randomNumberTwo = randomNumberTwo;
    }

    public double getInspectionTime() {
        return inspectionTime;
    }

    public void setInspectionTime(double inspectionTime) {
        this.inspectionTime = inspectionTime;
    }

    public double getInspectionEndMinute() {
        return inspectionEndMinute;
    }

    public void setInspectionEndMinute(double inspectionEndMinute) {
        this.inspectionEndMinute = inspectionEndMinute;
    }

    public double getTotalInspectionTime() {
        return totalInspectionTime;
    }

    public void setTotalInspectionTime(double totalInspectionTime) {
        this.totalInspectionTime = totalInspectionTime;
    }

    public double getStandby() {
        return standby;
    }

    public void setStandby(double standby) {
        this.standby = standby;
    }
}
