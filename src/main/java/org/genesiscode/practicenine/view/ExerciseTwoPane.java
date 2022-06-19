package org.genesiscode.practicenine.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.genesiscode.practicenine.service.ExerciseTwo;
import org.genesiscode.practicenine.service.Util;
import org.genesiscode.practicenine.view.row.RowResultTwo;

import java.util.List;

public class ExerciseTwoPane extends MyPane {

    private static ExerciseTwoPane exerciseTwoPane;
    private ExerciseTwo exerciseTwo;
    private TableView<RowResultTwo> resultTable;
    private TextField fieldUniformMin, fieldUniformMax, fieldFormParameter, fieldExpectedValue;

    private ExerciseTwoPane() {
        super("EJERCICIO 2");
        exerciseTwo = ExerciseTwo.getInstance();
        loadControls();
        buildPane();
    }

    public synchronized static ExerciseTwoPane getInstance() {
        return exerciseTwoPane == null ? new ExerciseTwoPane() : exerciseTwoPane;
    }

    @Override
    protected void click_btn_start() {
        try {
            int uniformMin = Integer.parseInt(fieldUniformMin.getText());
            int uniformMax = Integer.parseInt(fieldUniformMax.getText());
            int formParameter = Integer.parseInt(fieldFormParameter.getText());
            int expectedValue = Integer.parseInt(fieldExpectedValue.getText());
            exerciseTwo.setRandomNumbers(Util.convertToList(areaRandomNumbers.getText()));
            resultTable.setItems(exerciseTwo.getResultList(uniformMin, uniformMax, formParameter, expectedValue));
            AssistPane.show(resultTable);
        } catch (Exception e) {
            String message = """
                    Los datos de entrada
                    no cumplenel formato
                        implementado
                    """;
            MessageBox.show(message);
        }
    }

    private void loadControls() {
        buildDataToInputPane();
        buildResultTablePane();
    }

    private void buildDataToInputPane() {
        int columnCount = 5;
        fieldUniformMin = new TextField();
        fieldUniformMin.setPrefColumnCount(columnCount);
        fieldUniformMax = new TextField();
        fieldUniformMax.setPrefColumnCount(columnCount);
        fieldFormParameter = new TextField();
        fieldFormParameter.setPrefColumnCount(columnCount);
        fieldExpectedValue = new TextField();
        fieldExpectedValue.setPrefColumnCount(columnCount);
    }

    private void buildResultTablePane() {
        resultTable = new TableView<>();
        int rnSize = 65;
        resultTable.getColumns().addAll(List.of(
                        column("Ensamble", "assemblies", 80),
                        column("Rn", "randomNumberOne", rnSize),
                        column("Dimensiones\nde barra A", "barDimensionA", 100),
                        column("Rn", "randomNumberTwo", rnSize),
                        column("Rn", "randomNumberThree", rnSize),
                        column("Rn", "randomNumberFour", rnSize),
                        column("Rn", "randomNumberFive", rnSize),
                        column("Dimensiones\nde barra B", "barDimensionB", 100),
                        column("Longitud\nbarra total", "totalLength", 100),
                        column("Especificacion\ninferior", "lowerSpecification", 120),
                        column("Especificacion\nsuperior", "topSpecification", 120),
                        column("Defectuosa?", "defective", 100),
                        column("Piezas\nDefectuosas\nacumuladas", "accumulatedDefectiveParts", 100),
                        column("% de piezas\ndefectuosas", "percentageOfDefectiveParts", 100)));
    }

    private void buildPane() {
        VBox leftPane = new VBox(10, inputPane, btnStart);
        HBox pane = new HBox(20, leftPane, buildInputPane());
        pane.setAlignment(Pos.CENTER);
        mainPane = new VBox(20, title, pane);
        mainPane.setPadding(new Insets(10));
        mainPane.setAlignment(Pos.CENTER);
    }

    private VBox buildInputPane() {
        HBox paneOne = new HBox(10, new Label("Uniforme - Minimo"), fieldUniformMin);
        paneOne.setAlignment(Pos.CENTER_RIGHT);
        HBox paneTwo = new HBox(10, new Label("Uniforme - Maximo"), fieldUniformMax);
        paneTwo.setAlignment(Pos.CENTER_RIGHT);
        HBox paneThree = new HBox(10, new Label("Parametros de forma"), fieldFormParameter);
        paneThree.setAlignment(Pos.CENTER_RIGHT);
        HBox paneFour = new HBox(10, new Label("Valor Esperado"), fieldExpectedValue);
        paneFour.setAlignment(Pos.CENTER_RIGHT);
        return new VBox(10, paneOne, paneTwo, paneThree, paneFour);
    }
}
