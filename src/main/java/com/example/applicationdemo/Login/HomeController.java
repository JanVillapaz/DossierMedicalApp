package com.example.applicationdemo.Login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.util.Objects;

public class HomeController {

    @FXML
    private Button searchButton;

    @FXML
    private TextField healthID;

    @FXML
    public void handleFindPatientLink (ActionEvent actionEvent) throws IOException {

        Node node = (Node) actionEvent.getSource();
        Stage stage=(Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FindPatient.fxml")));/* Exception */
        Scene scene = new Scene(root);


        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void handleHomeLink (ActionEvent actionEvent) throws IOException {


        Node node = (Node) actionEvent.getSource();
        Stage stage=(Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Home.fxml")));/* Exception */
        Scene scene = new Scene(root);


        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void handleSearchButton (ActionEvent actionEvent) throws IOException {

        Window owner = searchButton.getScene().getWindow();

        if(healthID.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "No data entered",
                    "Please enter patient's Healthcare Insurance number.");
            return;
        }

        Node node = (Node) actionEvent.getSource();
        Stage stage=(Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Home.fxml")));/* Exception */
        Scene scene = new Scene(root);


        stage.setScene(scene);
        stage.show();
    }
}
