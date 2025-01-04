package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int qtd = sc.nextInt();

		double pedido = 0;

		switch (p) {
		case 1:
			pedido = qtd * 4.0;
			break;
		case 2:
			pedido = qtd * 4.5;
			break;
		case 3:
			pedido = qtd * 5.0;
			break;
		case 4:
			pedido = qtd * 2.0;
			break;
		case 5:
			pedido = qtd * 1.5;
			break;
		default:
			break;
		}
		System.out.println("Total: R$ " + String.format("%.2f", pedido));

	}

}
