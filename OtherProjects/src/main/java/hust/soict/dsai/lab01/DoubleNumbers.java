package hust.soict.dsai.lab01;

import java.util.Scanner;

public class DoubleNumbers {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.print("a = ");
		var a = scanner.nextDouble();
		System.out.print("b = ");
		var b = scanner.nextDouble();
		scanner.close();

		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (b == 0 ? "Non-exist" : (a / b)));
	}
}
