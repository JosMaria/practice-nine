module org.genesiscode.practicenine {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.genesiscode.practicenine to javafx.fxml;
    exports org.genesiscode.practicenine;
}