package org.genesiscode.practicenine.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainWindow extends Application {

    @Override
    public void start(Stage stage) {
        MenuBarPane menu = MenuBarPane.getInstance();
        Scene scene = new Scene(menu.getMainPane());
        stage.setTitle("Practica 9");
        stage.setScene(scene);
        stage.show();
    }
}
