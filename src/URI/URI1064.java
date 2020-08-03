package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1064 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int y = 0;
		double z = 0;

		for (int i = 1; i <= 6; i++) {
			double x = sc.nextDouble();
			if (x >= 0) {
				y = y + 1;
				z = z + x;

			}

		}
		double media = z / y;
		System.out.println(y + " valores positivos");
		System.out.printf("%.1f%n", media);

		sc.close();
	}

}
