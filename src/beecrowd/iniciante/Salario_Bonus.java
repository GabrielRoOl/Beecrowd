package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Salario_Bonus {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nomeVendedor = sc.nextLine();
		double salarioFixo = sc.nextDouble();
		double totalVendas = sc.nextDouble();

		double comisao = salarioFixo + (totalVendas * 0.15);

		System.out.println("TOTAL = R$ " + String.format("%.2f", comisao));

	}

}
