package hust.soict.dsai.lab01.equations;

import java.util.Scanner;
import hust.soict.dsai.lab01.equations.LinearStatus;

public class SystemFirstDegree {
	double a11, a12, a21, a22, b1, b2;

	public SystemFirstDegree(double[] vars) {
		a11 = vars[0]; a12 = vars[1]; b1 = vars[2];
		a21 = vars[3]; a22 = vars[4]; b2 = vars[5];
	}

	double getDet0() { return a11 * a22 - a21 * a12; }
	double getDet1() { return b1  * a22 - b2  * a12; }
	double getDet2() { return a11 * b2  - a21 * b1;  }

	public LinearStatus getStatus() {
		if (getDet0() == 0) {
			if (getDet1() == 0 && getDet2() == 0)
				return LinearStatus.ANY_SOLUTION;
			return LinearStatus.NO_SOLUTION;
		}
		return LinearStatus.ONE_SOLUTION;
	}

	public double getX1() { return getDet1() / getDet0(); }
	public double getX2() { return getDet2() / getDet0(); }

	public void printSolution() {
		switch(getStatus()) {
		case NO_SOLUTION:
			System.out.println("The system of equations has no solution.");
			break;
		case ANY_SOLUTION:
			System.out.println("The system of equations is true for any solutions.");
			break;
		case ONE_SOLUTION:
			System.out.println(
				"The system has one solution (x1, x2) = (" +
				getX1() + ", " + getX2() + ")"
			);
			break;
		}

	}

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var arr = new double[6];
		System.out.print("a11 = "); arr[0] = scanner.nextDouble();
		System.out.print("a12 = "); arr[1] = scanner.nextDouble();
		System.out.print("b1  = "); arr[2] = scanner.nextDouble();
		System.out.print("a21 = "); arr[3] = scanner.nextDouble();
		System.out.print("a22 = "); arr[4] = scanner.nextDouble();
		System.out.print("b2  = "); arr[5] = scanner.nextDouble();
		scanner.close();

		var sEq = new SystemFirstDegree(arr);
		sEq.printSolution();
	}
}
