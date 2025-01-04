package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Media_III {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double N1 = sc.nextDouble();
		double N2 = sc.nextDouble();
		double N3 = sc.nextDouble();
		double N4 = sc.nextDouble();
		double exame = 1;
		double media = Math.round((((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10) * 10.0) / 10.0;


		System.out.println("Media: " + String.format("%.1f", media));

		if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		} else if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (media >= 5.0 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			exame = sc.nextDouble();
			System.out.println("Nota do exame: " + String.format("%.1f", exame));
			exame = (exame + media) / 2;
			if (exame >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else if (exame <= 4.9) {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: " + String.format("%.1f", exame));
		}
		sc.close();
	}

}
