package code;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ujianPOVMentor implements Initializable {

    @FXML
    private Button btnTambahOpsi;

    @FXML
    private Button btnTambahSoal;

    @FXML
    private Button btnBatal;

     @FXML
    void initialize() {
        btnTambahOpsi.setOnAction(event -> handleButton());
        btnTambahSoal.setOnAction(event -> handleButton());
        btnBatal.setOnAction(event -> handleButton());
    }

    @FXML
    void handleButton() {
       
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}