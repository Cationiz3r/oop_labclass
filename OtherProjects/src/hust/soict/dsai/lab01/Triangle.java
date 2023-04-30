package hust.soict.dsai.lab01;

import java.util.Scanner;

public class Triangle {
	public static String repeat(int width, char c) {
		return new String(new char[width]).replace('\0', c);
	}

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.print("Height? ");
		var height = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < height; ++i) {
			System.out.println(
				repeat(height - i - 1, ' ') +
				repeat(i * 2 + 1, '*')
			);
		}
	}
}
