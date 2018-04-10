package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot owo = new Robot();

	void go() {
	owo.penDown();
	owo.miniaturize();
		// 4. Make the robot move as fast as possible
	owo.setSpeed(2000);
		// 5. Set the pen width to 5
	owo.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
	for(int i = 0;i<4;i++) {
			// 7. Set the pen color to random
	if (i == 0) {
		owo.setPenColor(Color.GREEN);
	} else if (i == 1) {
		owo.setPenColor(Color.YELLOW);
	} else if (i == 2) {
		owo.setPenColor(Color.BLUE);
	} else {
		owo.setPenColor(Color.RED);
	}
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
	owo.turn(90);
	}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		for(int i = 0; i<4; i++) {
		owo.move(100);
		owo.turn(90);
		}	
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



