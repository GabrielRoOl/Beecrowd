package exercicios;

import java.util.Scanner;

public class ProdutoSimples {

	public static void main(String[] args) {
		/*
		 * Leia dois valores inteiros. A seguir, calcule o produto entre estes dois
		 * valores e atribua esta operação à variável PROD. A seguir mostre a variável
		 * PROD com mensagem correspondente.
		 * 
		 * Entrada O arquivo de entrada contém 2 valores inteiros.
		 * 
		 * Saída Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo,
		 * com um espaço em branco antes e depois da igualdade. Não esqueça de imprimir
		 * o fim de linha após o produto, caso contrário seu programa apresentará a
		 * mensagem: “Presentation Error”.
		 */
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		A = sc.nextInt();
		B = sc.nextInt();
		PROD = A * B;
		System.out.println("PROD = " + PROD);
	}

}
