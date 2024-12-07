package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		double Y = sc.nextDouble();

		double cMedio = X / Y;

		System.out.println(String.format("%.3f", cMedio) + " km/l");

		sc.close();

	}

}
