package _11_own_adventure;

import javax.swing.JOptionPane;

public class own_adventure {
	int keys = 0; 
	static int health = 100;
	
	public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "Welcome, your goal of this jungle adventure is to collect all 3 keys to unlock a door which will lead to the treasure you are looking for, you have to do this without losing all of your health, you start of with 100 health and if you lose all of it you lose the game. ");
	JOptionPane.showMessageDialog(null, "You will now go on your path to collect all the keys, good luck.");
	int option1 = JOptionPane.showOptionDialog(null, "You see a key in the distance, but you have to go through some sharp vines in order to get the key, do you want to continue on the path and find an easier way to get the key, or do you want to go straight for the key right now.", "Get Key #1 or Continue", 0, JOptionPane.INFORMATION_MESSAGE, null, 
			new String[] {"Go for the key through the sharp vines", "Keep going and look for an easier way"}, null);
	
	int option2 = JOptionPane.showOptionDialog(null, "You find a bear who is very aggresive, you dont have any way to fight Timmy the bear and there is a very high chance that Timmy the bear can make you lose all your health, would you like to fight Timmy the bear anyway or go another way", "Get Key #1 or Continue", 0, JOptionPane.INFORMATION_MESSAGE, null, 
			new String[] {"Go for the key through the sharp vines", "Keep going and look for an easier way"}, null);
	
	int option3 = JOptionPane.showOptionDialog(null, "Along the path you see another key in the distance, you see it floating in a river but you will have to jump which will possibly cause some damage to you to lose some health", null, 0, JOptionPane.INFORMATION_MESSAGE, null, 
			new String[] {"Jump into the river for the key", "Keep going and look for an easier way"}, null);
	
	int option4 = JOptionPane.showOptionDialog(null, "Still along the path you see another key in the distance, you see the key stuck in between two big rocks", null, 0, JOptionPane.INFORMATION_MESSAGE, null, 
			new String[] {"Jump down to get the key in between the rocks", "Return back and try a path you havn't tried"}, null);
	
}
	
	
	
	static void vines() {
	JOptionPane.showMessageDialog(null, "You chose to go through the sharp vines whcih caused you to lose 25 of your health.");
	health = 25;
	}	
	
	
	
	
	
	
}

