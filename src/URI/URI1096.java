package URI;

public class URI1096 {

	public static void main(String[] args) {

		int i = 1;
		int j = 7;

		while (i != 11) {

			System.out.println("I=" + i + " J=" + j);

			j -= 1;

			if (j == 4) {
				i += 2;
				j = j + 3;
			}
		}

	}

}
