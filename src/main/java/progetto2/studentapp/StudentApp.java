package progetto2.studentapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Information");

        // Create input fields
        TextField firstNameField = new TextField();
        TextField lastNameField = new TextField();
        TextField averageField = new TextField();

        // Create labels
        Label firstNameLabel = new Label("First Name:");
        Label lastNameLabel = new Label("Last Name:");
        Label averageLabel = new Label("Average:");

        // Create button
        Button okButton = new Button("OK");

        // Create GridPane and add components
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(firstNameLabel, 0, 0);
        gridPane.add(firstNameField, 1, 0);
        gridPane.add(lastNameLabel, 0, 1);
        gridPane.add(lastNameField, 1, 1);
        gridPane.add(averageLabel, 0, 2);
        gridPane.add(averageField, 1, 2);
        gridPane.add(okButton, 1, 3);

        // Create VBox to hold the gridPane and result area
        VBox vbox = new VBox(10);
        vbox.getChildren().add(gridPane);

        // Result label
        Label resultLabel = new Label();
        vbox.getChildren().add(resultLabel);

        // Button action
        okButton.setOnAction(event -> {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String average = averageField.getText();

            resultLabel.setText("Name: " + firstName + " " + lastName + "\nAverage: " + average);

            // Clear fields
            firstNameField.clear();
            lastNameField.clear();
            averageField.clear();
        });

        // Create scene and set stage
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
