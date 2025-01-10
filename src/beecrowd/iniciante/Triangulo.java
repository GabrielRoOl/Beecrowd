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
		
		double menor = x;
		
		if(y < z && y < x) {
			menor = y;
		} 
		else if( z < y && z < x) {
			menor = z;
		}
		
		System.out.println(menor);
		
	}

}
