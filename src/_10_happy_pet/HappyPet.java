package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String userPet = "";
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
	 userPet = JOptionPane.showInputDialog("Kind of pet would you like to buy");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			
	 	for (int i = 0; i < 30; i++) {
			
		
	 		int task = JOptionPane.showOptionDialog(null, "What would you like to do to make your pet happy, your goal is to make your pet's happiness level up to 30", "Make your pet happy by doing stuff for it", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle with your pet", "Feed your pet", "Give your pet some water","Groom your pet", "Clean your pet's poop","Walk your pet" }, null);
	 	
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		if (happinessLevel>=30) {
			JOptionPane.showMessageDialog(null, "You love your pet and your pet loves you");
		break;
		}
	 	
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
		if(task==0) {
			cuddle();
					
}		
		if(task==1) {
			feed();
}
		if(task==2) {
			water();
}	
		if(task==3) {
			groom();
}
		if(task==4) {
			clean();
}
		if(task==5) {
			walk();
}	
}
}
static void cuddle() {
JOptionPane.showMessageDialog(null, "Your "+userPet+" is 7 more happier");
happinessLevel += 7;
	
}	
	
static void feed() {
	
	JOptionPane.showMessageDialog(null, "Your " +userPet+" is 5 more happier");
happinessLevel += 5;
}	
	
static void water() {
	
	JOptionPane.showMessageDialog(null, "Your " +userPet+" is 5 more happier");
happinessLevel += 5;
}		
	
static void clean() {
	
	JOptionPane.showMessageDialog(null, "Your " +userPet+" is 6 more happier");
happinessLevel += 6;
}		

static void groom() {
	
	JOptionPane.showMessageDialog(null, "Your " +userPet+" is 6 more happier");
happinessLevel += 6;
}			

static void walk() {
	
	JOptionPane.showMessageDialog(null, "Your " +userPet+" is 5 more happier");
happinessLevel += 4;
}			
	
		
}
