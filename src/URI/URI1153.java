package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1153 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int total = 1;

		for (int i = 1; i <= N; i++) {
			total = total * i;

		}

		System.out.println(total);

		sc.close();

	}

}
