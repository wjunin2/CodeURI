package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1134 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int prod = sc.nextInt();
		int alc = 0;
		int gas = 0;
		int die = 0;

		while (prod != 4) {
			if (prod == 1) {
				alc += 1;
				prod = sc.nextInt();
			} else if (prod == 2) {
				gas += 1;
				prod = sc.nextInt();
			} else if (prod == 3) {
				die += 1;
				prod = sc.nextInt();
			} else {
				prod = sc.nextInt();
			}

		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + die);

		sc.close();

	}

}
