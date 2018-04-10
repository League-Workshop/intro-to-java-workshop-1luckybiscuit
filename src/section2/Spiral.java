package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		int count = 0;
		int x = 0;
		int yes = 0;
		// 1. Create a new Robot
		Robot owo = new Robot();
		Robot owoo = new Robot();
		//if (mousePressed) {
		owo.miniaturize();
		owoo.miniaturize();
		//}
		// 5. Set your robot's pen down 
		owo.penDown();
		owoo.penDown();
		// 3. Set the robot to go at max speed (10)
		owo.setSpeed(2000);
		owoo.setSpeed(2000);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i=0;i<360;i++) {
			// 7. Change the pen color to random
			owo.setPenColor(0,0,0);
			owoo.setPenColor(255-x, 255-x, 255-x);
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			owo.move(i);
			owoo.move(i);
			// 2. Turn the robot 360/7 degrees to the right
			owo.turn(360/7);
			owoo.turn(360/7);
			// 8. Set the pen width to i
			owoo.setPenWidth(3);
			owo.setPenWidth(10);
			if (count == 255) {
			    yes = 1;
			} else if (count == 0) {
				yes = 0;
			}
			if (yes == 1) {
				count = count - 5;
				x = x - 5;
		}else{
			count = count +5;
			x = x + 5;
			}
		}
	}
}
