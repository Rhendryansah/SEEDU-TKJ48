package code;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class KelolaPelatihan implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> CBModul;

    @FXML
    private Button buttonArtikel;

    @FXML
    private RadioButton rbOpsiA;

    @FXML
    private RadioButton rbOpsiB;

    @FXML
    private RadioButton rbOpsiC;

    @FXML
    private RadioButton rbOpsiD;

    @FXML
    private Button buttonBatal;

    @FXML
    private Button buttonLihatDetail;

    @FXML
    private Button buttonBeranda;

    @FXML
    private Button buttonKeluar;

    @FXML
    private Button buttonProfil;

    @FXML
    private Button buttonSimpanSoal;

    @FXML
    private TextField opsiA;

    @FXML
    private TextField opsiB;

    @FXML
    private TextField opsiC;

    @FXML
    private TextField opsiD;

    @FXML
    private TextArea penjelasan;

    @FXML
    private TextArea pertanyaanSoal;

    @FXML
    private TableView<Question> tabelDaftarSoal;

    @FXML
    private TableColumn<Question, String> kolomPertanyaan;

    @FXML
    private TableColumn<Question, String> kolomOpsiA;

    @FXML
    private TableColumn<Question, String> kolomOpsiB;

    @FXML
    private TableColumn<Question, String> kolomOpsiC;

    @FXML
    private TableColumn<Question, String> kolomOpsiD;

    @FXML
    private TableColumn<Question, String> kolomPenjelasan;

    private ObservableList<Question> questionList;

    @FXML
    void handleButtonArtikel(ActionEvent event) {
        switchToArtikel();
    }

    private void switchToArtikel() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("artikelMentor.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonArtikel.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonBatal(ActionEvent event) {
        clearFields();
    }

    private void clearFields() {
        opsiA.clear();
        opsiB.clear();
        opsiC.clear();
        opsiD.clear();
        penjelasan.clear();
        pertanyaanSoal.clear();
    }

    @FXML
    void handleButtonBeranda(ActionEvent event) {
        switchToBeranda();
    }

    private void switchToBeranda() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("halamanmentor.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonBeranda.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonKeluar(ActionEvent event) {
        switchToKeluar();
    }

    private void switchToKeluar() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("depanseedu.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonKeluar.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonProfil(ActionEvent event) {
        switchToProfil();
    }

    private void switchToProfil() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("profilementor.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonProfil.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleButtonSimpanSoal(ActionEvent event) {
        saveQuestion();
    }

    private void saveQuestion() {
        String pertanyaan = pertanyaanSoal.getText();
        String opsiAText = opsiA.getText();
        String opsiBText = opsiB.getText();
        String opsiCText = opsiC.getText();
        String opsiDText = opsiD.getText();
        String penjelasanText = penjelasan.getText();

        if (!pertanyaan.isEmpty() && !opsiAText.isEmpty() && !opsiBText.isEmpty() && !opsiCText.isEmpty() && !opsiDText.isEmpty() && !penjelasanText.isEmpty()) {
            Question question = new Question(pertanyaan, opsiAText, opsiBText, opsiCText, opsiDText, penjelasanText);
            questionList.add(question);
            clearFields();
        }
    }

    @FXML
    void handleButtonLihatDetail(ActionEvent event) {
        // Add functionality to view details
    }

    @FXML
    void handleRBOpsiA(ActionEvent event) {
        // Add functionality for RadioButton A
    }

    @FXML
    void handleRBOpsiB(ActionEvent event) {
        // Add functionality for RadioButton B
    }

    @FXML
    void handleRBOpsiC(ActionEvent event) {
        // Add functionality for RadioButton C
    }

    @FXML
    void handleRBOpsiD(ActionEvent event) {
        // Add functionality for RadioButton D
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        questionList = FXCollections.observableArrayList();

        kolomPertanyaan.setCellValueFactory(new PropertyValueFactory<>("pertanyaan"));
        kolomOpsiA.setCellValueFactory(new PropertyValueFactory<>("opsiA"));
        kolomOpsiB.setCellValueFactory(new PropertyValueFactory<>("opsiB"));
        kolomOpsiC.setCellValueFactory(new PropertyValueFactory<>("opsiC"));
        kolomOpsiD.setCellValueFactory(new PropertyValueFactory<>("opsiD"));
        kolomPenjelasan.setCellValueFactory(new PropertyValueFactory<>("penjelasan"));

        tabelDaftarSoal.setItems(questionList);
    }
}
