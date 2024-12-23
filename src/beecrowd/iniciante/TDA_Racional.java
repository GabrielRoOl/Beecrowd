package beecrowd.iniciante;

import java.util.Scanner;

public class TDA_Racional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String entr = sc.nextLine();
		String[] vetor = entr.split(" ");
		
		int N1 = Integer.parseInt(vetor[0]);
		int D2 = Integer.parseInt(vetor[2]);
		
		
		for (String p : vetor) {
			System.out.println(p);
		}

	}

}