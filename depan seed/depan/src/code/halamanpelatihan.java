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

public class halamanpelatihan implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonAhmad, buttonArtikel, buttonBeranda, buttonBudi, buttonDaftarPariwisata, buttonDasarEko,
            buttonDigitral, buttonFD, buttonFDEko, buttonFDIno, buttonKTAnalisis, buttonKeluar, buttonManajemen,
            buttonMaya, buttonPelatihan, buttonPemasaranDigital, buttonProfil, buttonRina, buttonSertifikasi,
            buttonSiti;

    @FXML
    void initialize() {
        buttonAhmad.setOnAction(event -> handleButtonAhmad());
        buttonArtikel.setOnAction(event -> handleButtonArtikel());
        buttonBeranda.setOnAction(event -> handleButtonBeranda());
        buttonBudi.setOnAction(event -> handleButtonBudi());
        buttonDaftarPariwisata.setOnAction(event -> handleButtonDaftarPariwisata());
        buttonDasarEko.setOnAction(event -> handleButtonDasarEko());
        buttonDigitral.setOnAction(event -> handleButtonDigital());
        buttonFD.setOnAction(event -> handleButtonFD());
        buttonFDEko.setOnAction(event -> handleButtonFDEko());
        buttonFDIno.setOnAction(event -> handleButtonFDIno());
        buttonKTAnalisis.setOnAction(event -> handleButtonKTAnalisis());
        buttonKeluar.setOnAction(event -> handleButtonKeluar());
        buttonManajemen.setOnAction(event -> handleButtonManajemen());
        buttonMaya.setOnAction(event -> handleButtonMaya());
        buttonPelatihan.setOnAction(event -> handleButtonPelatihan());
        buttonPemasaranDigital.setOnAction(event -> handelButtonPemasaranDigital());
        buttonProfil.setOnAction(event -> handleButtonProfil());
        buttonRina.setOnAction(event -> handleButtonRina());
        buttonSertifikasi.setOnAction(event -> handleButtonSertifikasi());
        buttonSiti.setOnAction(event -> handleButtonSiti());
    }

    @FXML
    void handelButtonPemasaranDigital() {
        switchToPemasaranD();
    }

    private void switchToPemasaranD() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonPemasaranDigital.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonAhmad() {
        switchToAhmad();
    }

    private void switchToAhmad() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonAhmad.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonArtikel() {
        switchToArtikel();
    }

    private void switchToArtikel() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("artikel.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonArtikel.getScene().getWindow();
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
    void handleButtonBudi() {
        switchToBudi();
    }
    private void switchToBudi(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonBudi.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonDaftarPariwisata() {
        switchToDaftarPar();
    }
    private void switchToDaftarPar(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("buttonBayarSekarang.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonDaftarPariwisata.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonDasarEko() {
        switchToDasarEko();
    }
    private void switchToDasarEko(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("homepelatihanataukuis.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonDasarEko.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonDigital() {
        switchToDigital();
    }
    private void switchToDigital(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonDigitral.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonFD() {
        switchToFD();
    }
    private void switchToFD(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonFD.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonFDEko() {
        switchToFDEko();
    }
    private void switchToFDEko(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("halamanroomdiskusi.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonFDEko.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonFDIno() {
        switchToFDIno();
    }
    private void switchToFDIno(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonFDIno.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonKTAnalisis() {
        switchToKTAnalisis();
    }
    private void switchToKTAnalisis(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("kumpulintugas.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonKTAnalisis.getScene().getWindow();
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
    private void switchToKeluar(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("depanseedu.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonKeluar.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonManajemen() {
        switchToManajemen();
    }
    private void switchToManajemen(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonManajemen.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonMaya() {
        switchToMaya();
    }
    private void switchToMaya(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonMaya.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonPelatihan() {
        switchToPelatihan();
    }
    private void switchToPelatihan(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonPelatihan.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonProfil() {
        switchToProfil();
    }
    private void switchToProfil(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonProfil.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonRina() {
        switchToRina();
    }
    private void switchToRina(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonRina.getScene().getWindow();
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
    private void switchToSertifikasi(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonSertifikasi.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonSiti() {
        switchToSiti();
    }
    private void switchToSiti(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ruangkonsultasi.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonSiti.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL urk, ResourceBundle rb) {

    }

}
