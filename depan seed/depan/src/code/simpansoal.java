package code;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class simpansoal implements Initializable {

    @FXML
    private ImageView successIcon;

    @FXML
    private Label confirmationTitle;

    @FXML
    private Label pertanyaanLabel;

    @FXML
    private Label pertanyaanContent;

    @FXML
    private Label modulLabel;

    @FXML
    private Label modulContent;

    @FXML
    private Label kesulitanLabel;

    @FXML
    private Label kesulitanContent;

    @FXML
    private Button btnTambahSoal;

    @FXML
    private Button btnKembali;

    @FXML
    void initialize() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}