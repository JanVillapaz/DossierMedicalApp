package com.example.applicationdemo.Connect;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.*;

public class searchPatientDB {
    private static final String DATABASE_URL = "jdbc:sqlite:HospitalDB";
    private static final String SELECT_QUERY = "SELECT * FROM Patient WHERE noAssuranceMaladie = ?";

    sqliteConnection connected = new sqliteConnection();
    sqliteConnection exception = new sqliteConnection();

    public boolean patientExists(String insuranceNo) throws SQLException  {

        try (Connection connection = DriverManager
                .getConnection(DATABASE_URL);

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setString(1, insuranceNo);

            System.out.println(preparedStatement);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            }


        } catch (SQLException e) {
            // print SQL exception information
            exception.printSQLException(e);
        }

        return false;
    }

    public void outputPatient() {


    }


}
