package org.genesiscode.practicenine.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class MyPane {

    protected VBox mainPane;
    protected Label title;
    protected TextArea areaRandomNumbers;
    protected VBox inputPane;
    protected Button btnStart;

    protected MyPane(String titleHeader) {
        title = new Label(titleHeader);
        title.setFont(new Font("Gargi", 20));

        areaRandomNumbers = new TextArea();
        areaRandomNumbers.setWrapText(true);
        areaRandomNumbers.setMaxSize(300, 150);
        btnStart = new Button("Comenzar");
        btnStart.setOnAction(actionEvent -> click_btn_start());
        inputPane = new VBox(10, new Label("Numeros Aletorios"), areaRandomNumbers, btnStart);
    }

    protected void click_btn_start() {}

    protected <U, T> TableColumn<U, T> column(String titleColumn, String property, double prefSize) {
        TableColumn<U, T> column = new TableColumn<>(titleColumn);
        column.setCellValueFactory(new PropertyValueFactory<>(property));
        column.setPrefWidth(prefSize);
        return column;
    }

    protected VBox getMainPane() {
        return mainPane;
    }
}
