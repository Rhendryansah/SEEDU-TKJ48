package code;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class logout implements Initializable {

    @FXML
    private ImageView logoImage;

    @FXML
    private Label logoutTitle;

    @FXML
    private Label logoutMessage;

    @FXML
    private Button cancelButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Label orLabel;

    @FXML
    private Hyperlink homeLink;

    @FXML
    void initialize() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    void handleCancelButton() {
    }

    @FXML
    void handleLogoutButton() {
    }

    @FXML
    void handleHomeLink() {
    }
}