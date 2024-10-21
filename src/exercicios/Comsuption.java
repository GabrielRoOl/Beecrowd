package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Comsuption {

	public static void main(String[] args) {
		/*
		 * Calcule o consumo médio de um automóvel sendo fornecidos a distância total
		 * percorrida (em Km) e o total de combustível gasto (em litros).
		 * 
		 * Entrada O arquivo de entrada contém dois valores: um valor inteiro X
		 * representando a distância total percorrida (em Km), e um valor real Y
		 * representando o total de combustível gasto, com um dígito após o ponto
		 * decimal.
		 * 
		 * Saída Apresente o valor que representa o consumo médio do automóvel com 3
		 * casas após a vírgula, seguido da mensagem "km/l".
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		double Y = sc.nextDouble();

		double cMedio = X / Y;

		System.out.println(String.format("%.3f", cMedio) + " km/l");

		sc.close();

	}

}
