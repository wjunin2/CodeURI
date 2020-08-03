package URI;

import java.util.Scanner;

public class URI1101 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int M = leitor.nextInt();
		int N = leitor.nextInt();
		int soma = 0;
		
		while (M > 0 && N > 0) {

			if (M > N) {
				for (int i = N; i <= M; i++) {
					soma += i;
					System.out.print(i + " ");
				}
			} else {
				for (int i = M; i <= N; i++) {
					soma += i;
					System.out.print(i + " ");
				}
			}

			System.out.println("Sum=" + soma);
			M = leitor.nextInt();
			N = leitor.nextInt();
			soma = 0;

		}
		
		leitor.close();
		

	}
}
