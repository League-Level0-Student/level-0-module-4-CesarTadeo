package _11_own_adventure;

import javax.swing.JOptionPane;

public class own_adventure {
	static int keys = 0; 
	static int health = 100;
	
	public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "Welcome, your goal of this jungle adventure is to collect all 3 keys to unlock a door which will lead to the treasure you are looking for, you have to do this without losing all of your health, you start of with 100 health and if you lose all of it you lose the game. ");
	JOptionPane.showMessageDialog(null, "You will now go on your path to collect all the keys, good luck.");
	
	
	int option1 = JOptionPane.showOptionDialog(null, "You see a key in the distance, but you have to go through some sharp vines in order to get the key, do you want to continue on the path and find an easier way to get the key, or do you want to go straight for the key right now.", "Get Key #1 or Continue", 0, JOptionPane.INFORMATION_MESSAGE, null, 
			new String[] {"Go for the key through the sharp vines", "Keep going and look for an easier way"}, null);
	
	if(option1==0) {
		vines();		
}
	if(option1==1) {
		keepGoing();		
}
	else if (health <= 0) {
		JOptionPane.showMessageDialog(null, "You lost all your health and didnt have enough keys to get out, better luck next time");
		System.exit(0);
	}
	if (keys == 3 && health >= 0) {
		JOptionPane.showMessageDialog(null, "Congratulations, you collected all three keys with a bit of health left :)");
	}
	
	int option2 = JOptionPane.showOptionDialog(null, "You find a bear who is very aggresive, you dont have any way to fight Timmy the bear and there is a very high chance that Timmy the bear can make you lose all your health, would you like to fight Timmy the bear anyway or go another way", "Get Key #1 or Continue", 0, JOptionPane.INFORMATION_MESSAGE, null, 
			new String[] {"Fight the Timmy the bear", "Keep going and look for an easier way"}, null);
	
	if(option2==0) {
		fightTimmy();			
}
	if(option2==1) {
		keepGoing2();			
}
	else if (health <= 0) {
		JOptionPane.showMessageDialog(null, "You lost all your health and didnt have enough keys to get out, better luck next time");
	System.exit(0);
	}
	if (keys == 3 && health >= 0) {
		JOptionPane.showMessageDialog(null, "Congratulations, you collected all three keys with a bit of health left :)");
	}
		
	int option3 = JOptionPane.showOptionDialog(null, "Along the path you see another key in the distance, you see it floating in a river but you will have to jump which will possibly cause some damage to you to lose some health", null, 0, JOptionPane.INFORMATION_MESSAGE, null, 
			new String[] {"Jump into the river for the key", "Keep going and look for an easier way"}, null);
	
	if(option3==0) {
		river();				
}
	if(option3==1) {
		keepGoing3();			
}
	else if (health <= 0) {
		JOptionPane.showMessageDialog(null, "You lost all your health and didnt have enough keys to get out, better luck next time");
		System.exit(0);
	}
	if (keys == 3 && health >= 0) {
		JOptionPane.showMessageDialog(null, "Congratulations, you collected all three keys with a bit of health left :)");
	}
	
	int option4 = JOptionPane.showOptionDialog(null, "Still along the path you see another key in the distance, you see the key stuck in between two big rocks", null, 0, JOptionPane.INFORMATION_MESSAGE, null, 
			new String[] {"Jump down to get the key in between the rocks", "Return back and try a path you havn't tried"}, null);
	
	if(option4==0) {
		rocks();
	}			
	if(option4==1) {
		returnBack();
	}	
	else if (health <= 0) {
		JOptionPane.showMessageDialog(null, "You lost all your health and didnt have enough keys to get out, better luck next time");
		System.exit(0);
	}
	if (keys == 3 && health >= 0) {
		JOptionPane.showMessageDialog(null, "Congratulations, you collected all three keys with a bit of health left :)");
	}
		
	int option5 = JOptionPane.showOptionDialog(null, "Now returning along the same path you see something a wolf burrying something shiny in a whole. There is a shovel right there too. Do you want to dig for the key or return back along the same path but there are a few wolves guarding that area.", null, 0, JOptionPane.INFORMATION_MESSAGE, null, 
			new String[] {"Dig down for the shiny object you saw", "Keep going back and try a path you havn't tried"}, null);
	
	if(option5==0) {
		digKey();
	}	
	if(option5==1) {
		differentPath();
	}	
	else if (health <= 0) {
		JOptionPane.showMessageDialog(null, "You lost all your health and didnt have enough keys to get out, better luck next time");
		System.exit(0);
	}
	if (keys == 3 && health >= 0) {
		JOptionPane.showMessageDialog(null, "Congratulations, you collected all three keys with a bit of health left :)");
		System.exit(0);
	}
		
	int option6 = JOptionPane.showOptionDialog(null, "Now still returning along the same path you see the key you saw in the river has finally washed up on shore, do you want to go get it or starve to death beacuse you've been through so much.", null, 0, JOptionPane.INFORMATION_MESSAGE, null, 
			new String[] {"Get the key at the shore", "Starve to death "}, null);	
	
	if(option6==0) {
		shore();
	}
	if(option6==1) {
		hunger();
	}
	else if (health <= 0) {
		JOptionPane.showMessageDialog(null, "You lost all your health and didnt have enough keys to get out, better luck next time");
		System.exit(0);
	}
	if (keys == 3 && health >= 0) {
		JOptionPane.showMessageDialog(null, "Congratulations, you collected all three keys with a bit of health left :)");
	}
	
	
}	
	static void vines() {
	JOptionPane.showMessageDialog(null, "You chose to go through the sharp vines whcih caused you to lose 25 of your health but you did get the key, you continue along the path to get the rest of the keys");
	health -= 50;
	keys += 1;
	}	
	static void keepGoing() {
	JOptionPane.showMessageDialog(null, "You decide to keep going, you get no keys and lose no health.");	
	health -= 0;
	keys += 0;
	}
	
	static void fightTimmy() {
	JOptionPane.showMessageDialog(null, "You decide to fight Timmy the bear who deals 90 damage to you then Timmy runs off, Timmy dropped a key he had in his mouth and now you have 1 more key.");
	health -= 90;
	keys += 1;
	}
	static void keepGoing2() {
		JOptionPane.showMessageDialog(null, "You decide not to fight Timmy the bear so you keep looking for another way");
		health -= 0;
		keys += 0;
	}
	
	static void river() {
		JOptionPane.showMessageDialog(null, "You jump into the river to get the key and you do get the key but you also lose 25 health for hitting your foot on a rock as you jumped in the river. ");
		health -=25;
		keys += 1;
	}		
	static void keepGoing3() {
		JOptionPane.showMessageDialog(null, "You decide not to jump in the river but you heard something behind you, you tripped and fell and landed on rocks causing you to lose 5 health.");
		health -=5;
		keys += 0;
	}

	static void rocks()	{
		JOptionPane.showMessageDialog(null, "You choose to get the key in between the rocks but as you pull them they key put, the huge rocks fall on you so you die");
		health -= 100;
		keys += 0;
		
	}
	static void returnBack() {
		JOptionPane.showMessageDialog(null, "You decide not get the key in between the rocks but as you begin to head back a wolf out of nowhere attacks you  but you manage to keep running, with the wolf scratching you, you only lose 3 health.");
		health -= 3;
		keys += 0;
	}
	
	static void digKey() {
		JOptionPane.showMessageDialog(null, "You decide to go down and dig for the key, the wolves are distracted right now so they dont attack you, you get the key. As you head back you trip into a tunnel and lose 1 health for a rock hitting your leg, at the end of the tunnel you get the final key you need which was hidden. ");
	health -= 1;
	keys += 2;
	
	}
	
	static void differentPath() {
		JOptionPane.showMessageDialog(null, "You decide not to dig down for the key and keep looking for another key.");
		health -= 0;
		keys += 0;
	}
	
	static void shore() {
		JOptionPane.showMessageDialog(null, "As you're running for the key you trip and lose 70 health for falling onto a sharp rock impaling you.");
		health -= 70;
		keys += 0;
		
	}
	
	static void hunger() {
		JOptionPane.showMessageDialog(null, "You decide to give up and so you die of hunger, better luck next time.");
		health -= 100;
		keys += 0;
		
	}	
}





