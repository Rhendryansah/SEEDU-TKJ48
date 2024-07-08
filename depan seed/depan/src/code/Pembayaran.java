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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Pembayaran implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonBayar;

    @FXML
    private Button buttonCancel;

      private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    void handleButtonBayar(ActionEvent event) {
        switchToBayar();
    }

    private void switchToBayar() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("halamanpelatihan.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonBayar.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        showAlert(AlertType.INFORMATION, "Pembayaran Berhasil",
        "Terima kasih! Pembayaran pelatihan Anda telah berhasil.");
    }

    @FXML
    void handleButtonCancel(ActionEvent event) {
        switchToCancel();
    }

    private void switchToCancel() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("buttonBayarSekarang.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonCancel.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        showAlert(AlertType.WARNING, "Pembayaran dibatalkan!",
        "Pembayaran telah dibatalkan. Silakan coba lagi.");
    }

    @FXML
    void initialize() {
      

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
