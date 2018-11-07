//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int randomNumber = 0;

		for (int i = 0; i < 10; i++) {
			randomNumber = randomMaker.nextInt(5);

			System.out.println(randomNumber);
			
			if (randomNumber == 1) {

				

				// 1. Use each value of randomNumber to give the user a random compliment.

				JOptionPane.showMessageDialog(null, "you have cool shoes");
			}
			if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "you have cool hair");
			}
			if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "you have cool cloths");
			}
			if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null, "you have cool arms");
			}
			if (randomNumber == 5) {
				JOptionPane.showMessageDialog(null, "you have cool legs");
			}

		}
		// 2. Repeat all the code above 10 times

		// 3. Find someone to test out your program. They will like it :)
	}

}
