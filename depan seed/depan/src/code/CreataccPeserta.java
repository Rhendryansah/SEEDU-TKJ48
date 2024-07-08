package code;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreataccPeserta implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private TextField fullName;
    @FXML
    private ComboBox<String> gender;
    @FXML
    private DatePicker dateOfBirth;
    @FXML
    private TextField phoneNumber;
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private PasswordField confirmPassword;
    @FXML
    private CheckBox agreementCheckbox;
    @FXML
    private Button createAccountButton;

    @FXML
    void initialize() {
        createAccountButton.setOnAction(event -> handleCreateAccount());
    }

    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    void handleCreateAccount() {
        String namaPeserta = fullName.getText();
        String usnPeserta = username.getText();
        String pwPeserta = password.getText();
        String confPasswordPeserta = confirmPassword.getText();
        String email_Peserta = email.getText();
        String jenisKelaminPeserta = gender.getValue();
        String noTlpPeserta = phoneNumber.getText();
        String tlPeserta = dateOfBirth.getValue() != null ? dateOfBirth.getValue().toString() : "";

        if (namaPeserta.isEmpty() || noTlpPeserta.isEmpty() || pwPeserta.isEmpty() || confPasswordPeserta.isEmpty()
                || email_Peserta.isEmpty() || tlPeserta.isEmpty()) {
            showAlert(AlertType.ERROR, "Form Error!", "Please fill in all required fields.");
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

        if (!isValidPhoneNumber(noTlpPeserta)) {
            showAlert(AlertType.ERROR, "Phone Number Error!",
                    "Phone number must start with '08' or '62' and be between 8 to 11 digits.");
            return;
        }

        if (!email_Peserta.endsWith("@gmail.com")) {
            showAlert(AlertType.ERROR, "Email Error!", "Please use a Gmail account for registration.");
            return;
        }

        saveDataToCSV(namaPeserta, usnPeserta, pwPeserta, email_Peserta, jenisKelaminPeserta, noTlpPeserta, tlPeserta);

        showAlert(AlertType.INFORMATION, "Registration Successful!",
                "Congratulations, Your signup was successful, Get ready to explore, learn, and contribute.");
        switchToHomePagePeserta();
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return (phoneNumber.startsWith("08") || phoneNumber.startsWith("62")) && phoneNumber.length() >= 8
                && phoneNumber.length() <= 11 && phoneNumber.matches("\\d+");
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

    private void saveDataToCSV(String fullName, String username, String password, String email, String gender,
            String phoneNumber, String dateOfBirth) {
        try (FileWriter fw = new FileWriter("dataPeserta.csv", true); PrintWriter pw = new PrintWriter(fw)) {
            pw.println(String.join(",", fullName, username, password, email, gender, phoneNumber, dateOfBirth));
        } catch (IOException e) {
            showAlert(AlertType.ERROR, "File Error!", "Failed to save data.");
            e.printStackTrace();
        }
    }

    private void switchToHomePagePeserta() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("homepeserta.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) createAccountButton.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleLogin() {
        switchToLogin();
    }

    private void switchToLogin() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("loginpage.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) createAccountButton.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gender.getItems().addAll("Male", "Female");
    }
}
