package URI;

import java.util.Scanner;

public class URI1165 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		if (N % N != 1) {
			System.out.println(N + " eh primo");
		} else {
			System.out.println(N + " nao eh primo");
		}

		sc.close();

	}

}
