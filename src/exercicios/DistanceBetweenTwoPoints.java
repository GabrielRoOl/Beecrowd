package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		/*
		 * Leia os quatro valores correspondentes aos eixos x e y de dois pontos
		 * quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles,
		 * mostrando 4 casas decimais, segundo a fórmula:
		 * 
		 * Distancia = 
		 * 
		 * Entrada O arquivo de entrada contém duas linhas de dados. A primeira linha
		 * contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois
		 * valores de ponto flutuante x2 y2.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, y1, y2, distance;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println(String.format("%.4f", distance));
		
		sc.close();
	}

}
