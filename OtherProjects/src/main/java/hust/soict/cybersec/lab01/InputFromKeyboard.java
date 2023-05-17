package hust.soict.cybersec.lab01;

import java.util.Scanner;

public class InputFromKeyboard {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		System.out.print("What's your name? ");
		var strName = scanner.nextLine();
		System.out.print("How old are you? ");
		var iAge = scanner.nextInt();
		System.out.print("How tall are you (m)? ");
		var dHeight = scanner.nextDouble();

		System.out.println(
			"Mrs/Ms. " + strName + ", " +
			iAge + " year old. " +
			"Your height is " + dHeight + "m."
		);

		scanner.close();
	}
}
