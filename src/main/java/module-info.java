module com.jomariabejo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jomariabejo to javafx.fxml;
    exports com.jomariabejo;

}