package calendar.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class ScheduleController implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {	
	}

	@FXML
	private HBox pane;
	
    @FXML
    private Button btnSave;
    
    @FXML
    private DatePicker date;
    
    @FXML
    private TextField schedule;
    
    @FXML
    private TextArea memo;
    
	@FXML
    void saveclcik(ActionEvent event) throws IOException {
		
//		CalDO cal = new CalDO();
//    	cal.setSnidate(date.getValue().toString());
//    	cal.setSchedule(schedule.getText());
//    	cal.setMemo(memo.getText());
//    	
//    	CalDAO dao = new CalDAO();
//    	dao.insert(cal);
//    	System.out.println("등록처리됨");
//		pane.close();

	}
	
	
}
