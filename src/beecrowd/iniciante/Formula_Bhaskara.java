package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Formula_Bhaskara {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double delta = Math.pow(B, 2) - (4 * A * C);

		if (delta < 0) {
			System.out.println("Impossivel calcular");
			sc.close();
			return;
		}

		if (A == 0) {
			System.out.println("Impossivel calcular");
		} else {
			delta = Math.sqrt(delta);
			double bhaskara_I = (-B - delta) / (2 * A);
			double bhaskara_II = (-B + delta) / (2 * A);
			System.out.println("R1 = " + String.format("%.5f", bhaskara_II));
			System.out.println("R2 = " + String.format("%.5f", bhaskara_I));
		}
		sc.close();
	}

}
