package URI;

import java.util.Scanner;

public class URI1173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int V = sc.nextInt();

		int[] N = new int[10];

		for (int i = 0; i < N.length; i++) {
			N[i] = V;
			V = V * 2;
		}

		for (int i = 0; i < N.length; i++) {
			System.out.printf("N[%d] = ", i);
			System.out.println(N[i]);
		}

		sc.close();

	}

}
