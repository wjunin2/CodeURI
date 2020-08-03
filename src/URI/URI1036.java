package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1036 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, delta, x1, x2;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		delta = (b * b) - 4 * a * c;

		if (a == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("R1 = %.5f\n", x1);
			System.out.printf("R2 = %.5f\n", x2);
		}

		sc.close();

	}

}
