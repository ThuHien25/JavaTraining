package Adapter;
/**
 * @author ThuHien
 * Use the AudioPlayer to play different types of audio formats such as mp3, mp4, VLC.
 */

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "Blank-Space.mp3");
		audioPlayer.play("mp4", "Happy.mp4");
		audioPlayer.play("VLC", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}

}
