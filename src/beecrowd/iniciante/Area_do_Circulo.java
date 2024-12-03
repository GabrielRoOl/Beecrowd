package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Area_do_Circulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double a = sc.nextDouble();
		
		double area = pi * Math.pow(a, 2);
		
		System.out.println("A=" + String.format("%.4f", area));

	}

}
