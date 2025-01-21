package finalproject;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class choosemusic implements EventHandler<KeyEvent>, Initializable{
	int columnIndex = 0;
	String[] song = {"beegame", "stargame", "donkeygame"};
	@FXML
	public Pane determine;
	@FXML
	public Label beename;
	@FXML
	public Label starname;
	@FXML
	public Label thirdname;
	@FXML
	public Text name;
	@FXML
	public ImageView star1;
	@FXML
	public ImageView star2;
	@FXML
	public ImageView star3;
	@FXML
	public ImageView beecheck;
	@FXML
	public ImageView starcheck;
	@FXML
	public ImageView donkeycheck;
	@Override
	public void handle(KeyEvent e) {

		if(e.getCode() == KeyCode.LEFT&&columnIndex > 0) {
			columnIndex--;
		}
		else if(e.getCode() == KeyCode.RIGHT&&columnIndex <2) {
			columnIndex++;
		}
		else if(e.getCode() == KeyCode.SPACE) {
			Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource(song[columnIndex]+".fxml"));
				Scene scene = new Scene(root);
				Main.currentStage.setScene(scene);
				scene.getRoot().requestFocus();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		walk();
		runname();
	}
	public void walk() {
		GridPane.setColumnIndex(determine, columnIndex);
	}
	public void runname() {
		if(columnIndex == 0) {
			beename.setVisible(true);
			starname.setVisible(false);
			thirdname.setVisible(false);
			star1.setVisible(true);
			star2.setVisible(false);
			star3.setVisible(false);
		}
		else if(columnIndex == 1){
			beename.setVisible(false);
			starname.setVisible(true);
			thirdname.setVisible(false);
			star1.setVisible(true);
			star2.setVisible(true);
			star3.setVisible(false);
		}
		else if(columnIndex == 2) {
			beename.setVisible(false);
			starname.setVisible(false);
			thirdname.setVisible(true);
			star1.setVisible(true);
			star2.setVisible(true);
			star3.setVisible(true);
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		name.setText(Main.name);
		beename.setVisible(true);
		star1.setVisible(true);
		star2.setVisible(false);
		star3.setVisible(false);
		if(Main.beewin == 1) {
			beecheck.setVisible(true);
		}
		if(Main.starwin == 1) {
			starcheck.setVisible(true);
		}
		if(Main.donkeywin == 1) {
			donkeycheck.setVisible(true);
		}
	}
	public void exitpressed() {
		Main.currentStage.close();
	}		
}