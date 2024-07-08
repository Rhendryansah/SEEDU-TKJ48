package code;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginpage implements Initializable {

    @FXML
    private Hyperlink hyperLupaPassword;

    @FXML
    private Hyperlink hyperRegisterPeserta;

    @FXML
    private TextField inputEmailPeserta;

    @FXML
    private PasswordField inputPasswordPeserta;

    @FXML
    private Button tombolLogin;

    @FXML
    void handleLogin() {
        String email = inputEmailPeserta.getText();
        String password = inputPasswordPeserta.getText();

        if (email.isEmpty() || password.isEmpty()) {
            showAlert(AlertType.ERROR, "Form Error!", "Please enter your email and password.");
            return;
        }

        if (authenticate(email, password)) {
            switchTohomePage();
        } else {
            showAlert(AlertType.ERROR, "Login Error!", "Invalid email or password.");
        }
    }

    private boolean authenticate(String email, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("dataPeserta.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userDetails = line.split(",");
                if (userDetails.length > 3 && userDetails[3].equals(email) && userDetails[2].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            showAlert(AlertType.ERROR, "File Error!", "Failed to read data.");
            e.printStackTrace();
        }
        return false;
    }

    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    void handleLupaPassword() {
    }

    @FXML
    void handleRegisterPeserta() {
        switchToRegister();
    }

    private void switchToRegister() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CreataccPeserta.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) hyperRegisterPeserta.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void switchTohomePage() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("homepeserta.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) tombolLogin.getScene().getWindow();
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
