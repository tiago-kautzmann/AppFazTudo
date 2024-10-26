package com.example.appfaztudo;

import com.example.appfaztudo.model.Util;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class IMCController {

    @FXML
    private TextField textPeso;

    @FXML
    private TextField textAltura;

    @FXML
    private Label labelResultado;

    @FXML
    protected void onCalcularIMCButtonClick(){
        double peso = Double.parseDouble(textPeso.getText());
        double altura = Double.parseDouble(textAltura.getText());
        labelResultado.setText("Seu IMC: " + Util.calculaIMC(peso, altura));
    }

}
