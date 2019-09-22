package _11_own_adventure;

import javax.swing.JOptionPane;

public class own_adventure {
public static void main(String[] args) {
	
	int keys = 0; 
	int health = 100;
	
	JOptionPane.showMessageDialog(null, "Welcome, your goal of this jungle adventure is to collect all 3 keys to unlock a door which will lead to the treasure you are looking for, you have to do this without losing all of your health, you start of with 100 health and if you lose all of it you lose the game. ");
	JOptionPane.showMessageDialog(null, "You will now collect all the keys, good luck.");
	int option1 = JOptionPane.showOptionDialog(null, "You see a key in the distance, but you have to go through some sharp vines in order to get the key, do you want to continue on the path and find an easier way to get the key, or do you want to go straight for the key right now.", "Get Key #1 or Continue", 0, JOptionPane.INFORMATION_MESSAGE, null, 
			new String[] {"Go for the key through the sharp vines", "Keep going and look for an easier way"}, null);
	
	int option2 = JOptionPane.showOptionDialog(null, "You find a bear who is very aggresive, you dont have any way to fight Timmy the bear, would you like to fight Timmy the bear anyway or go another way", "Get Key #1 or Continue", 0, JOptionPane.INFORMATION_MESSAGE, null, 
			new String[] {"Go for the key through the sharp vines", "Keep going and look for an easier way"}, null);
	
	//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
