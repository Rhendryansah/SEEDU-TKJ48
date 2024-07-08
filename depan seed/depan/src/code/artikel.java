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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class artikel implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnArtikel;

    @FXML
    private Button btnBeranda;

    @FXML
    private Button btnKeluar;

    @FXML
    private Button btnPelatihan;

    @FXML
    private Button btnProfil;

    @FXML
    private Button btnSertifikasi;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchField;

    @FXML
    private Button toArtikel1;

    @FXML
    private Button toArtikel2;

    @FXML
    void handleButtonArtikel(ActionEvent event) {

    }

    @FXML
    void handleButtonArtikel1(ActionEvent event) {

    }

    @FXML
    void handleButtonArtikel2(ActionEvent event) {

    }

    @FXML
    void handleButtonBeranda(ActionEvent event) {

    }

    @FXML
    void handleButtonKeluar(ActionEvent event) {

    }

    @FXML
    void handleButtonPelatihan() {
        switchToPelatihan();
    }

    private void switchToPelatihan() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("homepelatihanataukuis.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) btnPelatihan.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonProfil(ActionEvent event) {
        switchToPRofil();
    }

    private void switchToPRofil() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("profilepeserta.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) btnProfil.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonSertifikasi(ActionEvent event) {
        switchToSertifikasi();
    }

    private void switchToSertifikasi() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("halamansertif.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) btnSertifikasi.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleSearch(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
