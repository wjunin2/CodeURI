package URI;

import java.util.Scanner;

public class URI1021 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println("NOTAS:");
		
				
		System.out.println(N / 100 + " nota(s) de R$ 100.00");
		N = N % 100; 
		System.out.println(N / 50 + " nota(s) de R$ 50.00");
		N = N % 50; 
		System.out.println(N / 20 + " nota(s) de R$ 20.00");
		N = N % 20; 
		System.out.println(N / 10 + " nota(s) de R$ 10.00");
		N = N % 10; 
		System.out.println(N / 5 + " nota(s) de R$ 5.00");
		N = N % 5; 
		System.out.println(N / 2 + " nota(s) de R$ 2.00");
		N = N % 2;
		
		System.out.println("MOEDAS:");
		
		
		System.out.println(N / 1 + " moeda(s) de R$ 1.00");
		N = N % 1;
		System.out.println(N / 0.5 + " moeda(s) de R$ 0.50");
		System.out.println(N / 1 + " moeda(s) de R$ 0.25");
		System.out.println(N / 1 + " moeda(s) de R$ 0.20");
		System.out.println(N / 1 + " moeda(s) de R$ 0.10");
		System.out.println(N / 1 + " moeda(s) de R$ 0.05");
		System.out.println(N / 1 + " moeda(s) de R$ 0.01");
		
		
		sc.close();

	}

}
