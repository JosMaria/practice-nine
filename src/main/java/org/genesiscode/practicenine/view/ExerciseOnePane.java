package org.genesiscode.practicenine.view;

import javafx.geometry.Insets;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import org.genesiscode.practicenine.service.ExerciseOne;
import org.genesiscode.practicenine.view.row.RowResult;

import java.util.List;

public class ExerciseOnePane extends MyPane {

    private static ExerciseOnePane exerciseOnePane;
    private ExerciseOne exerciseOne;
    private TableView<RowResult> resultTable;

    private ExerciseOnePane() {
        super("EJERCICIO 1");
        exerciseOne = ExerciseOne.getInstance();
        loadControls();
        buildPane();
    }

    public synchronized static ExerciseOnePane getInstance() {
        return exerciseOnePane != null ? exerciseOnePane : new ExerciseOnePane();
    }

    private void loadControls() {
        buildResultTablePane();
    }

    private void buildResultTablePane() {
        resultTable = new TableView<>();
        resultTable.getColumns().addAll(List.of(
                column("Pieza", "piece", 70),
                column("Rn", "randomNumberOne", 60),
                column("Tiempo entre\nllegadas", "timeBetweenArrivals", 120),
                column("Minuto de\nllegada", "pieceArrivalMinute", 100),
                column("Minuto inicio\ninspeccion", "inspectionStartMinute", 100),
                column("Rn", "randomNumberTwo", 60),
                column("Tiempo de\nInspeccion", "inspectionTime", 100),
                column("Finalizacion\ninspeccion", "inspectionEndMinute", 100),
                column("Tiempo total\ninspeccion", "totalInspectionTime", 100),
                column("Tiempo\nespera", "standby", 90)));
    }

    private void buildPane() {
        mainPane = new VBox(10, title, resultTable);
        mainPane.setPadding(new Insets(10));
    }
}
