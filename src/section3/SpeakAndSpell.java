package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		String word = "but can u do this";
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("Spell " + word);
		// 2. Catch the user's answer in a String
		String answer = JOptionPane.showInputDialog(null, "How is it spelled?");
		// 3. If the user spelled the word correctly, speak "correct"
		if(answer.equalsIgnoreCase(word)) {
			speak("Correct! Approved by your mom");
		}
		// 4. Otherwise say "wrong"
		else {
			speak("Wrong. You will be banished to the shadow realm.");
		}
		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


