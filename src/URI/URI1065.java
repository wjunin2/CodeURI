package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1065 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int y = 0;

		for (int i = 1; i <= 5; i++) {
			int x = sc.nextInt();

			if (x % 2 == 0) {
				y = y + 1;
			}

		}
		System.out.println(y + " valores pares");

		sc.close();

	}

}
