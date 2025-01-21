package finalproject;
import javafx.scene.shape.Rectangle;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.embed.swing.JFXPanel;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
public class beegame implements EventHandler<KeyEvent>, Initializable {
	@FXML
	public Rectangle c;
	@FXML
	public Rectangle d;
	@FXML
	public Rectangle e;
	@FXML
	public Rectangle f;
	@FXML
	public Rectangle g;
	@FXML
	public Rectangle a;
	@FXML
	public Rectangle b;
	@FXML
	public Rectangle cc;
	@FXML
	public Label end;
	@FXML
	public Button next;
	@FXML
	public ImageView bee1;
	@FXML
	public ImageView bee2;
	@FXML
	public ImageView bee3;
	@FXML
	public Label lose;
	@FXML
	public AnchorPane abc;
	@FXML
	public ImageView one;
	@FXML
	public ImageView two;
	@FXML
	public ImageView three;
	@FXML
	public ImageView four;
	Rectangle[] rhythm = new Rectangle[8];
	int[] beesong = {5,3,3,4,2,2,1,2,3,4,5,5,5,5,3,3,4,2,2,1,3,5,5,3,2,2,2,2,2,3,4,3,3,3,3,3,4,5,5,3,3,4,2,2,1,3,5,5,1};
	int i=0;
	@FXML
	public void nextpressed() throws IOException {
		Main.beewin = 1;
		Main.winnumber +=1;
		Parent rank = FXMLLoader.load(getClass().getResource("rank.fxml"));
		Scene rankScene = new Scene(rank);
		rankScene.getRoot().requestFocus();
		Main.currentStage.setScene(rankScene);
	}
	@FXML
	public void backpressed() throws IOException {
		Parent choose = FXMLLoader.load(getClass().getResource("choosemusic.fxml"));
		Scene chooseScene = new Scene(choose);
		chooseScene.getRoot().requestFocus();
		Main.currentStage.setScene(chooseScene);
	}
	@Override
	public void handle(KeyEvent key) {
		int chance = 3;
		if(key.getCode() == KeyCode.A) {
			Media mp3 = new Media( getClass(). getResource("pianoC.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		else if(key.getCode() == KeyCode.S) {
			Media mp3 = new Media( getClass(). getResource("pianoD.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		else if(key.getCode() == KeyCode.D) {
			Media mp3 = new Media( getClass(). getResource("pianoE.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		else if(key.getCode() == KeyCode.F) {
			Media mp3 = new Media( getClass(). getResource("pianoF.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		else if(key.getCode() == KeyCode.G) {
			Media mp3 = new Media( getClass(). getResource("pianoG.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		else if(key.getCode() == KeyCode.H) {
			Media mp3 = new Media( getClass(). getResource("pianoA.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		else if(key.getCode() == KeyCode.J) {
			Media mp3 = new Media( getClass(). getResource("pianoB.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		else if(key.getCode() == KeyCode.K) {
			Media mp3 = new Media( getClass(). getResource("pianoC2.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		if(key.getCode() == KeyCode.A && beesong[i] == 1) {
			tips();
		}
		else if(key.getCode() == KeyCode.S && beesong[i] == 2) {
			tips();
		}
		else if(key.getCode() == KeyCode.D && beesong[i] == 3) {
			tips();
		}
		else if(key.getCode() == KeyCode.F && beesong[i] == 4) {
			tips();
		}
		else if(key.getCode() == KeyCode.G && beesong[i] == 5) {
			tips();
		}
		else if(key.getCode() == KeyCode.H && beesong[i] == 6) {
			tips();
		}
		else if(key.getCode() == KeyCode.J && beesong[i] == 7) {
			tips();
		}
		else if(key.getCode() == KeyCode.K && beesong[i] == 8) {
			tips();
		}
		else {
			if(bee3.isVisible() && i+1 < beesong.length) {
				bee3.setVisible(false);
				chance = 2;
			}
			else if(bee2.isVisible() && i+1 < beesong.length){
				bee2.setVisible(false);
				chance = 1;
			}
			else if(bee1.isVisible() && i+1 < beesong.length){
				bee1.setVisible(false);
			}
		}
		if(bee1.isVisible() == false && i+1 < beesong.length) {
			lose.setVisible(true);
			c.setFill(Color.WHITE);
			d.setFill(Color.WHITE);
			e.setFill(Color.WHITE);
			f.setFill(Color.WHITE);
			g.setFill(Color.WHITE);
			a.setFill(Color.WHITE);
			b.setFill(Color.WHITE);
			cc.setFill(Color.WHITE);
		}
	}
	public void tips(){
		rhythm[beesong[i]-1].setFill(Color.WHITE);
		if(i+1 == 13) {
			one.setVisible(false);
			two.setVisible(true);
		}
		if(i+1 == 24) {
			two.setVisible(false);
			three.setVisible(true);
		}
		if(i+1 == 38) {
			three.setVisible(false);
			four.setVisible(true);
		}
		if(i+1 == beesong.length) {
			end.setVisible(true);
			next.setVisible(true);
		}
		if(i+1 < beesong.length) {
			if(beesong[i+1] == 1) {
				c.setFill(Color.RED);
				i = i + 1;
			}
			else if(beesong[i+1] == 2) {
				d.setFill(Color.RED);
				i = i + 1;
			}
			else if(beesong[i+1] == 3) {
				e.setFill(Color.RED);
				i = i + 1;
			}
			else if(beesong[i+1] == 4) {
				f.setFill(Color.RED);
				i = i + 1;
			}
			else if(beesong[i+1] == 5) {
				g.setFill(Color.RED);
				i = i + 1;
			}
			else if(beesong[i+1] == 6) {
				a.setFill(Color.RED);
				i = i + 1;
			}
			else if(beesong[i+1] == 7) {
				b.setFill(Color.RED);
				i = i + 1;
			}
			else if(beesong[i+1] == 8) {
				cc.setFill(Color.RED);
				i = i + 1;
			}
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		g.setFill(Color.RED);
		Rectangle[] arr = {c,d,e,f,g,a,b,cc};
		for(int i=0;i<arr.length;i++) {
			rhythm[i] = arr[i];
		}
	}
}