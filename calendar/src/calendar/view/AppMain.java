package calendar.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("calendar.fxml"));
		Scene scene = new Scene(root); //scene을 만든다
		stage.setTitle("달력"); // scene에 타이틀을 넣는다
		stage.setScene(scene);
		stage.show();
		
	}

}
