package optional;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot robot = new Robot ();
	

	void go() {
		
		robot.setSpeed(20);

		robot.setPenWidth(5);
		
		for (int i = 0; i <4; i++) {
			
			robot.setRandomPenColor();
				drawSquare();
				robot.turn(90);
		}

	}

	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		robot.penDown();
		for (int i = 0; i < 4; i++) {
			
			robot.move(50);
			robot.turn(90);			
		}

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
