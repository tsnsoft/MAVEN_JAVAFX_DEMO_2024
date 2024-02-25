package kz.tsnsoft.maven_javafx_demo;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javax.swing.*;

public class PrimaryController {

    @FXML
    private Button primaryButton;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void onJavaClick(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Hello, JavaFX!");
    }
}
