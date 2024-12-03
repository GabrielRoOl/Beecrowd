package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int nmrFuncionario, hrsTrabalhadas;
		double salario;

		nmrFuncionario = sc.nextInt();
		hrsTrabalhadas = sc.nextInt();
		salario = sc.nextDouble();

		salario *= hrsTrabalhadas;

		System.out.println("NUMBER = " + nmrFuncionario);
		System.out.println("SALARY = U$ " + String.format("%.2f", salario));

	}

}
