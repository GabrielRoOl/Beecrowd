package beecrowd.iniciante;

import java.util.Scanner;

public class Tempo_Jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h_ini = sc.nextInt();
		int h_fin = sc.nextInt();
		
		int durac = 0;
		
		if(h_ini > h_fin) {
			durac = (24 - h_ini) + h_fin;
			System.out.println("O JOGO DUROU " + durac + " HORA(S)");
		} else if(h_fin > h_ini){
			durac = (h_ini - h_fin) * (-1);
			System.out.println("O JOGO DUROU " + durac + " HORA(S)");
		} else {
			durac = 24;
			System.out.println("O JOGO DUROU " + durac + " HORA(S)");
		}
		sc.close();
	}

}
