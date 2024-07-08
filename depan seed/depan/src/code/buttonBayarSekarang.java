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

public class buttonBayarSekarang implements Initializable {

    @FXML
    private Button btnPelatihan;

    @FXML
    private Button btnBeranda;

    @FXML
    private Button btnSertifikasi;

    @FXML
    private Button btnArtikel;

    @FXML
    private Button btnProfil;

    @FXML
    private Button btnKeluar;

    @FXML
    private Button btnBayarSekarang;

    @FXML
    void initialize() {
        btnPelatihan.setOnAction(event -> ButtonPelatihanAction());
        btnBeranda.setOnAction(event -> ButtonBerandaAction());
        btnSertifikasi.setOnAction(event -> ButtonSertifikasiAction());
        btnArtikel.setOnAction(event -> ButtonArtikelAction());
        btnProfil.setOnAction(event -> ButtonProfilAction());
        btnKeluar.setOnAction(event -> ButtonKeluarAction());
        btnBayarSekarang.setOnAction(event -> buttonBayarSekarangAction());
    }

    @FXML
    void ButtonBerandaAction() {
        switchToBeranda();
    }

    private void switchToBeranda() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("homepeserta.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) btnBeranda.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void ButtonPelatihanAction() {
        switchToPelatihan();
    }

    private void switchToPelatihan() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("halamanpelatihan.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) btnPelatihan.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void ButtonSertifikasiAction() {
        switchToSertifikasi();
    }

    private void switchToSertifikasi() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("file.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) btnSertifikasi.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void ButtonArtikelAction() {
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
    void ButtonProfilAction() {
        switchToProfil();
    }

    private void switchToProfil() {
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
    void ButtonKeluarAction() {
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
    void buttonBayarSekarangAction() {
        switchToBayarSekarang();
    }

    private void switchToBayarSekarang() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Pembayaran.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) btnBayarSekarang.getScene().getWindow();
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
