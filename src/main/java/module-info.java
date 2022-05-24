module com.corbin.chess {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens com.corbin.chess to javafx.fxml;
    exports com.corbin.chess;
}