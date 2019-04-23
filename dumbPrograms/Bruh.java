package dumbPrograms;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.embed.swing.JFXPanel;


public class Bruh{
	public static void main(String[] args) {
		final JFXPanel fxPanel = new JFXPanel();
		String uriString = new File("/Users/Pannu/Desktop/Bruh-sound-effect.mp3").toURI().toString();
	    MediaPlayer player = new MediaPlayer( new Media(uriString));
	    player.play();
	}
}