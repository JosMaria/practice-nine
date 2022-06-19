package org.genesiscode.practicenine.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.genesiscode.practicenine.service.ExerciseThree;
import org.genesiscode.practicenine.service.Util;
import org.genesiscode.practicenine.view.row.RowResultThree;

import java.util.List;

public class ExerciseThreePane extends MyPane {

    private static ExerciseThreePane exerciseThreePane;
    private final ExerciseThree exerciseThree;
    private TableView<RowResultThree> resultTable;
    private TextField fieldExponentialMedia, fieldWarehouseCapacity,
            fieldCostOfOrdering, fieldShortageCost, fieldMaintenanceCost;

    private ExerciseThreePane() {
        super("EJERCICIO 3");
        exerciseThree = ExerciseThree.getInstance();
        loadControls();
        buildPane();
    }

    @Override
    protected void click_btn_start() {
        try {
            int exponentialMedia = Integer.parseInt(fieldExponentialMedia.getText());
            int warehouseCapacity = Integer.parseInt(fieldWarehouseCapacity.getText());
            int costOfOrdering = Integer.parseInt(fieldCostOfOrdering.getText());
            int shortageCost = Integer.parseInt(fieldShortageCost.getText());
            int maintenanceCost = Integer.parseInt(fieldShortageCost.getText());

            exerciseThree.setRandomNumbers(Util.convertToList(areaRandomNumbers.getText()));
            resultTable.setItems(exerciseThree.getResultList
                    (exponentialMedia, warehouseCapacity, costOfOrdering, shortageCost, maintenanceCost));
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

    public synchronized static ExerciseThreePane getInstance() {
        return exerciseThreePane == null ? new ExerciseThreePane() : exerciseThreePane;
    }

    private void loadControls() {
        int columnCount = 5;
        fieldExponentialMedia = new TextField();
        fieldExponentialMedia.setPrefColumnCount(columnCount);
        fieldWarehouseCapacity = new TextField();
        fieldWarehouseCapacity.setPrefColumnCount(columnCount);
        fieldCostOfOrdering = new TextField();
        fieldCostOfOrdering.setPrefColumnCount(columnCount);
        fieldShortageCost = new TextField();
        fieldShortageCost.setPrefColumnCount(columnCount);
        fieldMaintenanceCost = new TextField();
        fieldMaintenanceCost.setPrefColumnCount(columnCount);
        buildResultTablePane();
    }

    private void buildResultTablePane() {
        resultTable = new TableView<>();
        resultTable.getColumns().addAll(List.of(
                        column("Dia", "day", 50),
                        column("Inventario\nInicial", "initialInventory", 90),
                        column("Entragas\nProveedor", "deliveriesSupplier", 100),
                        column("Inventario\nTotal", "totalInventory", 100),
                        column("Rn", "randomNumber", 70),
                        column("Demanda", "demand", 80),
                        column("Venta", "sale", 70),
                        column("Inventario\nFinal", "finalInventory", 90),
                        column("Ventas\nPerdidas", "lostSales", 90),
                        column("Costo de\nordenar", "orderCost", 90),
                        column("Costo de\nfaltantes", "missingCost", 90),
                        column("Costo de\nmantenimiento", "maintenanceCost", 100),
                        column("Costo\nTotal", "totalCost", 90)));
    }

    private VBox buildInputPane() {
        HBox paneOne = new HBox(10, new Label("Exponecial Media"), fieldExponentialMedia);
        paneOne.setAlignment(Pos.CENTER_RIGHT);
        HBox paneTwo = new HBox(10, new Label("Capacidad de Bodega"), fieldWarehouseCapacity);
        paneTwo.setAlignment(Pos.CENTER_RIGHT);
        HBox paneThree = new HBox(10, new Label("Costo de ordenar"), fieldCostOfOrdering);
        paneThree.setAlignment(Pos.CENTER_RIGHT);
        HBox paneFour = new HBox(10, new Label("Costo de faltante"), fieldShortageCost);
        paneFour.setAlignment(Pos.CENTER_RIGHT);
        HBox paneFive = new HBox(10, new Label("Costo de mantenimiento"), fieldMaintenanceCost);
        paneFive.setAlignment(Pos.CENTER_RIGHT);
        return new VBox(10, paneOne, paneTwo, paneThree, paneFour, paneFive);
    }

    private void buildPane() {
        VBox rightPane = new VBox(10, inputPane, btnStart);
        mainPane = new VBox(10, title, new HBox(30, rightPane, buildInputPane()));
        mainPane.setPadding(new Insets(10));
        mainPane.setAlignment(Pos.CENTER);
    }
}
