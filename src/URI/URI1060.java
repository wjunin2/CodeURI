package URI;

import java.util.Scanner;

public class URI1060 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int y = 0;

		for (int i = 1; i <= 6; i++) {
			double x = sc.nextDouble();
			if (x >= 0) {
				y = y + 1;
			}

		}

		System.out.println(y + " valores positivos");

		sc.close();

	}

}
