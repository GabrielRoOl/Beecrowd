package beecrowd.iniciante;

import java.util.Scanner;

public class SequenciaNumeroSoma {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M;
		int N;
		int soma = 0;
		do {
			M = sc.nextInt();
			N = sc.nextInt();
			
			if(M > 0 && N > 0) {
				
				int maior = M > N ? M : N;
				int menor = M < N ? M : N;

				for(int i = menor; i <= maior; i++) {
					System.out.print(i + " ");
					soma += i;
				}
				System.out.println("Sum=" + soma);
				soma = 0;
			}
		} while (M > 0 && N > 0);
	}
}
