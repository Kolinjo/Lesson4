package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class EmailSender {

	void go() {
		/*
		 * Use the methods below to send an email and print a warning if the email did
		 * not send correctly.
		 */
		
		String email = JOptionPane.showInputDialog("Enter email address of the recipient:");

		setEmailAddress(email);
		
		String message = JOptionPane.showInputDialog("Enter some message:");
		
		if (send(message)) {
			JOptionPane.showMessageDialog(null, "Email was successfully sent.");
		}else {
			JOptionPane.showMessageDialog(null, "Email was not successfully sent");
		}
	}

		

	/* Returns true if email was sent successfully, false if it failed to send. */
	boolean send(String greeting) {
		if (this.emailAddress.isBlank()) {
			System.err.println("You did not provide a recipient for the email!");
			return false;
		}
		return new Random().nextBoolean();
	}

	private String emailAddress = "";

	void setEmailAddress(String email) {
		this.emailAddress = email;
	}

	public static void main(String[] args) {
		new EmailSender().go();
	}
}
