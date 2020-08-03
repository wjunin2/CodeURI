package URI;

import java.util.Scanner;

public class URI1073 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, real;

		N = sc.nextInt();

		if (N % 2 == 0) {
			real = N;
		} else {
			real = N - 1;
		}

		int x = 2;
		while (x <= real) {
			System.out.println(x + "^2 = " + (x * x));

			x += 2;

		}

		sc.close();

	}

}
