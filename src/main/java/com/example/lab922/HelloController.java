package com.example.lab922;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label joeyKnowlesLabel;

    @FXML
    protected void onJoeyKnowlesButtonClick() { joeyKnowlesLabel.setText("My name is Joey Knowles"); }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
