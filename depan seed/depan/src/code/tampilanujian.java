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

public class tampilanujian implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonSebelum;

    @FXML
    private Button buttonSelanjutnya;

    @FXML
    private Button buttonSelesai;

    @FXML
    private Button buttonTinjau;

    @FXML
    private Button tandaiSoal;

    @FXML
    void initialize() {
        buttonSebelum.setOnAction(event -> handleButtonSebelum());
        buttonSelanjutnya.setOnAction(event -> handleButtonSelanjutnya());
        buttonSelesai.setOnAction(event -> handleButtonSelesai());
        buttonTinjau.setOnAction(event -> handleButtonTinjau());
        tandaiSoal.setOnAction(event -> handleTandaiSoal());
    }

    @FXML
    void handleButtonSebelum() {
        switchToSebelum();
    }
    private void switchToSebelum(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonSebelum.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonSelanjutnya() {
        switchToSelanjutnya();
    }
    private void switchToSelanjutnya(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonSelanjutnya.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonSelesai() {
        switchToselesai();
    }
    private void switchToselesai(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonSelesai.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonTinjau() {
        switchToTinjau();
    }
    private void switchToTinjau(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonTinjau.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleTandaiSoal() {
        switchToTandaiSoal();
    }
    private void switchToTandaiSoal(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) tandaiSoal.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        
    }
}
