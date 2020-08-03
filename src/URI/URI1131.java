package URI;

import java.util.Scanner;

public class URI1131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int gre;
		int nal;
		int y = 0;
		int xgre = 0;
		int xnal = 0;
		int t = 0;
		int emp = 0;

		while (y != 2) {
			nal = sc.nextInt();
			gre = sc.nextInt();

			System.out.println("Novo grenal (1-sim 2-nao)");
			y = sc.nextInt();
			if (gre > nal) {
				xgre++;
			} else if (gre < nal) {
				xnal++;
			} else {
				emp++;
			}
			t++;
		}

		System.out.println(t + " grenais");
		System.out.println("Inter:" + xnal);
		System.out.println("Gremio:" + xgre);
		System.out.println("Empates:" + emp);
		if (xnal > xgre) {
			System.out.println("Inter venceu mais");
		} else if (xnal > xgre) {
			System.out.println("Gremio venceu mais");
		} else {
			System.out.println("Nao houve vencedor");
		}

		sc.close();

	}

}
