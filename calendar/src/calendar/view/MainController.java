package calendar.view;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	
	Label[] lableList;
	HBox[] hboxList;
	
	@FXML private TextField yearTop;
	
	@FXML
    private HBox HBox;
    
    @FXML
    private Label Label0,Label1,Label2,Label3, Label4,Label5,Label6,Label7,Label8,Label9,
    			  Label10,Label11,Label12,Label13,Label14,Label15,Label16,Label17,Label18,
    			  Label19,Label20,Label21,Label22,Label23,Label24,Label25,Label26,Label27,
    			  Label28,Label29,Label30,Label31,Label32,Label33,Label34,
    			  Label001,Label002,Label011,Label012,Label021,Label022,
    			  Label031,Label032,Label041,Label042,Label051,Label052,
    			  Label061,Label062,
    			  Label101,Label102,Label111,Label112,Label121,Label122,
    			  Label131,Label132,Label141,Label142,Label151,Label152,
    			  Label161,Label162,
    			  Label201,Label202,Label211,Label212,Label221,Label222,
    			  Label231,Label232,Label241,Label242,Label251,Label252,
    			  Label261,Label262,
    			  Label301,Label302,Label311,Label312,Label321,Label322,
    			  Label331,Label332,Label341,Label342,Label351,Label352,
    			  Label361,Label362,
    			  Label401,Label402,Label411,Label412,Label421,Label422,
    			  Label431,Label432,Label441,Label442,Label451,Label452,
    			  Label461,Label462; 

    @FXML
    private VBox VBox0,
    			 VBox00,VBox01,VBox02,VBox03,VBox04,VBox05,VBox06,
    			 VBox10,VBox11,VBox12,VBox13,VBox14,VBox15,VBox16,
    			 VBox20,VBox21,VBox22,VBox23,VBox24,VBox25,VBox26,
    			 VBox30,VBox31,VBox32,VBox33,VBox34,VBox35,VBox36,
    			 VBox40,VBox41,VBox42,VBox43,VBox44,VBox45,VBox46;

    @FXML
    private Button previous,next, addSchedule;
    
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
	void listclick(MouseEvent mouseEvent) throws IOException {
    	Parent add = FXMLLoader.load(getClass().getResource("list.fxml"));
    	Scene scene = new Scene(add);
    	Stage adding = new Stage();
    	
    	adding.setScene(scene);
    	adding.show();
		
	}
	
	Calendar cal = Calendar.getInstance(); 
	Date date = cal.getTime(); 
	int year = cal.get(Calendar.YEAR); 
	int month = cal.get(Calendar.MONTH);
	int day = cal.get(Calendar.DATE);
	
}
