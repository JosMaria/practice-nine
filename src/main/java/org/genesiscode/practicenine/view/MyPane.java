package org.genesiscode.practicenine.view;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

public class MyPane {

    protected <U, T> TableColumn<U, T> column(String titleColumn, String property, double prefSize) {
        TableColumn<U, T> column = new TableColumn<>(titleColumn);
        column.setCellValueFactory(new PropertyValueFactory<>(property));
        column.setPrefWidth(prefSize);
        return column;
    }
}
