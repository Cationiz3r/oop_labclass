package hust.soict.dsai.lab01.equations;

import java.util.Scanner;
import hust.soict.dsai.lab01.equations.LinearStatus;

public class FirstDegree {
	double a, b;

	public FirstDegree(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public LinearStatus getStatus() {
		if (a == 0 && b != 0)
			return LinearStatus.NO_SOLUTION;
		if (a == 0 && b == 0)
			return LinearStatus.ANY_SOLUTION;
		return LinearStatus.ONE_SOLUTION;
	}

	public double getSolution() {
		return -b / a;
	}

	public void printSolution() {
		switch(getStatus()) {
		case NO_SOLUTION:
			System.out.println("The equation has no solution.");
			break;
		case ANY_SOLUTION:
			System.out.println("The equation is true for any solutions.");
			break;
		case ONE_SOLUTION:
			System.out.println(
				"The equation has one solution: x = " + getSolution()
			);
			break;
		}
	}

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.print("a = ");
		var a = scanner.nextDouble();
		System.out.print("b = ");
		var b = scanner.nextDouble();
		scanner.close();

		var eq = new FirstDegree(a, b);
		eq.printSolution();
	}
}
