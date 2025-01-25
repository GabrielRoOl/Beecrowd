package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Positivo_Media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A;
		int positivos = 0;
		double soma_positivos = 0;

		for (int i = 0; i < 6; i++) {
			A = sc.nextDouble();

			if (A > 0) {
				positivos++;
				soma_positivos += A;
			}

		}

		System.out.println(positivos + " valores positivos");
		System.out.println(String.format("%.1f", (soma_positivos / positivos)));

		sc.close();
	}

}
