package hust.soict.cybersec.lab01.equations;

import java.util.Scanner;
import java.lang.Math;
import hust.soict.cybersec.lab01.equations.FirstDegree;

public class SecondDegree {
	double a, b, c;

	public SecondDegree(double a, double b, double c) {
		this.a = a; // Non zero
		this.b = b;
		this.c = c;
	}

	public double getDelta() { return b * b - 4 * a * c; }

	public void printSolution() {
		var delta = getDelta();
		if (delta < 0) {
			System.out.println("The equation has no real solutions");
		} else if (delta == 0) {
			var x = -b / (2 * a);
			System.out.println("The equation has one real solution: x = " + x);
		} else {
			double deltaSqr = Math.sqrt(delta);
			var x1 = (-b + deltaSqr) / (4 * a);
			var x2 = (-b - deltaSqr) / (4 * a);
			System.out.println(
				"The equation has two real solutions: x1 = " +
				x1 + " and x2 = " + x2
			);
		}
	}

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.print("a = "); var a = scanner.nextDouble();
		System.out.print("b = "); var b = scanner.nextDouble();
		System.out.print("c = "); var c = scanner.nextDouble();
		scanner.close();

		if (a == 0) {
			var eq = new FirstDegree(b, c);
			eq.printSolution();
			System.exit(0);
		}

		var eq = new SecondDegree(a, b, c);
		eq.printSolution();
	}
}
