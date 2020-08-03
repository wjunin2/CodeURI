package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1066 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int N;
		int par = 0;
		int impar = 0;
		int positivo = 0;
		int negativo = 0;

		for (int i = 0; i < 5; i++) {
			N = sc.nextInt();
			if (N % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			if (N > 0) {
				positivo++;
			}
			if (N < 0) {
				negativo++;
			}
		}

		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");

		sc.close();

	}

}
