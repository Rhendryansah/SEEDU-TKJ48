package code;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditProfilepeserta implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonBeranda;

    @FXML
    private Button buttonCancel;

    @FXML
    private Button buttonSimpanProfil;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField usernameField;

    @FXML
    void initialize() {
        buttonBeranda.setOnAction(event -> handleButtonBeranda());
        buttonCancel.setOnAction(event -> handleButtonCancel());
        buttonSimpanProfil.setOnAction(event -> handleButtonSimpanProfil());
    }

    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
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
    void handleButtonCancel() {
        showAlert(AlertType.WARNING, "Peringatan!",
                "Apakah Anda yakin ingin membatalkan?");
    }

    @FXML
    void handleButtonSimpanProfil() {
        int phoneNumberPeserta;

        String usnPeserta = usernameField.getText();
        String pwPeserta = passwordField.getText();
        String confPasswordPeserta = confirmPasswordField.getText();
        String email_Peserta = emailField.getText();
        String noTlpPeserta = phoneField.getText();

        try {
            phoneNumberPeserta = Integer.parseInt(noTlpPeserta);
        } catch (NumberFormatException e) {
            showAlert(AlertType.ERROR, "Input Error!", "Phone Number must be numeric.");
            return;
        }

        if (!pwPeserta.equals(confPasswordPeserta)) {
            showAlert(AlertType.ERROR, "Password Error!", "Password and Confirm Password must be the same");
            return;
        }
        if (!isPasswordValid(pwPeserta)) {
            showAlert(AlertType.ERROR, "Password Error!",
                    "Password must be at least 8-12 characters and include at least one uppercase letter, one lowercase letter, and one number.");
            return;
        }

        showAlert(AlertType.INFORMATION, "Profil Diperbarui",
                "Informasi profil Anda berhasil diperbarui.");
        switchToBeranda2();
    }

    private void switchToBeranda2() {
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

    private boolean isPasswordValid(String password) {
        if (password.length() < 8 || password.length() > 12) {
            return false;
        }

        String uppercasePattern = ".*[A-Z].*";
        String lowercasePattern = ".*[a-z].*";
        String digitPattern = ".*\\d.*";

        return Pattern.matches(uppercasePattern, password) &&
                Pattern.matches(lowercasePattern, password) &&
                Pattern.matches(digitPattern, password);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
