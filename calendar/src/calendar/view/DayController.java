package calendar.view;

import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class DayController extends MasterController {
	
	@FXML
	private Label lblDay;
	@FXML
	private Label lblCount;
	
	private LocalDate date;
	
	public void setDayLabel(LocalDate date) {
		this.date = date;
		lblDay.setText(String.valueOf(date.getDayOfMonth()));
	}
	
	public void setCountLabel(Integer count) {
		lblCount.setText(count.toString());
	}


}
