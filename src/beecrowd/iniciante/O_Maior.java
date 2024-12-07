package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class O_Maior {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a, b, c, abs, maior;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		// formula para calcular o maior entre a e b
		abs = (a + b + Math.abs(a - b)) / 2;

		// formula para calcular o maior entre o resultado de abs c
		maior = (abs + c + Math.abs(abs - c)) / 2;

		System.out.println(maior + " eh o maior");

		sc.close();

	}

}
