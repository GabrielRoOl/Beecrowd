package beecrowd.iniciante;

import java.util.Scanner;

public class Soma_Impares_Consecutivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		int menor = X < Y ? X : Y;
		int maior = X > Y ? X : Y;

		int soma = 0;

		for (int i = menor + 1; i < maior; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}

		System.out.println(soma);

	}

}
