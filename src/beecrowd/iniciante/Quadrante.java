package beecrowd.iniciante;

import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = -1, Y = -1;

		while (X != 0 && Y != 0) {
			X = sc.nextInt();
			Y = sc.nextInt();

			if (X > 0 && Y > 0) {
				System.out.println("primeiro");
			} else if (X > 0 && Y < 0) {
				System.out.println("quarto");
			} else if (X < 0 && Y > 0) {
				System.out.println("segundo");
			} else if (X < 0 && Y < 0) {
				System.out.println("terceiro");
			}
		}

	}

}
