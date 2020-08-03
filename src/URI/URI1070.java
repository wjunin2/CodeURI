package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1070 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int cont = 0;

		while (cont < 6) {
			if (x % 2 == 1) {
				System.out.println(x);
				cont++;
			}
			x++;

			sc.close();

		}
	}
}
