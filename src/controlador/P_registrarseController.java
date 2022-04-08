package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class P_registrarseController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtClave;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNickname;

    @FXML
    void handleAgregarBtn(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtApellido != null : "fx:id=\"txtApellido\" was not injected: check your FXML file 'P_registrarse.fxml'.";
        assert txtClave != null : "fx:id=\"txtClave\" was not injected: check your FXML file 'P_registrarse.fxml'.";
        assert txtCorreo != null : "fx:id=\"txtCorreo\" was not injected: check your FXML file 'P_registrarse.fxml'.";
        assert txtEdad != null : "fx:id=\"txtEdad\" was not injected: check your FXML file 'P_registrarse.fxml'.";
        assert txtName != null : "fx:id=\"txtName\" was not injected: check your FXML file 'P_registrarse.fxml'.";
        assert txtNickname != null : "fx:id=\"txtNickname\" was not injected: check your FXML file 'P_registrarse.fxml'.";

    }

}
