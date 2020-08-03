package URI;

import java.util.Scanner;

public class URI1145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Y = sc.nextInt();
		int g = 0;
		int x = 0;

		for (int i = 0; i < Y / N; i++) {

			while (g < N) {
				System.out.printf("%d", (x += 1));
				g++;
				if (g < N) {
					System.out.print(" ");
				} else {
					System.out.println();
				}

			}
			g = 0;

		}

		sc.close();

	}

}
