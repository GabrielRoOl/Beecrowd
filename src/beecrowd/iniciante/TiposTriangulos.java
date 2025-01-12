package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class TiposTriangulos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double aux = 0;

		// lógica para manter o maior 'a' número.
		if (a < b && b > c) {
			aux = b;
			b = a;
			a = aux;

		} else if (a < c && c > b) {
			aux = c;
			c = a;
			a = aux;
		}

		if (a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		}else {
			if ((a * a) == ((b * b) + (c * c))) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if ((a * a) > ((b * b) + (c * c))) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if ((a * a) < ((b * b) + (c * c))) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (a == b && b == c && c == a) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			else if (a == b || b == c || a == c) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}

	}

}
