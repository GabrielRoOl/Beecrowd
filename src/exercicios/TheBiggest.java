package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class TheBiggest {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia três valores e apresente o maior dos três valores
		 * lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
		 * 
		 * 
		 * 
		 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um
		 * segundo passo, portanto é necessário para chegar no resultado esperado.
		 * 
		 * Entrada O arquivo de entrada contém três valores inteiros.
		 * 
		 * Saída Imprima o maior dos três valores seguido por um espaço e a mensagem
		 * "eh o maior".
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a, b, c, abs, maior;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		// formula para calcular o maior entre a e b
		abs = (a + b + Math.abs(a - b)) / 2;

		// formula para calcular o maior entre o resultado de abs c
		maior = (abs + c + Math.abs(abs - c)) / 2;

		System.out.println(maior + " eh o maior");

		sc.close();
	}

}
