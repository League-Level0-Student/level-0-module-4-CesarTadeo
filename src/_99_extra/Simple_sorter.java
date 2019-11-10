package _99_extra;

import javax.swing.JOptionPane;

public class Simple_sorter {
public static void main(String[] args) {
String firstRandomNumber = JOptionPane.showInputDialog("Please give me a random number");
int num1  = Integer.parseInt(firstRandomNumber);
String secondRandomNumber = JOptionPane.showInputDialog("Please give me another random number");
int num2  = Integer.parseInt(secondRandomNumber);
String thirdRandomNumber = JOptionPane.showInputDialog("Please give me your third random number");
int num3  = Integer.parseInt(thirdRandomNumber);


if (num1 > num2 && num1 > num3 && num2 > num3) {
System.out.println("These are your three numbers in ascending order" + num1 + " " + num2 + " " + num3);	
}
if (num1 > num2 && num1 > num3 && num3 > num2) {
System.out.println("These are your three numbers in ascending order" + num1 + " " + num3 + " " + num2);	
}
if (num2 > num1 && num2 > num3 && num1 > num3) {
System.out.println("These are your three numbers in ascending order" + num2 + " " + num1 + " " + num3);	
}
if (num2 > num1 && num2 > num3 && num3 > num1) {
System.out.println("These are your three numbers in ascending order" + num2 + " " + num3 + " " + num1);	
}
if (num3 > num2 && num3 > num1 && num2 > num1) {
System.out.println("These are your three numbers in ascending order" + num3 + " " + num2 + " " + num1);	
}
if (num3 > num2 && num3 > num1 && num1 > num2) {
System.out.println("These are your three numbers in ascending order" + num3 + " " + num1 + " " + num2);	
}

	
if (num1 < num2 && num1 < num3 && num2 < num3) {
System.out.println("These are your three numbers in descending order" + num3 + " " + num2 + " " + num1);	
}
if (num1 < num2 && num1 < num3 && num3 < num2) {
System.out.println("These are your three numbers in descending order" + num2 + " " + num3 + " " + num1);	
}
if (num2 < num1 && num2 < num3 && num1 < num3) {
System.out.println("These are your three numbers in descending order" + num3 + " " + num1 + " " + num2);	
}
if (num2 < num1 && num2 < num3 && num3 < num1) {
System.out.println("These are your three numbers in descending order" + num1 + " " + num3 + " " + num2);	
}
if (num3 < num2 && num3 < num1 && num2 < num1) {
System.out.println("These are your three numbers in descending order" + num1 + " " + num2 + " " + num3);	
}
if (num3 < num2 && num3 < num1 && num1 < num2) {
System.out.println("These are your three numbers in descending order" + num2 + " " + num1 + " " + num3);	
}
	
	
	
}
}
