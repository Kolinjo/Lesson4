package exercises;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
		
	Robot robot = new Robot ();
	
	void drawCircle () {
		robot.penDown();
		robot.setSpeed(50);
		robot.setPenWidth(5);
		
		for (int i = 0; i < 360; i++) {
			robot.move(1);
			robot.turn(1);
			
		}		
	}
	void drawSquare () {
		robot.penDown();
		robot.setSpeed(20);
		robot.setPenWidth(5);
		
		for (int i = 0; i < 4; i++) {
			robot.move(50);
			robot.turn(90);
			
		}		
	}
	
	void drawTriangle () {
		robot.penDown();
		robot.setSpeed(20);
		robot.setPenWidth(5);
		
		for (int i = 0; i < 3; i++) {
			robot.move(50);
			robot.turn(120);
			
		}
		
	}
	

	public static void main(String[] args) {
		ObedientRobot ob = new ObedientRobot ();
	
		int shape = JOptionPane.showOptionDialog(null, "Which shape would you like me to draw?", "Obedient Robot", 0,
			JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Circle", "Square", "Triangle" }, null);
		/*
		 * Create methods to draw a circle, square and triangle and call the appropriate
		 * one depending on the user choice.
		 */
			
		if (shape == 0) {
			ob.drawCircle();			
		}
		else if (shape == 1) {
			ob.drawSquare();
		}
		else if (shape == 2) {
			ob.drawTriangle();
		}
	
	}
	
	
}
