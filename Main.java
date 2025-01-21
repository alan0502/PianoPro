package finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	public static Stage currentStage;
	public static Scene menuScene;
	public static int beewin = 0;
	public static int starwin = 0;
	public static int donkeywin = 0;
	public static String name;
	public static int winnumber = 0;
	@Override
	public void start(Stage primaryStage) throws Exception {
		currentStage = primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
		menuScene = new Scene(root);
		currentStage.setTitle("piano master");
		currentStage.setScene(menuScene);
		currentStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}