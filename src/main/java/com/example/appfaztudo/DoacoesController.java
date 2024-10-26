package com.example.appfaztudo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class DoacoesController {

    @FXML
    private TextField textValor;

    @FXML
    private ListView<Double> listDoacoes;

    @FXML
    private Label labelTotal;

    @FXML
    protected void onAdicionarButtonClick(){
        double valor = Double.parseDouble(textValor.getText());
        listDoacoes.getItems().add(valor);
        double total = listDoacoes.getItems()
                .stream()
                .reduce(0.0, (soma, numero) -> soma + numero);
        labelTotal.setText(total+"");
    }

}
