package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/spyro.jpg");		
		
		JOptionPane.showMessageDialog(null, "In the depths of the dungeon, you encounter a ferocious dragon! \nTipped with scales and razor-sharp fangs, it lets out a bellowing shriek. \nPrepare for battle!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int playHP = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragHP = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playDMG;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragDMG;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playHP>0 && dragHP>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String turn = JOptionPane.showInputDialog(null, "Do you want to YELL or KICK the dragon, or do you want to HEAL?");
		Random dRan = new Random();
		System.out.println(dRan);
		// 9. If they typed in "yell":
		if (turn.equalsIgnoreCase("yell")) {
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			dragDMG = dRan.nextInt(6) + 10;
			JOptionPane.showMessageDialog(null, "The power of your vocal chords deals " + dragDMG + " damage to the dragon.");
			//-- Subtract that number from the dragon's health variable 
			dragHP = dragHP - dragDMG;
		}
		// 10. If they typed in "kick":
		else if(turn.equalsIgnoreCase("kick")) {
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			dragDMG = dRan.nextInt(25);
			//-- Subtract that number from the dragon's health variable
			JOptionPane.showMessageDialog(null, "You kick it in the shins, dealing " + dragDMG + " damage.");
			dragHP = dragHP - dragDMG;
		} else if(turn.equalsIgnoreCase("heal")) {
			if(playHP == 100 && turn.equalsIgnoreCase("heal")) {
				JOptionPane.showMessageDialog(null, "At full energy, a hearty swig of Gatorade(TM) has no effect.");
			} else {
				JOptionPane.showMessageDialog(null, "A hearty swig of Gatorade(TM) restores your health.");
			}
			playHP = playHP + 15;
			if(playHP >= 100) {
				playHP = 100;
			}
		}
			else {
			JOptionPane.showMessageDialog(null, "You can't perform that action, so you just stood in front of the dragon...");
		}
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		Random pRan = new Random();
		System.out.println(pRan);
		playDMG = pRan.nextInt(35);
		// 12. Subtract this number from the player's health
		JOptionPane.showMessageDialog(null, "The dragon strikes! You take " + playDMG + " damage.");
		playHP = playHP - playDMG;
		
		// 13. If the user's health is less than or equal to 0
		if (playHP <= 0) {
			//-- Tell the user that they lost
			JOptionPane.showMessageDialog(null, "You are dead. No big surprise.");
		}
		// 14. Else if the dragon's health is less than or equal to 0
		else if (dragHP <= 0) {
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			JOptionPane.showMessageDialog(null, "You have slain the dragon! With an endless pile of gold, you claim the title of xX_MLG-dRaGoNsLaYeR-420_Xx.");
		}
			
	   //  15.  Else
		else if (dragHP <= 0 && playHP <= 0) {
			JOptionPane.showMessageDialog(null, "You have defeated the dragon! \nHowever, in its final moments, it lashes out and strikes you down.\nYou will be remembered for your bravery, but will never claim the title of xX_MLG-dRaGoNsLaYeR-420_Xx.");
		}
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		else {
			JOptionPane.showMessageDialog(null, "The dragon has " + dragHP + " Health Points.\nYou have " + playHP + " Health Points.");
		}
		}
	}}

