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
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainController implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	
	Label[] lableList;
	HBox[] hboxList;
	
	@FXML
    private HBox HBox;
    
    @FXML
    private Label Label000,Label001,Label002,Label010,Label011,Label012,Label020,Label021,Label022,
    			  Label030,Label031,Label032,Label040,Label041,Label042,Label050,Label051,Label052,
    			  Label060,Label061,Label062,
    			  Label100,Label101,Label102,Label110,Label111,Label112,Label120,Label121,Label122,
    			  Label130,Label131,Label132,Label140,Label141,Label142,Label150,Label151,Label152,
    			  Label160,Label161,Label162,
    			  Label200,Label201,Label202,Label210,Label211,Label212,Label220,Label221,Label222,
    			  Label230,Label231,Label232,Label240,Label241,Label242,Label250,Label251,Label252,
    			  Label260,Label261,Label262,
    			  Label300,Label301,Label302,Label310,Label311,Label312,Label320,Label321,Label322,
    			  Label330,Label331,Label332,Label340,Label341,Label342,Label350,Label351,Label352,
    			  Label360,Label361,Label362,
    			  Label400,Label401,Label402,Label410,Label411,Label412,Label420,Label421,Label422,
    			  Label430,Label431,Label432,Label440,Label441,Label442,Label40,Label451,Label452,
    			  Label460,Label461,Label462; 

    @FXML
    private VBox VBox00,VBox01,VBox02,VBox03,VBox04,VBox05,VBox06,
    			 VBox10,VBox11,VBox12,VBox13,VBox14,VBox15,VBox16,
    			 VBox20,VBox21,VBox22,VBox23,VBox24,VBox25,VBox26,
    			 VBox30,VBox31,VBox32,VBox33,VBox34,VBox35,VBox36,
    			 VBox40,VBox41,VBox42,VBox43,VBox44,VBox45,VBox46;

    @FXML
    private Button previous,next, addSchedule;
    
	@FXML
    void addclcik(ActionEvent event) throws IOException {
    	//새창 
    	Parent add = FXMLLoader.load(getClass().getResource("schedule.fxml"));
    	Scene scene = new Scene(add);
    	
    	Stage adding = new Stage();
    	
    	adding.setScene(scene);
    	adding.showAndWait();
	}
    
    

}
