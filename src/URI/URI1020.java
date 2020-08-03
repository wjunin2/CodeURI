package URI;

import java.util.Scanner;

public class URI1020 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int entrada, anos, meses, dias;

		entrada = sc.nextInt();

		anos = entrada / 365;
		entrada = entrada % 365;

		meses = entrada / 30;
		entrada = entrada % 30;

		dias = entrada;

		System.out.println(anos + " ano (s)");
		System.out.println(meses + " mes (es)");
		System.out.println(dias + " dia (s)");

		sc.close();

	}

}
