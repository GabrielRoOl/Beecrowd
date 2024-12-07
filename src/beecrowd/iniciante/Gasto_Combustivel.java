package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Gasto_Combustivel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tempo = sc.nextInt();
		int velM = sc.nextInt();

		int tempVel = tempo * velM;
		double qtdLitros = tempVel / 12.0;

		System.out.println(String.format("%.3f", qtdLitros));

		sc.close();
	}

}
