package URI;

import java.util.Scanner;

public class URI1042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int maior = 0;
		int medio = 0;
		int menor = 0;

		if (a > b && a > c && b > c) {
			maior = a;
			medio = b;
			menor = c;
		} else if (a > b && a > c && b < c) {
			maior = a;
			medio = c;
			menor = b;
		} else if (b > c && b > a && c > a) {
			maior = b;
			medio = c;
			menor = a;
		} else if (b > c && b > a && c < a) {
			maior = b;
			medio = a;
			menor = c;
		} else if (c > b && c > a && a > b) {
			maior = c;
			medio = a;
			menor = b;
		} else if (c > b && c > a && a < b) {
			maior = c;
			medio = b;
			menor = a;
		}

		System.out.println(menor);
		System.out.println(medio);
		System.out.println(maior);
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		sc.close();

	}

}
