package com.example.appfaztudo;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JanelaConversaoTemperatura extends Stage {

    public JanelaConversaoTemperatura() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("convtemp-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 340);
        this.setTitle("Conversão de Temperatura");
        this.setScene(scene);
        this.show();
    }

}
