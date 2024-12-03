package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Calculo_Simples {

	public static void main(String[] args) {
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
