package org.genesiscode.practicenine.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MessageBox {

    public static void show(String message) {
        Stage stage = new Stage();
        VBox pane = new VBox(new Label(message));
        pane.setPadding(new Insets(10));
        pane.setAlignment(Pos.CENTER);
        stage.setScene(new Scene(pane, 300, 100));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Datos de entrada");
        stage.showAndWait();
    }
}
