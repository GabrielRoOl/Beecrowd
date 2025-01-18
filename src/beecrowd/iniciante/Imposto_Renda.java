package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Imposto_Renda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();

		double imposto = 0;

		if (salario <= 2000.00 && salario > 0.0) {
			System.out.println("Isento");
		} else if (salario > 2000.00 && salario <= 3000.00) {
			imposto = (salario - 2000) * 8 / 100;
			System.out.println("R$ " + String.format("%.2f", imposto));
		} else if (salario > 3000.00 && salario <= 4500) {
			imposto = (1000 * 8 / 100) + ((salario - 3000) * 18 / 100);
			System.out.println("R$ " + String.format("%.2f", imposto));
		} else if (salario > 4500) {
			imposto = (1000 * 8 / 100) + (1500 * 18 / 100) + ((salario - 4500) * 28 / 100);
			System.out.println("R$ " + String.format("%.2f", imposto));
		}

		sc.close();

	}

}
