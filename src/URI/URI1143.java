package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1143 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			int v1 = i;
			int v2 = i * i;
			int v3 = i * i * i;
			System.out.printf("%d %d %d\n", v1, v2, v3);
		}

		sc.close();

	}

}
