package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1178 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double X = sc.nextDouble();

		double[] N = new double[100];

		double y = X;

		for (int i = 0; i < N.length; i++) {
			N[i] = y;
			y = y / 2;
		}

		for (int i = 0; i < N.length; i++) {
			System.out.printf("N[%d] = %.4f%n", i, N[i]);
		}

		sc.close();
	}

}
