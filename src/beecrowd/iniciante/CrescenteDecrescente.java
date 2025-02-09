package beecrowd.iniciante;

import java.util.Scanner;

public class CrescenteDecrescente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = 0, Y = 1;

		while (X != Y) {
			X = sc.nextInt();
			Y = sc.nextInt();

			if (X > Y)
				System.out.println("Decrescente");
			else if (Y > X)
				System.out.println("Crescente");

		}
	}

}
