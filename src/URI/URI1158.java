package URI;

import java.util.Scanner;

public class URI1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int total = 0;

		for (int z = 1; z <= N; z++) {

			int X = sc.nextInt();
			int Y = sc.nextInt();

			if (X % 2 == 0) {
				X++;
				for (int i = 1; i <= Y; i++) {
					total += X;
					X += 2;
				}
			}

			else {
				for (int i = 1; i <= Y; i++) {
					total += X;
					X += 2;
				}
			}

			System.out.println(total);
			total = 0;
		}

		sc.close();
	}
}
