package _11_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
			String answer1 = JOptionPane.showInputDialog("Would you prefer red, green, or blue?");
		
		if(answer1.equalsIgnoreCase("blue")) {
			String answer4 = JOptionPane.showInputDialog("Would you prefer 1,2, or 3?");
			if(answer4.equalsIgnoreCase("1")) {
				JOptionPane.showMessageDialog(null, "Are you the only child?");
			}
			if(answer4.equalsIgnoreCase("2")) {
				JOptionPane.showMessageDialog(null, "You must have a sibling!");
			}
			if(answer4.equalsIgnoreCase("3")) {
				JOptionPane.showMessageDialog(null, "You have the skills to become great!");
			}
		}else
		if(answer1.equalsIgnoreCase("green")) {
			String answer3 = JOptionPane.showInputDialog("Would you prefer ice cream, soda, or pancakes?");
			if(answer3.equalsIgnoreCase("ice cream")) {
				JOptionPane.showMessageDialog(null, "You must be cold");
			}
			if(answer3.equalsIgnoreCase("pancakes")) {
				JOptionPane.showMessageDialog(null, "You must really like breakfast, I guess!");
			}
			if(answer3.equalsIgnoreCase("soda")) {
				JOptionPane.showMessageDialog(null, "You must like drinking liquids a lot!");
			}
		}else
		if(answer1.equalsIgnoreCase("red")){
			String answer2 = JOptionPane.showInputDialog("Would you prefer shopping or Amazon?");
			if(answer2.equalsIgnoreCase("shopping")){
				JOptionPane.showMessageDialog(null, "Wow, you are really old school.");
			}
			if(answer2.equalsIgnoreCase("amazon")) {
				JOptionPane.showMessageDialog(null, "Welcome to the new era of shopping!");
			}
		}
		
}
}
