package URI;

import java.util.Scanner;

public class URI1177 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int[] N = new int[1000];

		int x = 0;

		for (int i = 0; i < N.length; i++) {

			N[i] = x;
			x++;
			if (x == T) {
				x = 0;
			}
		}

		for (int i = 0; i < N.length; i++) {
			System.out.println("N[" + i + "] = " + N[i]);
		}

		sc.close();

	}

}
