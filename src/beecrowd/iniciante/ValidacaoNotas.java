package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoNotas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double media = 1;

		double a1 = sc.nextDouble();
		while (a1 < 0.0 || a1 > 10.0) {
			System.out.println("nota invalida");
			a1 = sc.nextDouble();
		}
		double a2 = sc.nextDouble();
		while (a2 < 0.0 || a2 > 10.0) {
			System.out.println("nota invalida");
			a2 = sc.nextDouble();
		}

		media = (a1 + a2) / 2;

		System.out.println("media = " + String.format("%.2f", media));

	}

}
