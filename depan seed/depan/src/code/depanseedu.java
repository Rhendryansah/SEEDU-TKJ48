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

public class depanseedu implements Initializable {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonDaftarDasarEkowisata, buttonDaftarSekarang, buttonManajemenPerhotelan, buttonMembangun,
            buttonMenujuPariwisata, buttonPerkembanganPariwisata, buttonPraktikRamah, lihatPelatihanButton, loginButton,
            mulaiBelajarButton;

    @FXML
    private TextField searchField;

    @FXML
    void initialize() {
        buttonDaftarSekarang.setOnAction(event -> handleButtonDaftarSekarang());
        loginButton.setOnAction(event -> handleLoginButton());
        mulaiBelajarButton.setOnAction(event -> handleMulaiBelajar());
        buttonManajemenPerhotelan.setOnAction(event -> handleButtonManajemenPerhotelan());
        buttonPerkembanganPariwisata.setOnAction(event -> handlePerkembanganPariwisata());
        buttonDaftarDasarEkowisata.setOnAction(event -> handleButtonDaftarDasarEkowisata());
        
    }

    @FXML
    void handleButtonDaftarDasarEkowisata() {
        switchToPilihLogin4();
    }
    private void switchToPilihLogin4(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("loginpage.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonDaftarDasarEkowisata.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void handleButtonDaftarSekarang() {
        switchToPilihLogin();
    }
    private void switchToPilihLogin(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pilihanlogin.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonDaftarSekarang.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonManajemenPerhotelan() {
        switchToPilihLogin3();
    }
    private void switchToPilihLogin3(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("loginpage.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonManajemenPerhotelan.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void handleButtonMembangun() {

    }

    @FXML
    void handleButtonMenujuPariwisata() {

    }

    @FXML
    void handleButtonPraktikRamah() {

    }

    @FXML
    void handleLihatPelatihan() {

    }

    @FXML
    void handleLoginButton() {
        switchToPilihLogin1();
    }
    private void switchToPilihLogin1(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pilihanlogin.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleMulaiBelajar() {
        switchToPilihLogin2();
    }
    private void switchToPilihLogin2(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("loginpage.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) mulaiBelajarButton.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handlePerkembanganPariwisata() {
        switchToPilihLogin6();
    }
    private void switchToPilihLogin6(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("loginpage.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonPerkembanganPariwisata.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleSearchField() {
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}