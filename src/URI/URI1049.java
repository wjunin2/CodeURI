package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1049 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String t1, t2, t3;

		t1 = sc.nextLine();
		t2 = sc.nextLine();
		t3 = sc.nextLine();

		if (t1.contentEquals("vertebrado") && t2.contentEquals("ave") && t3.contentEquals("carnivoro")) {
			System.out.println("aguia");
		} else if (t1.contentEquals("vertebrado") && t2.contentEquals("ave") && t3.contentEquals("onivoro")) {
			System.out.println("pomba");
		} else if (t1.contentEquals("vertebrado") && t2.contentEquals("mamifero") && t3.contentEquals("onivoro")) {
			System.out.println("homem");
		} else if (t1.contentEquals("vertebrado") && t2.contentEquals("mamifero") && t3.contentEquals("herbivoro")) {
			System.out.println("vaca");
		} else if (t1.contentEquals("invertebrado") && t2.contentEquals("inseto") && t3.contentEquals("hematofago")) {
			System.out.println("pulga");
		} else if (t1.contentEquals("invertebrado") && t2.contentEquals("inseto") && t3.contentEquals("herbivoro")) {
			System.out.println("lagarta");
		} else if (t1.contentEquals("invertebrado") && t2.contentEquals("anelideo") && t3.contentEquals("hematofago")) {
			System.out.println("sanguessuga");
		} else {
			System.out.println("minhoca");
		}

		sc.close();

	}

}
