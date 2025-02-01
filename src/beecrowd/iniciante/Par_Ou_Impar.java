package beecrowd.iniciante;

import java.util.Scanner;

public class Par_Ou_Impar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		while (N > 0) {
			
			int x = sc.nextInt();
			if (x == 0) {
				System.out.println("NULL");
			} else if(x % 2 == 0){
				System.out.print("EVEN ");
				if(x > 0){
					System.out.println("POSITIVE");
				}else{
					System.out.println("NEGATIVE");
				}
			} else{
				System.out.print("ODD ");
				if(x > 0){
					System.out.println("POSITIVE");
				} else{
					System.out.println("NEGATIVE");
				}
			}
			N--;
		}

	}

}
