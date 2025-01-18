package beecrowd.iniciante;

import java.util.Scanner;

public class Tempo_Evento {

	public static int hora(String string) {
		int nmr = Integer.parseInt(string.split(" : ")[0].trim());
		return nmr;
	}

	public static int min(String string) {
		int nmr = Integer.parseInt(string.split(" : ")[1].trim());
		return nmr;
	}

	public static int seg(String string) {
		int nmr = Integer.parseInt(string.split(" : ")[2].trim());
		return nmr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Dia ");
		int dia_ini = sc.nextInt();
		sc.nextLine();

		String dt_ini = sc.nextLine();

		int hora_ini = hora(dt_ini);
		int min_ini = min(dt_ini);
		int seg_ini = seg(dt_ini);

		System.out.print("Dia ");
		int dia_fin = sc.nextInt();
		sc.nextLine();

		String dt_fin = sc.nextLine();

		int hora_fin = hora(dt_fin);
		int min_fin = min(dt_fin);
		int seg_fin = seg(dt_fin);

		int W = dia_fin - dia_ini;
		int X = hora_fin >= hora_ini ? hora_fin - hora_ini : (24 - hora_ini) + hora_fin;
		int Y = min_fin >= min_ini ? min_fin - min_ini : (60 - min_ini) + min_fin;
		int Z = seg_fin >= seg_ini ? seg_fin - seg_ini : (60 - seg_ini) + seg_fin;

		System.out.println(W + " dia(s)");
		System.out.println(X + " hora(s)");
		System.out.println(Y + " minuto(s)");
		System.out.println(Z + " segundo(s)");

	}

}
