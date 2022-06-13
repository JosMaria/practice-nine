package org.genesiscode.practicenine.service;

public class ExerciseTwo {

    private static ExerciseTwo exerciseTwo;

    private ExerciseTwo() {}

    public synchronized static ExerciseTwo getInstance() {
        return exerciseTwo == null ? new ExerciseTwo() : exerciseTwo;
    }
}
