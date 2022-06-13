package org.genesiscode.practicenine.service;

public class ExerciseThree {

    private static ExerciseThree exerciseThree;

    private ExerciseThree() {}

    public synchronized static ExerciseThree getInstance() {
        return exerciseThree == null ? new ExerciseThree() : exerciseThree;
    }
}
