package beecrowd.iniciante;

import java.util.Scanner;

public class SomaImparesConsecutivosII {

	public static int soma(int x, int y) {
		int soma = 0;
		int maior = x > y ? x : y;
		int menor = x < y ? x : y;
		
		for( int i = menor + 1; i < maior; i++) {
			if(i % 2 != 0) {
				soma += i;
			}
		}
		return soma;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			System.out.println(soma(X, Y));
		}

	}

}
