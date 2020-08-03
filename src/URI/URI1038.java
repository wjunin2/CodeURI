package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double cod, quant;
		cod = sc.nextInt();
		quant = sc.nextInt();

		if (cod == 1) {
			System.out.printf("Total: R$ %.2f\n", quant * 4);
		} else if (cod == 2) {
			System.out.printf("Total: R$ %.2f\n", quant * 4.50);
		} else if (cod == 3) {
			System.out.printf("Total: R$ %.2f\n", quant * 5.00);
		} else if (cod == 4) {
			System.out.printf("Total: R$ %.2f\n", quant * 2.00);
		} else {
			System.out.printf("Total: R$ %.2f\n", quant * 1.50);
		}

		sc.close();

	}

}
