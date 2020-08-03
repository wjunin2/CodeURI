package URI;

import java.util.Scanner;

public class URI1142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int x = 1;

		for (int i = 1; i <= N; i++) {
			System.out.printf("%d %d %d PUM%n", x++, x++, x++);
			x++;
		}

		sc.close();

	}

}
