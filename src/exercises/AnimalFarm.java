package exercises;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	
	AnimalFarm() {
		/* 1. Ask the user which animal they want, then play the sound of that animal. */

		/* 2. Make it so that the user can keep entering new animals. */
			
		for (int i = 0; i < 6; i++) {
		String question = JOptionPane.showInputDialog("Which animal you want to play sound?? cow,duck,dog,cat,lama,pig");
		
		if (question.equals("cow")) {
			playMoo();
		}
		else if (question.equals("duck")) {
			playQuack();
		}
		else if (question.equals("dog")) {
			playWoof();
		}
		else if (question.equals("meow")) {
			playMeow();
		}
		else if (question.equals("lama")) {
			playLama();
		}
		else if (question.equals("oink")) {
			playOink();
		}
	
		}
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	
	void playMeow () {
		playNoise(meowFile);
	}
	
	void playLama () {
		playNoise(llamaFile);
	}
	
	void playOink () {
		playNoise(oinkFile);
	}

	String quackFile = "sound/quack.wav";
	String mooFile = "sound/moo.wav";
	String woofFile = "sound/woof.wav";
	String meowFile = "sound/meow.wav";
	String llamaFile = "sound/llama.wav";
	String oinkFile = "sound/oink.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
