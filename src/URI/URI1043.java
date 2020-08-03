package URI;

import java.util.Scanner;

public class URI1043 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if ((A < B + C) && (B < A + C) && (C < B + A)) {
			double perimetro = A + B + C;
			System.out.printf("Perimetro = %.1f\n", perimetro);
		} else {
			double area = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f\n", area);
		}

		sc.close();

	}

}
