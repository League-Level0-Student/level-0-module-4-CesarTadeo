package _06_test_scores;

import javax.swing.JOptionPane;

public class test_score {
public static void main(String[] args) {
	String testscore = JOptionPane.showInputDialog("What is your last test score");
	double ts = Double.parseDouble(testscore);
	
	if (ts >= 75) {
	JOptionPane.showMessageDialog(null, "Wow you must have studied hard for that test");	
	}
	if (ts <= 75) {
	JOptionPane.showMessageDialog(null, "Next time work harder for your next test");
	}
	
	
	
}
}
