
package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Distancia_Entre_Dois_Pontos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();

		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println(String.format("%.4f", distance));
		sc.close();

	}

}
