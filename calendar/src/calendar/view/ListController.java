package calendar.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ListController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
	}
	
	@FXML
	private Button btninsert, btndelete;
	
	@FXML
    void addclick(ActionEvent event) throws IOException {
    	//새창 
    	Parent add = FXMLLoader.load(getClass().getResource("schedule.fxml"));
    	Scene scene = new Scene(add);
    	
    	Stage adding = new Stage();
    	
    	adding.setScene(scene);
    	adding.showAndWait();
	}
	
	@FXML
    void delclick(ActionEvent event) throws IOException {
		
	}
	
	
	
}
