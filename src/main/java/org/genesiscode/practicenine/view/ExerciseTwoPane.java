package org.genesiscode.practicenine.view;

import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import org.genesiscode.practicenine.service.ExerciseTwo;
import org.genesiscode.practicenine.view.row.RowResultTwo;

import java.util.List;

public class ExerciseTwoPane extends MyPane {

    private static ExerciseTwoPane exerciseTwoPane;
    private ExerciseTwo exerciseTwo;
    private TableView<RowResultTwo> resultTable;

    private ExerciseTwoPane() {
        super("EJERCICIO 2");
        exerciseTwo = ExerciseTwo.getInstance();
        loadControls();
        buildPane();
    }

    public synchronized static ExerciseTwoPane getInstance() {
        return exerciseTwoPane == null ? new ExerciseTwoPane() : exerciseTwoPane;
    }

    private void loadControls() {
        buildResultTablePane();
    }

    @Override
    protected void click_btn_start() {
        AssistPane.show(resultTable);
    }

    private void buildResultTablePane() {
        resultTable = new TableView<>();
        resultTable.getColumns().addAll(List.of(
                        column("Ensamble", "assemblies", 80),
                        column("Rn", "randomNumberOne", 50),
                        column("Dimensiones\nde barra A", "barDimensionA", 100),
                        column("Rn", "randomNumberTwo", 50),
                        column("Rn", "randomNumberThree", 50),
                        column("Rn", "randomNumberFour", 50),
                        column("Rn", "randomNumberFive", 50),
                        column("Dimensiones\nde barra B", "barDimensionB", 100),
                        column("Longitud\nbarra total", "totalLength", 100),
                        column("Especificacion\ninferior", "lowerSpecification", 120),
                        column("Especificacion\nsuperior", "topSpecification", 120),
                        column("Defectuosa?", "defective", 100),
                        column("Piezas\nDefectuosas\nacumuladas", "accumulatedDefectiveParts", 100),
                        column("% de piezas\ndefectuosas", "percentageOfDefectiveParts", 100)));
    }

    private void buildPane() {
        mainPane = new VBox(10, title, btnStart);
    }
}
