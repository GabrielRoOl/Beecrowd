package beecrowd.iniciante;

import java.util.Scanner;

public class Intevalo_II {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int out = 0;
		int in = 0;
		
		while(N != 0) {
			int X = sc.nextInt();
			if(X >= 10 && X <= 20) {
				in++;
			}else {
				out++;
			}
			N--;
		}
		System.out.println(in + " in");
		System.out.println(out + " out");

	}

}
