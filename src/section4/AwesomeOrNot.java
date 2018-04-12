package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	Random ran = new Random();
	System.out.println(ran);
	int rand = ran.nextInt(4);
	// 3. Print out this variable
	// 4. Get the user to enter something that they think is awesome
	String oof = JOptionPane.showInputDialog(null, "What's awesome?");	
	// 5. If the random number is 0
	if (rand == 0) {
	// -- tell the user whatever they entered is awesome!
		JOptionPane.showMessageDialog(null, "Yeah, " + oof + " is awesome!"); }
	// 6. If the random number is 1
	if (rand == 1) {
	// -- tell the user whatever they entered is ok.
		JOptionPane.showMessageDialog(null, oof + " is okay..."); }
	// 7. If the random number is 2
	if(rand == 2) {
	// -- tell the user whatever they entered is boring.
		JOptionPane.showMessageDialog(null, oof + " is bo-ring."); }
	// 8. If the random number is 3
	if(rand == 3) {
		JOptionPane.showMessageDialog(null, "Seriously? " + oof + " is a propoganda tool used in communist societies to promote bigotry and hate throughout the world.\nI am disgusted with your opinion, and you don't deserve to exist unless you have 1000 more IQ then me,\nwhich is impossible. You will never become respected or loved within your life,\nso go sit in the corner and cry.");
	}
	// -- write your own answer

}}


