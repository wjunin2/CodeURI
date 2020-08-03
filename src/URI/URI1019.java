package URI;

import java.util.Scanner;

public class URI1019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tempo = sc.nextInt();

		int totalhoras = tempo / 3600;
		tempo = tempo % 3600;

		int totalminutos = tempo / 60;
		tempo = tempo % 60;

		int totalsec = tempo;

		System.out.println(totalhoras + ":" + totalminutos + ":" + totalsec);

		sc.close();

	}

}
