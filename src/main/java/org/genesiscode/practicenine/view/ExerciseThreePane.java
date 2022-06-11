package org.genesiscode.practicenine.view;

import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import org.genesiscode.practicenine.service.ExerciseThree;
import org.genesiscode.practicenine.view.row.RowResultThree;

import java.util.List;

public class ExerciseThreePane extends MyPane {

    private static ExerciseThreePane exerciseThreePane;
    private final ExerciseThree exerciseThree;
    private TableView<RowResultThree> resultTable;

    private ExerciseThreePane() {
        super("EJERCICIO 3");
        exerciseThree = ExerciseThree.getInstance();
        loadControls();
        buildPane();
    }

    @Override
    protected void click_btn_start() {
        AssistPane.show(resultTable);
    }

    public synchronized static ExerciseThreePane getInstance() {
        return exerciseThreePane == null ? new ExerciseThreePane() : exerciseThreePane;
    }

    private void loadControls() {
        buildResultTablePane();
    }

    private void buildResultTablePane() {
        resultTable = new TableView<>();
        resultTable.getColumns().addAll(List.of(
                        column("Dia", "day", 50),
                        column("Inventario\nInicial", "initialInventory", 90),
                        column("Entragas\nProveedor", "deliveriesSupplier", 100),
                        column("Inventario\nTotal", "totalInventory", 100),
                        column("Rn", "randomNumber", 50),
                        column("Demanda", "demand", 80),
                        column("Venta", "sale", 70),
                        column("Inventario\nFinal", "finalInventory", 90),
                        column("Ventas\nPerdidas", "lostSales", 90),
                        column("Costo de\nordenar", "orderCost", 90),
                        column("Costo de\nfaltantes", "missingCost", 90),
                        column("Costo de\nmantenimiento", "maintenanceCost", 120),
                        column("Costo\nTotal", "totalCost", 70)));
    }

    private void buildPane() {
        mainPane = new VBox(10, title, btnStart);
    }
}
