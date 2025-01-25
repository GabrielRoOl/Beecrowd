package beecrowd.iniciante;

import java.util.Scanner;

public class Seis_Numeros_Impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		int impar = 0;
		int i = 0;

		impar = X % 2 == 1 ? X : X + 1;

		while (i != 6) {

			System.out.println(impar);
			impar += 2;

			i++;
		}

	}

}
