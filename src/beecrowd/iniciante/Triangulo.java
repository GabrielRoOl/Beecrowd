package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		
		if(x + y <= z || x + z <= y || z + y <= x) {
			double area = ((x + y) * z) / 2;
			System.out.println("Area = " + area);
		} else {
			double perimetro = x + y + z;
			System.out.println("Perimetro = " + perimetro);			
		}
		
		
	}

}
