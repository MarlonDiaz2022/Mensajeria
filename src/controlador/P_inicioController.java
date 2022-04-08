package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class P_inicioController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtClave;

    @FXML
    private TextField txtUsuario;

    @FXML
    void ingresarbutton(ActionEvent event) {
    	
    }

    @FXML
    void registrarseButton(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtClave != null : "fx:id=\"txtClave\" was not injected: check your FXML file 'P_inicio.fxml'.";
        assert txtUsuario != null : "fx:id=\"txtUsuario\" was not injected: check your FXML file 'P_inicio.fxml'.";

    }

}