package org.genesiscode.practicenine.view;

import javafx.scene.layout.VBox;
import org.genesiscode.practicenine.service.ExerciseThree;

public class ExerciseThreePane extends MyPane {

    private static ExerciseThreePane exerciseThreePane;
    private final ExerciseThree exerciseThree;

    private ExerciseThreePane() {
        super("EJERCICIO 3");
        exerciseThree = ExerciseThree.getInstance();
        loadControls();
        buildPane();
    }

    public synchronized static ExerciseThreePane getInstance() {
        return exerciseThreePane == null ? new ExerciseThreePane() : exerciseThreePane;
    }

    private void loadControls() {}

    private void buildPane() {
        mainPane = new VBox(10, title);
    }
}
