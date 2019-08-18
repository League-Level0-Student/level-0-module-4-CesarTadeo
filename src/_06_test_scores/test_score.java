package _06_test_scores;

import javax.swing.JOptionPane;

public class test_score {
public static void main(String[] args) {
	String testscore = JOptionPane.showInputDialog("wHaT iS yOuR lAsT tEsT sCorE");
	int tc = Integer.parseInt(testscore);
	double tEsTsCoRe = tc;
	if (tEsTsCoRe > 75) {
	JOptionPane.showMessageDialog(null, "wOw! yOu mUsT hAvE sTuDiEd sO hArD fOr tHaT tEsT!");	
	}
	if (tEsTsCoRe < 75) {
	JOptionPane.showMessageDialog(null, "nExT tImE wOrK hArDeR fOr YoUr nExT tEsT");
	}
	
	
	
}
}
