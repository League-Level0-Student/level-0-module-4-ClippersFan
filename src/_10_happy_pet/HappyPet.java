package _10_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog("What pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too
		for (int i = 0; true; i++) {
			int task = JOptionPane.showOptionDialog(null, "What would you like to do to make your pet happy?",
					"Pet Happy", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Say Hi to the pet", "Give the pet water", "Give the pet Food" }, null);
			if (task == 0) {
				hi();
			} else if (task == 2) {
				feed();
			} else if (task == 1) {
				water();
			}
			if (happinessLevel >= 13) {
				JOptionPane.showMessageDialog(null, "Your pet is very happy");
				break;
			}

		}

		// 5. Use user input to call the appropriate method created in step 4.

		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

	}

	static // 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	void hi() {
		JOptionPane.showMessageDialog(null, "Hola");
		happinessLevel = happinessLevel + 3;
	}

	static void feed() {
		JOptionPane.showMessageDialog(null, "Ok...");
		happinessLevel = happinessLevel + 3;
	}

	static void water() {
		JOptionPane.showMessageDialog(null, "Finally, I get hydrated.");
		happinessLevel = happinessLevel + 5;
	}
}