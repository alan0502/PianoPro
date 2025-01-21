package finalproject;

import java.io.IOException;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class practice implements EventHandler<KeyEvent>{
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
	public AnchorPane abc;
	@FXML
	public Pane one;
	@FXML
	public Pane two;
	@FXML
	public Pane three;
	@FXML
	public Pane four;
	@FXML
	public Pane five;
	@FXML
	public Pane six;
	@FXML
	public Pane seven;
	@FXML
	public Pane eight;
	public void gopressed() throws IOException {
		Parent choose = FXMLLoader.load(getClass().getResource("choosemusic.fxml"));
		Scene chooseScene = new Scene(choose);
		chooseScene.getRoot().requestFocus();
		Main.currentStage.setScene(chooseScene);
	}
	@Override
	public void handle(KeyEvent key) {
		Rectangle[] arr = {c,d,e,f,g,a,b,cc};
		if(key.getCode() == KeyCode.A) {
			c.setFill(Color.GRAY);
			d.setFill(Color.WHITE);
			e.setFill(Color.WHITE);
			f.setFill(Color.WHITE);
			g.setFill(Color.WHITE);
			a.setFill(Color.WHITE);
			b.setFill(Color.WHITE);
			cc.setFill(Color.WHITE);
			one.setVisible(true);
			two.setVisible(false);
			three.setVisible(false);
			four.setVisible(false);
			five.setVisible(false);
			six.setVisible(false);
			seven.setVisible(false);
			eight.setVisible(false);
			Media mp3 = new Media( getClass(). getResource("pianoC.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		else if(key.getCode() == KeyCode.S) {
			d.setFill(Color.GRAY);
			c.setFill(Color.WHITE);
			e.setFill(Color.WHITE);
			f.setFill(Color.WHITE);
			g.setFill(Color.WHITE);
			a.setFill(Color.WHITE);
			b.setFill(Color.WHITE);
			cc.setFill(Color.WHITE);
			one.setVisible(false);
			two.setVisible(true);
			three.setVisible(false);
			four.setVisible(false);
			five.setVisible(false);
			six.setVisible(false);
			seven.setVisible(false);
			eight.setVisible(false);
			Media mp3 = new Media( getClass(). getResource("pianoD.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		else if(key.getCode() == KeyCode.D) {
			e.setFill(Color.GRAY);
			d.setFill(Color.WHITE);
			c.setFill(Color.WHITE);
			f.setFill(Color.WHITE);
			g.setFill(Color.WHITE);
			a.setFill(Color.WHITE);
			b.setFill(Color.WHITE);
			cc.setFill(Color.WHITE);
			one.setVisible(false);
			two.setVisible(false);
			three.setVisible(true);
			four.setVisible(false);
			five.setVisible(false);
			six.setVisible(false);
			seven.setVisible(false);
			eight.setVisible(false);
			Media mp3 = new Media( getClass(). getResource("pianoE.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		else if(key.getCode() == KeyCode.F) {
			f.setFill(Color.GRAY);
			d.setFill(Color.WHITE);
			e.setFill(Color.WHITE);
			c.setFill(Color.WHITE);
			g.setFill(Color.WHITE);
			a.setFill(Color.WHITE);
			b.setFill(Color.WHITE);
			cc.setFill(Color.WHITE);
			one.setVisible(false);
			two.setVisible(false);
			three.setVisible(false);
			four.setVisible(true);
			five.setVisible(false);
			six.setVisible(false);
			seven.setVisible(false);
			eight.setVisible(false);
			Media mp3 = new Media( getClass(). getResource("pianoF.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		else if(key.getCode() == KeyCode.G) {
			g.setFill(Color.GRAY);
			d.setFill(Color.WHITE);
			e.setFill(Color.WHITE);
			f.setFill(Color.WHITE);
			c.setFill(Color.WHITE);
			a.setFill(Color.WHITE);
			b.setFill(Color.WHITE);
			cc.setFill(Color.WHITE);
			one.setVisible(false);
			two.setVisible(false);
			three.setVisible(false);
			four.setVisible(false);
			five.setVisible(true);
			six.setVisible(false);
			seven.setVisible(false);
			eight.setVisible(false);
			Media mp3 = new Media( getClass(). getResource("pianoG.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		else if(key.getCode() == KeyCode.H) {
			a.setFill(Color.GRAY);
			d.setFill(Color.WHITE);
			e.setFill(Color.WHITE);
			f.setFill(Color.WHITE);
			g.setFill(Color.WHITE);
			c.setFill(Color.WHITE);
			b.setFill(Color.WHITE);
			cc.setFill(Color.WHITE);
			one.setVisible(false);
			two.setVisible(false);
			three.setVisible(false);
			four.setVisible(false);
			five.setVisible(false);
			six.setVisible(true);
			seven.setVisible(false);
			eight.setVisible(false);
			Media mp3 = new Media( getClass(). getResource("pianoA.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		else if(key.getCode() == KeyCode.J) {
			b.setFill(Color.GRAY);
			d.setFill(Color.WHITE);
			e.setFill(Color.WHITE);
			f.setFill(Color.WHITE);
			g.setFill(Color.WHITE);
			a.setFill(Color.WHITE);
			c.setFill(Color.WHITE);
			cc.setFill(Color.WHITE);
			one.setVisible(false);
			two.setVisible(false);
			three.setVisible(false);
			four.setVisible(false);
			five.setVisible(false);
			six.setVisible(false);
			seven.setVisible(true);
			eight.setVisible(false);
			Media mp3 = new Media( getClass(). getResource("pianoB.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		else if(key.getCode() == KeyCode.K) {
			cc.setFill(Color.GRAY);
			d.setFill(Color.WHITE);
			e.setFill(Color.WHITE);
			f.setFill(Color.WHITE);
			g.setFill(Color.WHITE);
			a.setFill(Color.WHITE);
			b.setFill(Color.WHITE);
			c.setFill(Color.WHITE);
			one.setVisible(false);
			two.setVisible(false);
			three.setVisible(false);
			four.setVisible(false);
			five.setVisible(false);
			six.setVisible(false);
			seven.setVisible(false);
			eight.setVisible(true);
			Media mp3 = new Media( getClass(). getResource("pianoC2.mp3").toExternalForm() );
			MediaPlayer player = new MediaPlayer( mp3 );
			abc.getChildren().add( new MediaView( player ) );
			player.play();
		}
		
	}
	public void exitpressed() {
		Main.currentStage.close();
	}		
}
