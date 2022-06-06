package org.genesiscode.practicenine.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainWindow extends Application {

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Label("Practica 9"));
        stage.setTitle("Practica 9");
        stage.setScene(scene);
        stage.show();
    }
}
