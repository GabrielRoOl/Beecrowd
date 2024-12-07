package beecrowd.iniciante;

import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		System.out.println(x);
		int cem = x / 100;
		int valor = x % 100;
		System.out.println(cem + " nota(s) de R$ 100,00");
		int cinquenta = valor / 50;
		valor = valor % 50;
		System.out.println(cinquenta + " nota(s) de R$ 50,00");
		int vinte = valor / 20;
		valor = valor % 20;
		System.out.println(vinte + " nota(s) de R$ 20,00");
		int dez = valor / 10;
		valor = valor % 10;
		System.out.println(dez + " nota(s) de R$ 10,00");
		int cinco = valor / 5;
		valor = valor % 5;
		System.out.println(cinco + " nota(s) de R$ 5,00");
		int dois = valor / 2;
		valor = valor % 2;
		System.out.println(dois + " nota(s) de R$ 2,00");

		System.out.println(valor + " nota(s) de R$ 1,00");

		sc.close();
	}

}
