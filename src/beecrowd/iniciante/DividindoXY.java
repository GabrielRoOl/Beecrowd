package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class DividindoXY {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double div = 1;
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			if(Y == 0) {
				System.out.println("divisao impossivel");
			}else {
				div = (double) X / Y;
				System.out.println(String.format("%.1f", div));
			}
		}

	}

}
