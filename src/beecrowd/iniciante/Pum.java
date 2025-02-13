package beecrowd.iniciante;

import java.util.Scanner;

public class Pum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = 0;

		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < 3; j++) {
				N++;
				System.out.print(N + " ");
			}
			N++;
			System.out.println("PUM");
		}

	}

}
