package URI;

import java.util.Scanner;

public class URI1144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int x = 0;
		int y = 0;
		int z = 0;

		for (int i = 1; i <= N; i++) {

			x = i;
			y = x * i;
			z = x * y;

			System.out.println(x + " " + y + " " + z);
			System.out.println(x + " " + (y = y + 1) + " " + (z = z + 1));

		}

		sc.close();

	}

}
