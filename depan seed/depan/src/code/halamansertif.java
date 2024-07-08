package code;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class halamansertif implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonBack;

    @FXML
    private Button buttonShare;

    @FXML
    private Button buttonUnduhSertif;

    @FXML
    void initialize() {
        buttonBack.setOnAction(event -> handleButtonBack());
        buttonShare.setOnAction(event -> handleButtonShare());
        buttonUnduhSertif.setOnAction(event -> handleButtonUnduhSertif());

    }

    @FXML
    void handleButtonBack() {
        switchToBackButton();
    }

    private void switchToBackButton() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("homepeserta.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonBack.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonShare() {
        switchToButtonShare();
    }

    private void switchToButtonShare() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonShare.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonUnduhSertif() {
        switchToUnduhSertif();
    }

    private void switchToUnduhSertif() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonUnduhSertif.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
