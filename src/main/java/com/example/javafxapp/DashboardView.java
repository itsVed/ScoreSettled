package com.example.javafxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DashboardView extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DashboardView.fxml"));
            Parent root = loader.load();

            // Load the CSS file
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

            primaryStage.setTitle("Dashboard");
            primaryStage.setScene(scene);
            primaryStage.show();

            // Mark "Dashboard" button as active
            Button dashboardButton = (Button) root.lookup(".active-button"); // Adjusted selector to match the class
            if (dashboardButton != null) {
                dashboardButton.getStyleClass().add("active-button");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
