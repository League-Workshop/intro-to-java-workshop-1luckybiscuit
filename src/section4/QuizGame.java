package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		String qOne = "When was the War of 1812?";
		String aOne = "1812";
		String qTwo = "What are we, some sort of League of Amazing Programmers?";
		String aTwo = "Yes";
		String qThree = "Supreme or Gucci?";
		String aThree = "No";
		// 2.  Ask the user a question 
		String q = JOptionPane.showInputDialog(null, qOne);
		if(q.equalsIgnoreCase(aOne)) {
		score++; }
		JOptionPane.showMessageDialog(null, "Hmmmm...");
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String qq = JOptionPane.showInputDialog(null, qTwo);
		if(qq.equalsIgnoreCase(aTwo)) {
		score++; }
		JOptionPane.showMessageDialog(null, "Hmmmm...");
		String qqq = JOptionPane.showInputDialog(null, qThree);
		if(qqq.equalsIgnoreCase(aThree)) {
		score++; }
		JOptionPane.showMessageDialog(null, "Hmmmm...");
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Yours score is " + score);
	}
}
