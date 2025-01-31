package beecrowd.iniciante;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int tabuada = 1;
        for (int i = 1; i <= 10; i++) {
            tabuada = N * i;
            System.out.println(i + " x " + N + " = " + tabuada);
        }
    }
}
