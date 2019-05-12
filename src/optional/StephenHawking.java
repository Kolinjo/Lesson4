package optional;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class StephenHawking {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			String sentence = JOptionPane.showInputDialog("Enter some sentence :");
			speak(sentence);

			if (sentence.isEmpty()) {
				JOptionPane.showMessageDialog(null, "You did not enter any sentence.");
				System.exit(0);
			}
		}
	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
