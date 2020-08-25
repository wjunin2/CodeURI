package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		String nome;
		double salario, vendas, x;
		
		nome = sc.nextLine();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();
		
		x = ((15 * vendas) / 100) + salario ;
		
		System.out.printf("TOTAL = R$ %.2f\n", x);
		
		
		sc.close();

	}

}
