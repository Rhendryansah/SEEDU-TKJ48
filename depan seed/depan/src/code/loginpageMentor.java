package code;

import java.io.BufferedReader;
import java.io.FileReader;
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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginpageMentor implements Initializable {

    @FXML
    private Hyperlink hyperLupaPassword;

    @FXML
    private Hyperlink hyperRegisterMentor;

    @FXML
    private TextField inputEmailMentor;

    @FXML
    private PasswordField inputPasswordMentor;

    @FXML
    private Button tombolLogin;

    @FXML
    void handleLogin(ActionEvent event) {
        String email = inputEmailMentor.getText();
        String password = inputPasswordMentor.getText();

        if (email.isEmpty() || password.isEmpty()) {
            showAlert(AlertType.ERROR, "Login Error", "Please enter your email and password.");
            return;
        }

        if (validateCredentials(email, password)) {
            showAlert(AlertType.INFORMATION, "Login Successful", "Welcome to your account!");
            switchToHomePageMentor();
        } else {
            showAlert(AlertType.ERROR, "Login Error", "Invalid email or password.");
        }
    }

    private boolean validateCredentials(String email, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("dataMentor.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] details = line.split(",");
                if (details[4].equals(email) && details[3].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            showAlert(AlertType.ERROR, "File Error", "An error occurred while reading account data.");
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
    void handleLupaPassword(ActionEvent event) {
        // Implement forgot password functionality
    }

    @FXML
    void handleRegisterMentor(ActionEvent event) {
        switchToRegister();
    }

    private void switchToRegister() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Createaccmentor.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) hyperRegisterMentor.getScene().getWindow();
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
    public void initialize(URL url, ResourceBundle rb) {

    }

    private void switchToHomePageMentor() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("halamanmentor.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) tombolLogin.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
