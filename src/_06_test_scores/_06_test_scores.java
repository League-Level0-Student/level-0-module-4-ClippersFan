package _06_test_scores;

import javax.swing.JOptionPane;

public class _06_test_scores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What was your test score?");
		double test = Double.parseDouble(score);
		if(test < 50) {
			JOptionPane.showMessageDialog(null, "Wow! You really didn't study at all for that test!");
		}
		if(test > 50) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied well!");
		}
		if(test == 100) {
			JOptionPane.showMessageDialog(null, "WOW! GOOD JOB!");
		}
		if(test == 50) {
			JOptionPane.showMessageDialog(null, "Study pls");
		}
		}
	}

