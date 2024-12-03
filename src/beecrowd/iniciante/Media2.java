package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, MEDIA;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;
		System.out.println("MEDIA = " + String.format("%.1f", MEDIA));

		sc.close();

	}

}
