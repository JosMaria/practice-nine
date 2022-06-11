package org.genesiscode.practicenine.view;

import javafx.scene.layout.VBox;
import org.genesiscode.practicenine.service.ExerciseTwo;

public class ExerciseTwoPane extends MyPane {

    private static ExerciseTwoPane exerciseTwoPane;
    private ExerciseTwo exerciseTwo;

    private ExerciseTwoPane() {
        super("EJERCICIO 2");
        exerciseTwo = ExerciseTwo.getInstance();
        loadControls();
        buildPane();
    }

    public synchronized static ExerciseTwoPane getInstance() {
        return exerciseTwoPane == null ? new ExerciseTwoPane() : exerciseTwoPane;
    }

    private void loadControls() {}

    private void buildPane() {
        mainPane = new VBox(10, title);
    }
}
