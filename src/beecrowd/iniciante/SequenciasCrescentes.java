package beecrowd.iniciante;

import java.util.Scanner;

public class SequenciasCrescentes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = -1;
		
		while(x != 0) {
			x = sc.nextInt();
			for(int i = 0; i < x; i++) {
				System.out.println(i);
			}
		}
	}
}
