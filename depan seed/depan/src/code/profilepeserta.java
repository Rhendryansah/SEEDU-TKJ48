package code;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class profilepeserta implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonBeranda;

    @FXML
    private Button buttonEditProfil;

    @FXML
    private Button buttonUnduhSertif;

    @FXML
    void initialize() {
        buttonBeranda.setOnAction(event -> handleButtonBeranda());
        buttonEditProfil.setOnAction(event -> handleButtonEditProfil());
        buttonUnduhSertif.setOnAction(event -> handleButtonUnduhSertif());
    }
    
    @FXML
    void handleButtonBeranda() {
        switchToBeranda();
    }

    private void switchToBeranda() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("homepeserta.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonBeranda.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonEditProfil() {
        switchToEditProfile();
    }

    private void switchToEditProfile() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EditProfilepeserta.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonEditProfil.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonUnduhSertif() {

    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
