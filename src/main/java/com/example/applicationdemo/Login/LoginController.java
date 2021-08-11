package com.example.applicationdemo.Login;

import com.example.applicationdemo.Connect.sqliteConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.Window;


import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button submitButton;

    @FXML
    public void handleButtonAction(ActionEvent actionEvent) throws SQLException, IOException {
        Window owner = submitButton.getScene().getWindow();
        if(usernameField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "No data entered",
                    "Please enter your login id");
            return;
        }
        if(passwordField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "No data entered",
                    "Please enter a password");
            return;
        }


        String username = usernameField.getText();
        String password = passwordField.getText();

        sqliteConnection connected = new sqliteConnection();
        boolean flag = connected.validate(username, password);

        if (!flag) {
            infoBox("Please enter correct Username and/or Password", null, "Failed login");

        } else {

            infoBox("Login Successful!", null, "Successful login");

            Node node=(Node) actionEvent.getSource();
            Stage stage=(Stage) node.getScene().getWindow();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Home.fxml")));

            /* Exception */
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
    }

    public static void infoBox(String infoMessage, String headerText, String title) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();
    }

}