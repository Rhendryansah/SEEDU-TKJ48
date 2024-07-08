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
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class homepelatihanataukuis implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnLanjutkan1;

    @FXML
    private Button btnLanjutkan2;

    @FXML
    private Button btnLanjutkan3;

    @FXML
    private Button btnLanjutkan4;

    @FXML
    private Button btnLanjutkan5;

    @FXML
    private Button buttonKembali;

    @FXML
    private TableView<?> deadlinesTable;

    @FXML
    private PieChart learningStats;

    @FXML
    void handleButtonKembali(ActionEvent event) {
              switchToKembali();
    }

    private void switchToKembali() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("halamanpelatihan.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) buttonKembali.getScene().getWindow();
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

}
