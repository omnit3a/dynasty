package src;

import java.io.File;

import javax.sound.sampled.*;

public class musicStuff {
	
	public void playMusic(String musicLocation) {
		try {
			File musicPath = new File(musicLocation);
			
			if (musicPath.exists()) {
				
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				
				clip.loop(Clip.LOOP_CONTINUOUSLY);
			} else {
				System.out.println("Can't play music");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public void playSound(String musicLocation) {
		try {
			File musicPath = new File(musicLocation);
			
			if (musicPath.exists()) {
				
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
			} else {
				System.out.println("Can't play music");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
