package section3;

import javax.swing.JOptionPane;

public class greeter {
	public static void main(String[] args) {
		String  IQ = JOptionPane.showInputDialog(null, "What's a cool company?");
		JOptionPane.showMessageDialog(null, "Brought to you by " + IQ + "\n-" + IQ);
		/*for(int i = 0;i<7;i++)
		JOptionPane.showMessageDialog(null, IQ + " Gang, ");*/
	}
}
