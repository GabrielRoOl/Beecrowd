package beecrowd.iniciante;

import java.util.Scanner;

public class Multiplos13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int maior = X > Y ? X : Y;
		int menor = X < Y ? X : Y;
		
		int soma = 0;
		
		for(int i = menor; i <= maior; i++) {
			if(i % 13 != 0) {
				soma += i;
			}
		}
		System.out.println(soma);
	}

}
