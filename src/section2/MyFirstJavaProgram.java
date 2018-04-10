package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		Robot owo = new Robot();
		owo.penDown();
		owo.sparkle();
		owo.setSpeed(1000);
		owo.setPenWidth(10);
		for (int i = 0; i < 10; i++) {
			int x = 0;
		while (x < 30) {
			owo.setRandomPenColor();
			owo.turn(12);
			owo.move(20);
			x++;
		}
		owo.turn(36);
		}
	}
}
