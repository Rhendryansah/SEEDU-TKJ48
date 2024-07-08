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

public class tinjaujawaban implements Initializable {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backHasilUjian;

    @FXML
    private Button buttonSebelumnya;

    @FXML
    private Button buttonSelanjutnya;

    @FXML
    void initialize() {
        backHasilUjian.setOnAction(event -> handleBackHasilUjian());
        buttonSebelumnya.setOnAction(event -> handleButtonSebelumnya());
        buttonSelanjutnya.setOnAction(event -> handleButtonSelanjutnya());
    }

    @FXML
    void handleBackHasilUjian() {
        switchToBack();
    }
    private void switchToBack(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) backHasilUjian.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonSebelumnya() {
        switchToSebelum();
    }
    private void switchToSebelum(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonSebelumnya.getScene().getWindow();
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
