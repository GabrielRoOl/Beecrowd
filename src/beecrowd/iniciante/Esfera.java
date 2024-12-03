package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio = sc.nextDouble();
		double pi = 3.14159;

		double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);

		System.out.println("VOLUME = " + String.format("%.3f", volume));

	}

}
