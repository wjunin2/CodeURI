package URI;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class URI1006 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double A, B, C, MEDIA;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;

		System.out.printf("MEDIA = %.1f\n", MEDIA);

		input.close();
		// teste

	}

}