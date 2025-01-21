package finalproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class rank implements Initializable {
	@FXML
	public ImageView bee;
	@FXML
	public ImageView star;
	@FXML
	public ImageView donkey;
	@FXML
	public Label finish;
	@FXML
	public Text name;
	@FXML
	public Label keepgoing;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		name.setText(Main.name);
		if(Main.beewin == 1) {
			bee.setVisible(true);
			System.out.println("hi");
		}
		if(Main.starwin == 1) {
			star.setVisible(true);
			System.out.println("h1");
		}
		if(Main.donkeywin == 1) {
			donkey.setVisible(true);
		}
		if(Main.beewin == 1 && Main.starwin == 1 && Main.donkeywin == 1) {
			finish.setVisible(true);
			keepgoing.setVisible(false);
		}
	}
	public void exitpressed() {
		Main.currentStage.close();
	}
	@FXML
	public void backpressed() throws IOException {
		Parent choose = FXMLLoader.load(getClass().getResource("choosemusic.fxml"));
		Scene chooseScene = new Scene(choose);
		chooseScene.getRoot().requestFocus();
		Main.currentStage.setScene(chooseScene);
	}
}