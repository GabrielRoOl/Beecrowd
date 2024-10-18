package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculation {

	public static void main(String[] args) {
		/*
		 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
		 * 
		 * Entrada O arquivo de entrada contém duas linhas de dados. Em cada linha
		 * haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas
		 * decimais.
		 * 
		 * Saída A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
		 * lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O
		 * valor deverá ser apresentado com 2 casas após o ponto.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoProduto0 = sc.nextInt();
		int qtdPecas0 = sc.nextInt();
		double valorProduto0 = sc.nextDouble();
		
		int codigoProduto1 = sc.nextInt();
		int qtdPecas1 = sc.nextInt();
		double valorProduto1 = sc.nextDouble();
				
		double valorTotal0 = qtdPecas0 * valorProduto0;
		double valorTotal1 = qtdPecas1 * valorProduto1;
		
		double total = valorTotal0 + valorTotal1;
		
		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));
	}

}
