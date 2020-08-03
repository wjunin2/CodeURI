package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1014 {

	public static void main(String[] args) {

			Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int dist;
		double consumo, x;

		dist = sc.nextInt();
		consumo = sc.nextDouble();

		x = dist / consumo;

		System.out.printf("%.3f km/l", x);

		sc.close();

	}

}
