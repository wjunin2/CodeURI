package URI;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1040 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0.0");
		double N1 = sc.nextDouble();
		double N2 = sc.nextDouble();
		double N3 = sc.nextDouble();
		double N4 = sc.nextDouble();
		
		double MEDIA = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
		System.out.println("Media: " + df.format(MEDIA));
		
		if (MEDIA >= 7) {
			System.out.println("Aluno aprovado.");
		} else if (MEDIA < 7 && MEDIA >= 5) {
			System.out.println("Aluno em exame.");
			double NExame = sc.nextDouble();
			System.out.println("Nota do exame: " + df.format(NExame));
			MEDIA = (MEDIA + NExame) / 2;
			if (MEDIA >= 5) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: " + df.format(MEDIA));
		} else {
			System.out.println("Aluno reprovado.");
		}
		
		sc.close();

	}

}
