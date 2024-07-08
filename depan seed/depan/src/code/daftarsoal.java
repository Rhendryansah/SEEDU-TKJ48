package code;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class daftarsoal implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCari;

    @FXML
    private Button btnTambahSoal;

    @FXML
    private TableColumn<?, ?> daftarAksi;

    @FXML
    private TableColumn<?, ?> daftarModul;

    @FXML
    private TableColumn<?, ?> daftarNo;

    @FXML
    private TableColumn<?, ?> daftarPertanyaan;

    @FXML
    private TableColumn<?, ?> daftarTingkatKesulitan;

    @FXML
    private TableView<?> tabelDaftarSoal;

    @FXML
    private TextField tfCariSoal;

    @FXML
    void initialize() {
        
    }
     
    @FXML
    void ButtonCariAction(ActionEvent event) {

    }

    @FXML
    void ButtonTambahSoalAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
