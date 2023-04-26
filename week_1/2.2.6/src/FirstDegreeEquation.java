import java.util.Scanner;

public class FirstDegreeEquation {
	double a, b;

	public enum EquationStatus {
		NO_SOLUTION,
		ANY_SOLUTION,
		ONE_SOLUTION,
	}

	public FirstDegreeEquation(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public EquationStatus getStatus() {
		if (a == 0 && b != 0)
			return EquationStatus.NO_SOLUTION;
		if (a == 0 && b == 0)
			return EquationStatus.ANY_SOLUTION;
		return EquationStatus.ONE_SOLUTION;
	}

	public double getSolution() {
		return -b / a;
	}

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.print("a = ");
		var a = scanner.nextDouble();
		System.out.print("b = ");
		var b = scanner.nextDouble();
		scanner.close();

		var eq = new FirstDegreeEquation(a, b);
		var status = eq.getStatus();
		switch(status) {
		case NO_SOLUTION:
			System.out.println("The equation has no solution.");
			break;
		case ANY_SOLUTION:
			System.out.println("The equation is true for any solutions.");
			break;
		case ONE_SOLUTION:
			System.out.println("The equation has one solution: x = " + eq.getSolution());
			break;
		}
	}
}
