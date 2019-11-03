package _99_extra;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class StringMethods2 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
		
		String variable = JOptionPane.showInputDialog("Please give me a random word you would like to use for this program.");
		
		// 2. Print your String to the console in upper case.
		System.out.println(variable.toUpperCase());
		
		// 3. Print your String to the console in lower case.
		System.out.println(variable.toLowerCase());
		
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
		System.out.println(variable.substring(0, 3));
		
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
		System.out.println(variable.charAt(variable.length()/2));
		
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
		}
		
	
	}
