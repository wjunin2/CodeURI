package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num1, num2;
		double valor1, valor2, total;

		sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();
		sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();

		total = (num1 * valor1) + (num2 * valor2);

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

		sc.close();

	}

}
