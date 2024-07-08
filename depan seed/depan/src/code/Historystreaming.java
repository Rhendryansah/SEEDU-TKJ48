package code;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.MediaView;

public class Historystreaming implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonBeranda;

    @FXML
    private VBox chaptersBox;

    @FXML
    private TextArea descriptionArea;

    @FXML
    private ToggleButton fullscreenButton;

    @FXML
    private MediaView mediaView;

    @FXML
    private Button playPauseButton;

    @FXML
    private HBox relatedVideosBox;

    @FXML
    private Label timeLabel;

    @FXML
    private Slider timeSlider;

    @FXML
    void handleButtonBeranda(ActionEvent event) {

    }

    @FXML
    void toggleFullscreen(ActionEvent event) {

    }

    @FXML
    void togglePlayPause(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }

}
