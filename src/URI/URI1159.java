package URI;

import java.util.Scanner;

public class URI1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = 1;
		int total = 0;

		while (X != 0) {
			X = sc.nextInt();

			if (X != 0) {

				if (X % 2 == 0) {
					for (int i = 1; i <= 5; i++) {
						total += X;
						X += 2;
					}
				}
				if (X % 2 == 1) {
					X = X + 1;
					for (int i = 1; i <= 5; i++) {
						total += X;
						X += 2;
					}
				}
				System.out.println(total);
				total = 0;

			}

		}

		sc.close();

	}

}

//Scanner leitor = new Scanner(System.in);
//int X = leitor.nextInt();
//int soma=0, cont=0;
//while (X != 0) {
//	cont = 0;
//	soma = 0;
//	while (cont < 5) {
//		if (X % 2 == 0) {
//			soma += X;
//			cont++;
//		}
//		X++;
//	}
//	System.out.println(soma);
//	X = leitor.nextInt();
//}
