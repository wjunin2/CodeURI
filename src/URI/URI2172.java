package URI;

import java.util.Scanner;

public class URI2172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = 1;
		int M = 1;

		while (X != 0 || M != 0) {
			X = sc.nextInt();
			M = sc.nextInt();
			System.out.println(X * M);
		}

		sc.close();

	}

}
