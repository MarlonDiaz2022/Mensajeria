package controlador;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

	
public class P_chatgeneralController {
	

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TextArea txtEscribirmensaje;

	    @FXML
	    void atrasbutton(ActionEvent event) {

	    }

	    @FXML
	    void enviarmensajebutton(ActionEvent event) {

	    }

	    @FXML
	    void initialize() {
	        assert txtEscribirmensaje != null : "fx:id=\"txtEscribirmensaje\" was not injected: check your FXML file 'P_chatgeneral.fxml'.";

	    }
	
	
	

}
