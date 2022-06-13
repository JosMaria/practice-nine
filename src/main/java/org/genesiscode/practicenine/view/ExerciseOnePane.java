package org.genesiscode.practicenine.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.genesiscode.practicenine.service.ExerciseOne;
import org.genesiscode.practicenine.service.Util;
import org.genesiscode.practicenine.view.row.RowResultOne;

import java.util.List;

public class ExerciseOnePane extends MyPane {

    private static ExerciseOnePane exerciseOnePane;
    private ExerciseOne exerciseOne;
    private TableView<RowResultOne> resultTable;
    private TextField fieldMediaExponential, fieldMediaNormal, fieldDeviationNormal;

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

    private VBox inputDataPane() {
        fieldMediaExponential = new TextField();
        fieldMediaExponential.setPrefColumnCount(4);
        fieldMediaNormal = new TextField();
        fieldMediaNormal.setPrefColumnCount(4);
        fieldDeviationNormal = new TextField();
        fieldDeviationNormal.setPrefColumnCount(4);

        HBox paneOne = new HBox(10, new Label("DISTRIBUCION EXPONENCIAL - Media"), fieldMediaExponential);
        paneOne.setAlignment(Pos.CENTER_RIGHT);
        HBox paneTwo = new HBox(10, new Label("DISTRIBUCION NORMAL - Media"), fieldMediaNormal);
        paneTwo.setAlignment(Pos.CENTER_RIGHT);
        HBox paneThree = new HBox(10, new Label("DISTRIBUCION NORMAL - Desviación"), fieldDeviationNormal);
        paneThree.setAlignment(Pos.CENTER_RIGHT);
        VBox pane = new VBox(10, paneOne, paneTwo, paneThree);
        pane.setPadding(new Insets(40, 0, 0, 0));
        return pane;
    }

    @Override
    protected void click_btn_start() {
        exerciseOne.setRandomNumbers(Util.convertToList(areaRandomNumbers.getText()));
        resultTable.setItems(exerciseOne.getResultList());
        AssistPane.show(resultTable);
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
        HBox pane = new HBox(10, inputPane, inputDataPane());
        pane.setAlignment(Pos.TOP_CENTER);
        mainPane = new VBox(20, title, pane);
        mainPane.setPadding(new Insets(10));
        mainPane.setAlignment(Pos.CENTER);
    }
}
