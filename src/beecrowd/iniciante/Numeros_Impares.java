
package beecrowd.iniciante;

import java.util.Scanner;

public class Numeros_Impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		for(int i = 0; i <= X; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}

	}

}
