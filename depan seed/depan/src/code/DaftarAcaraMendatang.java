package code;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class DaftarAcaraMendatang implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonArtikel;

    @FXML
    private Button buttonBeranda;

    @FXML
    private Button buttonKeluar;

    @FXML
    private Button buttonPelatihan;

    @FXML
    private Button buttonProfil;

    @FXML
    private Button buttonRegistration;

    @FXML
    private Button buttonSertifikasi;

    @FXML
    private TextField emailField;

    @FXML
    private TextField nameField;

        private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    void handleButtonArtikel(ActionEvent event) {

    }

    @FXML
    void handleButtonBeranda(ActionEvent event) {

    }

    @FXML
    void handleButtonKeluar(ActionEvent event) {

    }

    @FXML
    void handleButtonPelatihan(ActionEvent event) {

    }

    @FXML
    void handleButtonProfil(ActionEvent event) {

    }

    @FXML
    void handleButtonSertifikasi(ActionEvent event) {

    }

    @FXML
    void handleRegistration(ActionEvent event) {
        showAlert(AlertType.INFORMATION, "Daftar Berhasil!",
                "Terimakasih telah mendaftar webinar. Informasi lengkap mengenai webinar akan dikirimkan ke email anda.");
    }

    @FXML
    void initialize() {
      

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
}
}