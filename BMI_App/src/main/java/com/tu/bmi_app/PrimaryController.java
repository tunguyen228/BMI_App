package com.tu.bmi_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class PrimaryController {

    @FXML
    private TextField txtWeight;      //them @FXML de lien ket giao dien
    @FXML
    private TextField txtHeight;
    @FXML
    private Label lbResult;

    public void handleBMI(ActionEvent event) {      //xu ly su kien click vao button
        try {
            double w = Double.parseDouble(this.txtWeight.getText());
            double h = Double.parseDouble(this.txtHeight.getText());
            double bmi = w / Math.pow(h, 2);
            String msg = "";

            if (bmi < 18.5) {
                msg = "Under weight";
            } else if (bmi < 24.9) {
                msg = "Normal weight";
            } else if (bmi < 29.9) {
                msg = "Over weight";
            } else {
                msg = "Obesity";
            }

            lbResult.setTextFill(Color.BLUE);
            lbResult.setText(String.format("BMI = %.1f - %s", bmi, msg));

        } catch (NumberFormatException ex) {
            lbResult.setTextFill(Color.RED);
            lbResult.setText("Invalid data!");
        }
    }
}
