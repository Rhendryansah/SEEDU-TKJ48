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
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class homePeserta implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnArtikel;

    @FXML
    private Button btnBeranda;

    @FXML
    private Button buttonPromo;

    @FXML
    private Button btnKeluar;

    @FXML
    private Button btnPelatihan;

    @FXML
    private Button btnPelatihanAnda;

    @FXML
    private Button buttonWebinar;

    @FXML
    private Button btnProfil;

    @FXML
    private Button btnSertifikasi;

    @FXML
    private Button buttonLanjutkanModul;

    @FXML
    private Label lblKursusAktif;

    @FXML
    private Label lblPoinReward;

    @FXML
    private Label lblProgress;

    @FXML
    private Label lblSelamatdatang;

    @FXML
    private Label lblSertifikat;

    @FXML
    void initialize() {
        btnArtikel.setOnAction(event -> handleButtonArtikel());
        btnBeranda.setOnAction(event -> handleButtonBeranda());
        btnKeluar.setOnAction(event -> handleButtonKeluar());
        buttonLanjutkanModul.setOnAction(event -> handleButtonLanjutkanModul());
        btnPelatihan.setOnAction(event -> handleBtnPelatihan());
        btnProfil.setOnAction(event -> handleButtonProfil());
        btnSertifikasi.setOnAction(event -> handleButtonSertifikasi());
    }

    @FXML
    void handleButtonArtikel() {
        switchToArtikel();
    }

    private void switchToArtikel() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("artikel.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) btnArtikel.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonBeranda() {
        switchToBeranda();
    }

    private void switchToBeranda() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(""));
            Parent root = loader.load();
            Stage stage = (Stage) btnBeranda.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonKeluar() {
        switchToKeluar();
    }

    private void switchToKeluar() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("depanseedu.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) btnKeluar.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonLanjutkanModul() {
        switchToLanjutkanModul();
    }

    private void switchToLanjutkanModul() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("file.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonLanjutkanModul.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleBtnPelatihan() {
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
    void handleButtonProfil() {
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
    void handleButtonPromo(ActionEvent event) {
        switchToPromo();
    }

    private void switchToPromo() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("buttonBayarSekarang.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonPromo.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonWebinar(ActionEvent event) {
        switchToWebinar();
    }

    private void switchToWebinar() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DaftarAcaraMendatang.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonWebinar.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonSertifikasi() {
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
