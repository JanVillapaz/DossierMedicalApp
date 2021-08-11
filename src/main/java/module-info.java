module com.example.applicationdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;
    requires java.sql;

    opens com.example.applicationdemo.Login to javafx.fxml;
    exports com.example.applicationdemo.Login;
}