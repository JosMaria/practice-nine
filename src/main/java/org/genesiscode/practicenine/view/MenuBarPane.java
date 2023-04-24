package org.genesiscode.practicenine.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class MenuBarPane implements EventHandler<ActionEvent> {

    private static MenuBarPane menuBarPane;
    private final VBox mainPane;
    private static final String EXERCISE_ONE = "Ejercicio 1";
    private static final String EXERCISE_TWO = "Ejercicio 2";
    private static final String EXERCISE_THREE = "Ejercicio 3";


    private static final String NAME = "henrry (copito) rodrigo llanos camacho";
    private static final String TITLE = "Taller de simluacion";
    private static final String NUMBER_OF_PROJECT = "Proyecto 3";

    private MenuBarPane() {
        Label title = new Label("Practica 9");
        title.setFont(new Font("Gargi", 50));
        VBox informationPane = new VBox(10,
                new Label(String.format("Nombre: %s", NAME)),
                new Label(String.format("Materia: %s", TITLE)),
                new Label(String.format("Numero de proyecto: %s", NUMBER_OF_PROJECT)));
        informationPane.setAlignment(Pos.CENTER);

        VBox paneDefault = new VBox(30, title, informationPane);

        paneDefault.setAlignment(Pos.CENTER);
        paneDefault.setPadding(new Insets(20));
        mainPane = new VBox(10, getMenuBar(), paneDefault);
        mainPane.setPrefSize(800, 350);
    }

    public synchronized static MenuBarPane getInstance() {
        return menuBarPane == null ? new MenuBarPane() : menuBarPane;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        MenuItem source = (MenuItem) actionEvent.getSource();
        VBox pane = switch (source.getText()) {
            case EXERCISE_ONE -> ExerciseOnePane.getInstance().getMainPane();
            case EXERCISE_TWO -> ExerciseTwoPane.getInstance().getMainPane();
            case EXERCISE_THREE -> ExerciseThreePane.getInstance().getMainPane();
            default -> new VBox(new Label("Empty"));
        };

        changePane(pane);
    }

    private void changePane(Pane pane) {
        mainPane.getChildren().remove(1);
        mainPane.getChildren().add(pane);
    }

    private MenuBar getMenuBar() {
        Menu menuExerciseFour = new Menu(EXERCISE_ONE);
        MenuItem menuItemFour = new MenuItem(EXERCISE_ONE);
        menuExerciseFour.getItems().add(menuItemFour);
        menuItemFour.setOnAction(this);

        Menu menuExerciseFive = new Menu(EXERCISE_TWO);
        MenuItem menuItemFive = new MenuItem(EXERCISE_TWO);
        menuExerciseFive.getItems().add(menuItemFive);
        menuItemFive.setOnAction(this);

        Menu menuExerciseSix = new Menu(EXERCISE_THREE);
        MenuItem menuItemSix = new MenuItem(EXERCISE_THREE);
        menuExerciseSix.getItems().add(menuItemSix);
        menuItemSix.setOnAction(this);

        return new MenuBar(menuExerciseFour, menuExerciseFive, menuExerciseSix);
    }

    public VBox getMainPane() {
        return mainPane;
    }
}
