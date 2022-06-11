package org.genesiscode.practicenine.view.row;

public class RowResultTwo {

    private int assemblies;
    private double randomNumberOne;
    private double barDimensionA;
    private double randomNumberTwo;
    private double randomNumberThree;
    private double randomNumberFour;
    private double randomNumberFive;
    private double barDimensionB;
    private double totalLength;
    private int lowerSpecification;
    private int topSpecification;
    private boolean defective;
    private int accumulatedDefectiveParts;
    private double percentageOfDefectiveParts;

    public RowResultTwo(int assemblies, double randomNumberOne, double barDimensionA, double randomNumberTwo,
                        double randomNumberThree, double randomNumberFour, double randomNumberFive,
                        double barDimensionB, double totalLength, int lowerSpecification, int topSpecification,
                        boolean defective, int accumulatedDefectiveParts, double percentageOfDefectiveParts) {
        this.assemblies = assemblies;
        this.randomNumberOne = randomNumberOne;
        this.barDimensionA = barDimensionA;
        this.randomNumberTwo = randomNumberTwo;
        this.randomNumberThree = randomNumberThree;
        this.randomNumberFour = randomNumberFour;
        this.randomNumberFive = randomNumberFive;
        this.barDimensionB = barDimensionB;
        this.totalLength = totalLength;
        this.lowerSpecification = lowerSpecification;
        this.topSpecification = topSpecification;
        this.defective = defective;
        this.accumulatedDefectiveParts = accumulatedDefectiveParts;
        this.percentageOfDefectiveParts = percentageOfDefectiveParts;
    }

    public int getAssemblies() {
        return assemblies;
    }

    public void setAssemblies(int assemblies) {
        this.assemblies = assemblies;
    }

    public double getRandomNumberOne() {
        return randomNumberOne;
    }

    public void setRandomNumberOne(double randomNumberOne) {
        this.randomNumberOne = randomNumberOne;
    }

    public double getBarDimensionA() {
        return barDimensionA;
    }

    public void setBarDimensionA(double barDimensionA) {
        this.barDimensionA = barDimensionA;
    }

    public double getRandomNumberTwo() {
        return randomNumberTwo;
    }

    public void setRandomNumberTwo(double randomNumberTwo) {
        this.randomNumberTwo = randomNumberTwo;
    }

    public double getRandomNumberThree() {
        return randomNumberThree;
    }

    public void setRandomNumberThree(double randomNumberThree) {
        this.randomNumberThree = randomNumberThree;
    }

    public double getRandomNumberFour() {
        return randomNumberFour;
    }

    public void setRandomNumberFour(double randomNumberFour) {
        this.randomNumberFour = randomNumberFour;
    }

    public double getRandomNumberFive() {
        return randomNumberFive;
    }

    public void setRandomNumberFive(double randomNumberFive) {
        this.randomNumberFive = randomNumberFive;
    }

    public double getBarDimensionB() {
        return barDimensionB;
    }

    public void setBarDimensionB(double barDimensionB) {
        this.barDimensionB = barDimensionB;
    }

    public double getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(double totalLength) {
        this.totalLength = totalLength;
    }

    public int getLowerSpecification() {
        return lowerSpecification;
    }

    public void setLowerSpecification(int lowerSpecification) {
        this.lowerSpecification = lowerSpecification;
    }

    public int getTopSpecification() {
        return topSpecification;
    }

    public void setTopSpecification(int topSpecification) {
        this.topSpecification = topSpecification;
    }

    public boolean isDefective() {
        return defective;
    }

    public void setDefective(boolean defective) {
        this.defective = defective;
    }

    public int getAccumulatedDefectiveParts() {
        return accumulatedDefectiveParts;
    }

    public void setAccumulatedDefectiveParts(int accumulatedDefectiveParts) {
        this.accumulatedDefectiveParts = accumulatedDefectiveParts;
    }

    public double getPercentageOfDefectiveParts() {
        return percentageOfDefectiveParts;
    }

    public void setPercentageOfDefectiveParts(double percentageOfDefectiveParts) {
        this.percentageOfDefectiveParts = percentageOfDefectiveParts;
    }
}
