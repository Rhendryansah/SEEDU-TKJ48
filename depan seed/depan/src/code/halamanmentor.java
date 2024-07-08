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

public class halamanmentor implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonArtikel;

    @FXML
    private Button buttonBeranda;

    @FXML
    private Button buttonKelolaKelas;

    @FXML
    private Button buttonKelolaPelatihan;

    @FXML
    private Button buttonKeluar;

    @FXML
    private Button buttonMulaiSesi;

    @FXML
    private Button buttonProfil;

    @FXML
    void handleButtonArtikel(ActionEvent event) {
        switchToArtikel();
    }
    private void switchToArtikel(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("artikelMentor.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonArtikel.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonBeranda(ActionEvent event) {

    }

    @FXML
    void handleButtonKelolaKelas(ActionEvent event) {
        switchToKelolaKelas();
    }
    private void switchToKelolaKelas(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonKelolaKelas.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonKeluar(ActionEvent event) {
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
    void handleButtonKelolaPelatihan(ActionEvent event) {
        switchToKelolaPelatihan();
    }
    private void switchToKelolaPelatihan(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("KelolaPelatihan.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonKelolaPelatihan.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonMulaiSesi(ActionEvent event) {

    }

    @FXML
    void handleButtonProfil(ActionEvent event) {
        switchToProfileMentor();
    }
    private void switchToProfileMentor(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("profilementor.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonProfil.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void initialize() {

    }

    @Override
    public void initialize (URL url, ResourceBundle rb){

    }

}
