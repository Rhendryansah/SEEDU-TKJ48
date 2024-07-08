package code;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class abisujian implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backToDashboard;

    @FXML
    private PieChart pieChartProgress;

    @FXML
    private Button tinjauJawaban;

    @FXML
    private Button unduhSertif;

    @FXML
    void initialize() {
        backToDashboard.setOnAction(event -> handleBackToDashboard());
        tinjauJawaban.setOnAction(event -> handleTinjauJawaban());
        unduhSertif.setOnAction(event -> handleUnduhSertif());
    }

    @FXML
    void handleBackToDashboard() {
        switchToDashboard();
    }

    private void switchToDashboard() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("homepeserta.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) backToDashboard.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleTinjauJawaban() {
        switchToTinjau();
    }

    private void switchToTinjau() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) tinjauJawaban.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleUnduhSertif() {
        switchToUnduhSertif();
    }

    private void switchToUnduhSertif() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(".fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) unduhSertif.getScene().getWindow();
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
