package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		double q = 0.25;
		double d = 0.10;
		double n = 0.05;

		// Ask the user how many nickels they have
		String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int num = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
		String dime = JOptionPane.showInputDialog("How many dimes do you have?");
		int hi = Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
		String quarter = JOptionPane.showInputDialog("How many quarters do you have?");
		int bi = Integer.parseInt(quarter);
		// Calculate how much money the user has and save it in a double variable 
		double t = (q * bi) + (d * hi) + (n * num);
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have $"+t+".");
	}
}

