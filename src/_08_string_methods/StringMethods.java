 package _08_string_methods;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to whatever you want
		String color = JOptionPane.showInputDialog("What is your favorite color");
		System.out.println(color.charAt(2));
		// 3. Print the length of your String to the console.
		//    HINT: .length()
		System.out.println(color.length());
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		for (int i = 0; i < color.length(); i++) {
		System.out.println(color.charAt(i));	
		}
		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
			//             for char 'b', then print "b is at index 1"
		
		 for (int i = 0; i < color.length(); i++) {	
			 if ( color.charAt(i) == 'r') {
		System.out.println(i);
					
		 }
		 }
	
		
	}
}


