package beecrowd.iniciante;

import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = 1;

		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			N = i;
			for (int j = 0; j < 3; j++) {
				System.out.print(N + " ");
				N *= i;
			}
			System.out.println();
		}
	}

}
