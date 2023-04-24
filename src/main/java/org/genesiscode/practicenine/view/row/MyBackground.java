package org.genesiscode.practicenine.view.row;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class MyBackground {

    public static Background getBackground() {
        Paint paint = new Color(0.1, 0.1, 0.5, 0.5);
        return new Background(new BackgroundFill(paint, new CornerRadii(0), new Insets(0)));
    }
}
