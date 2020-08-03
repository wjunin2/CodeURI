package URI;

import java.util.Scanner;

public class URI1099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int t = 0;

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (x < y) {
				for (int a = x + 1; a < y; a++) {
					if (a % 2 != 0) {
						t = t + a;
					}
				}

			} else {
				for (int a = y + 1; a < x; a++) {
					if (a % 2 != 0) {
						t = t + a;
					}

				}

			}
			System.out.println(t);
			t = 0;
		}
		sc.close();

	}
}
