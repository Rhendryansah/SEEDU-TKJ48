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

public class artikelMentor implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonArtikel;

    @FXML
    private Button buttonBeranda;

    @FXML
    private Button buttonKelolaPelatihan;

    @FXML
    private Button buttonKeluar;

    @FXML
    private Button buttonProfil;

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
    void handleButtonKelolaPelatihan(ActionEvent event) {

    }

    @FXML
    void handleButtonKeluar(ActionEvent event) {

    }

    @FXML
    void handleButtonProfil(ActionEvent event) {
       switchToSertifikasi();
    }

    private void switchToSertifikasi() {
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
    void handleSearch(ActionEvent event) {

    }

    @FXML
    void initialize() {


    }

    @Override
    public void initialize (URL url, ResourceBundle rb){

    }

}
