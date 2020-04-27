package calendar.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import calendar.model.CalDAO;
import calendar.model.CalDO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DailyController {

	@FXML
	private TextField yearTop;

//	@FXML
//	private Label 
//			Label0, Label1, Label2, Label3, Label4, Label5, Label6, Label7, Label8, Label9, Label10, Label11,
//			Label12, Label13, Label14, Label15, Label16, Label17, Label18, Label19, Label20, Label21, Label22, Label23,
//			Label24, Label25, Label26, Label27, Label28, Label29, Label30, Label31, Label32, Label33, Label34;

	Calendar cal = Calendar.getInstance();
	Date date = cal.getTime();
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH);
	int day = cal.get(Calendar.DATE);

	public void date() {

		yearTop.setText(year + "년 " + (month + 1) + "월");
		int totaldate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		int week = cal.get(Calendar.DAY_OF_WEEK);

		Label[] a = new Label[35];
		

		
////		월의 첫째날의 시작위치 지정. 
//		for (int i = 0; i < firstDay - 1; i++) {
//			System.out.print("    ");
//		}
//
////		7일씩 잘라서 출력. 
//
//		for (int i = 1; i <= days; i++) {
//			System.out.printf("%4d", i);
//			if ((firstDay - 1 + i) % 7 == 0)
//				System.out.println();
//		}
//
//	}
	
	}
}
