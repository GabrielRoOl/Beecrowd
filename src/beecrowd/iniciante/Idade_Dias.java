package beecrowd.iniciante;

import java.util.Scanner;

public class Idade_Dias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idadeDias = sc.nextInt();

		int anos = idadeDias / 365;
		idadeDias = idadeDias % 365;

		System.out.println(anos + " ano(s)");

		int meses = idadeDias / 30;
		idadeDias = idadeDias % 30;

		System.out.println(meses + " mes(es)");

		System.out.println(idadeDias + " dia(s)");

		sc.close();
	}

}
