package code;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;

public class pilihanlogin {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button tombolBackDepan;

    @FXML
    void initialize() {
        tombolBackDepan.setOnAction(event -> backToHome());
    }

    @FXML
    void backToHome() {
        switchToPilihLogin();
    }

    private void switchToPilihLogin() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("depanseedu.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) tombolBackDepan.getScene().getWindow();
            stage.setScene(new Scene(root, 1550, 800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void loginAsMentor(MouseEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("loginpageMentor.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void loginAsPeserta(MouseEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("loginpage.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root, 1550, 800);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
