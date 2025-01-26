package beecrowd.iniciante;

import java.util.Scanner;

public class Quadrado_Pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int result = 1;
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				result = i * i;
				System.out.println(i + "^2 = " + result);

			}
		}

	}

}
