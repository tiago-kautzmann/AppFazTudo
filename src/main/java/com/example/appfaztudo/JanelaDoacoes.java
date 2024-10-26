package com.example.appfaztudo;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JanelaDoacoes extends Stage {

    public JanelaDoacoes() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("doacoes-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 340);
        this.setTitle("Doações");
        this.setScene(scene);
        this.show();
    }

}
