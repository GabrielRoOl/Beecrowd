package beecrowd.iniciante;

import java.util.Scanner;

public class Sort_Simples {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();

		int menor, meio, maior;

		if (x1 <= x2 && x1 <= x3) {
			menor = x1;
			if (x2 < x3) {
				meio = x2;
				maior = x3;
			} 
			else {
				meio = x3;
				maior = x2;
			}
		} else if (x2 <= x1 && x2 <= x3) {
			menor = x2;
			if (x1 < x3) {
				meio = x2;
				maior = x3;
			} 
			else {
				meio = x3;
				maior = x2;
			}
		} 
		else {
			menor = x3;
			if (x2 < x1) {
				meio = x2;
				maior = x1;
			} 
			else {
				meio = x2;
				maior = x1;

			}
		}

		System.out.println(menor);
		System.out.println(meio);
		System.out.println(maior);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);

	}

}
