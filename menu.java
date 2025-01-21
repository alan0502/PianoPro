package finalproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class menu {
	@FXML
	public TextField name;
	@FXML
	public Label error;
	public void startpressed() throws IOException {
		if(name.getText().length() == 0 ) {
			error.setVisible(true);
			name.requestFocus();
		}
		else {
			Parent choose = FXMLLoader.load(getClass().getResource("practice.fxml"));
			Scene chooseScene = new Scene(choose);
			chooseScene.getRoot().requestFocus();
			Main.currentStage.setScene(chooseScene);
		}
		Main.name = name.getText();
	}
	public void exitpressed() {
		Main.currentStage.close();
	}
}
