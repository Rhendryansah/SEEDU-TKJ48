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
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class lanjutPelatihan implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBeranda;

    @FXML
    private Button buttonPelatihan;

    @FXML
    private Button btnSubmit;

    @FXML
    private RadioButton opsiA;

    @FXML
    private RadioButton opsiB;

    @FXML
    private RadioButton opsiC;

    @FXML
    private RadioButton opsiD;

    @FXML
    void handleButtonberanda(ActionEvent event) {

         switchToBeranda();
    }
    private void switchToBeranda(){
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("homepeserta.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) btnBeranda.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @FXML
    void handleButtonPelatihan(ActionEvent event) {
        switchToPelatihan();
    }

    private void switchToPelatihan() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("halamanpelatihan.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonPelatihan.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void handleOpsiA(ActionEvent event) {

    }

    @FXML
    void handleOpsiB(ActionEvent event) {

    }

    @FXML
    void handleOpsiC(ActionEvent event) {

    }

    @FXML
    void handleOpsiD(ActionEvent event) {

    }

    @FXML
    void handleSubmit(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }

}
