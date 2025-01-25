package beecrowd.iniciante;

import java.util.Scanner;

public class Pares_Entre_Cinco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		int pares = 0;

		for (int i = 0; i < 5; i++) {
			x = sc.nextInt();

			if (x % 2 == 0)
				pares++;
		}
		System.out.println(pares + " valores pares");
	}

}
