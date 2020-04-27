package calendar.view;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javax.rmi.CORBA.Util;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainController implements Initializable {

	@FXML
	private Button btnPrev;
	@FXML
	private Button btnNext;
	@FXML
	private Label lblDate;
	@FXML
	private Label lblDay;
	
	@FXML
	private Label loginInfo;
	
	
	@FXML
	private GridPane gridCalendar;
	
	public void logout() {
	}
	
	public void prevMonth() {	
	}
	
	public void nextMonth() {
	}
	
	private List<DayController> dayList;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		dayList = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) { //달력의 행
			for(int j = 0; j < 7; j++) { //달력의 열
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("DayLayout.fxml"));
				try {
					AnchorPane ap = loader.load();
					gridCalendar.add(ap, j, i);
					DayController dc = loader.getController();
					dc.setRoot(ap);
					dayList.add(dc);
				} catch (Exception e) {
					e.printStackTrace();
					System.out.printf("j : %d, i : %d 번째 그리는 중 오류 발생\n", j, i);
				}
			}
			
		}
	}

	
	
	@FXML
	private Button previous, next, addSchedule;

	@FXML
	void addclick(ActionEvent event) throws IOException {
		// 새창
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
	
	public void loadMonthData(YearMonth ym) {
		LocalDate calendarDate = LocalDate.of(ym.getYear(), ym.getMonthValue(), 1); //해당 년월의 1일을 가져온다.
		while(!calendarDate.getDayOfWeek().toString().equals("SUNDAY")) { //일요일이 아닐때까지 하루씩 빼간다.
			calendarDate = calendarDate.minusDays(1); //하루씩 감소
		}
		//여기까지 오면 해당주간의 첫째날이 오게된다. 여기서부터 캘린더를 그리기 시작한다.
		
		for(DayController day : dayList) {
			day.setDayLabel(calendarDate);
			calendarDate = calendarDate.plusDays(1); //하루씩 증가
			day.setCountLabel(0); //처음은 무조건 0으로 고정한다.
		}
	}

}
