package beecrowd.iniciante;

import java.util.Scanner;

public class TDA_Racional {
	
	public static double soma(int n1, int d1, int d2, int n2) {
		return (n1 * d2 + n2 * d1) / (d1 * d2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String entr = sc.nextLine();		
		String[] vetor = entr.split(" ");

		int N1 = Integer.parseInt(vetor[0]);
		int D1 = Integer.parseInt(vetor[2]);
		int N2 = Integer.parseInt(vetor[6]);
		int D2 = Integer.parseInt(vetor[4]);

		System.out.println((double)soma(N1, D1, D2, N2));
		

	}

}