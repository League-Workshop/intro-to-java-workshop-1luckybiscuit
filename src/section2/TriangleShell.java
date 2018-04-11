package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot owo = new Robot();
	int tri = 10;
	void go() {

		// 6. Make the robot go as fast as possible
		owo.setSpeed(200);
		owo.penDown();
		// 4. make a variable to hold the length of the triangle and set it to 50
		owo.miniaturize();
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
		for(int i = 0; i<60;i++) {
			// 9. Change the color of the pen to a random color
			owo.setRandomPenColor();
			// 8. Increase the length variable by 10
			tri = tri+3;
			// 5. call your drawTriangle() method using your length variable
			drawTriangle(tri);
			// 10. Turn the robot 6 degrees to the right
			owo.turn(6);
	}}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
		for(int x = 0;x<3;x++) {
		owo.move(tri);
		owo.turn(120);
		
	}}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
