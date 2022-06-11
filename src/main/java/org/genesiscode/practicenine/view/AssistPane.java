package org.genesiscode.practicenine.view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AssistPane {

    public static void show(TableView<?> result) {
        Stage stage = new Stage(StageStyle.DECORATED);
        VBox pane = new VBox(10, result);
        pane.setPadding(new Insets(10));
        pane.setFillWidth(false);
        stage.setScene(new Scene(pane));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Resultados");
        stage.showAndWait();
    }
}
