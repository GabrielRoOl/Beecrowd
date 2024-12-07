
package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int distance = x * 2;

		System.out.println(distance + " minutos");
		sc.close();
	}

}
