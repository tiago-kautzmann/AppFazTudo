package com.example.appfaztudo;

import javafx.fxml.FXML;

import java.io.IOException;

public class HelloController {

    @FXML
    protected void onCalcularIMCButtonClick() throws IOException {
        new JanelaIMC();
    }

    @FXML
    protected void onConversaoTemperaturaButtonClick() throws IOException {
        new JanelaConversaoTemperatura();
    }

    @FXML
    protected void onDoacoesButtonClick() throws IOException {
        new JanelaDoacoes();
    }

    @FXML
    protected void onSairButtonClick(){
        System.exit(0);
    }

}