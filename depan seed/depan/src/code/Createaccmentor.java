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

public class Createaccmentor implements Initializable {

    @FXML
    private CheckBox agreementCheckbox;

    @FXML
    private PasswordField confirmPassword;

    @FXML
    private Button createAccountButton;

    @FXML
    private DatePicker dateOfBirth;

    @FXML
    private TextField email;

    @FXML
    private TextField fullName;

    @FXML
    private ComboBox<String> gender;

    @FXML
    private TextField jobTitle;

    @FXML
    private TextField nidn;

    @FXML
    private PasswordField password;

    @FXML
    private TextField phoneNumber;

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
        int phoneNumberMentor;

        String namaMentor = fullName.getText();
        String job = jobTitle.getText();
        String nidnmntr = nidn.getText();
        String pwMentor = password.getText();
        String confPasswordMentor = confirmPassword.getText();
        String email_Mentor = email.getText();
        String jenisKelaminMentor = gender.getValue();
        String noTlpMentor = phoneNumber.getText();
        String tlMentor = dateOfBirth.getValue() != null ? dateOfBirth.getValue().toString() : "";

        try {
            phoneNumberMentor = Integer.parseInt(noTlpMentor);
        } catch (NumberFormatException e) {
            showAlert(AlertType.ERROR, "Input Error!", "Phone Number must be numeric.");
            return;
        }
        if (namaMentor.isEmpty() || nidnmntr.isEmpty() || noTlpMentor.isEmpty() || pwMentor.isEmpty()
                || confPasswordMentor.isEmpty()
                || email_Mentor.isEmpty() || tlMentor.isEmpty()) {
            showAlert(AlertType.ERROR, "Form Error!", "Please fill in all required fields.");
            return;
        }

        if (!pwMentor.equals(confPasswordMentor)) {
            showAlert(AlertType.ERROR, "Password Error!", "Password and Confirm Password must be the same");
            return;
        }
        if (!isPasswordValid(pwMentor)) {
            showAlert(AlertType.ERROR, "Password Error!",
                    "Password must be at least 8-12 characters and include at least one uppercase letter, one lowercase letter, and one number.");
            return;
        }

        if (!isValidPhoneNumber(noTlpMentor)) {
            showAlert(AlertType.ERROR, "Phone Number Error!",
                    "Phone number must start with '08' or '62' and be between 8 to 11 digits.");
            return;
        }

        if (!email_Mentor.endsWith("@gmail.com")) {
            showAlert(AlertType.ERROR, "Email Error!", "Please use a Gmail account for registration.");
            return;
        }

        // Save account data to CSV
        saveAccountData(namaMentor, job, nidnmntr, pwMentor, email_Mentor, jenisKelaminMentor, noTlpMentor, tlMentor);

        showAlert(AlertType.INFORMATION, "Registration Successful!",
                "Congratulations, Your signup was successful, Get ready to explore, learn, and contribute.");
        switchToHomePageMentor();
    }

    private void saveAccountData(String namaMentor, String job, String nidnmntr, String pwMentor, String email_Mentor,
            String jenisKelaminMentor, String noTlpMentor, String tlMentor) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("dataMentor.csv", true))) {
            writer.printf("%s,%s,%s,%s,%s,%s,%s,%s%n", namaMentor, job, nidnmntr, pwMentor, email_Mentor,
                    jenisKelaminMentor, noTlpMentor, tlMentor);
        } catch (IOException e) {
            showAlert(AlertType.ERROR, "File Error!", "An error occurred while saving account data.");
        }
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

    private void switchToHomePageMentor() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("halamanmentor.fxml"));
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
