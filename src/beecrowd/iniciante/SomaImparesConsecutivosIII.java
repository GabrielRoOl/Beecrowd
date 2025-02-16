package beecrowd.iniciante;

import java.util.Scanner;

public class SomaImparesConsecutivosIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int X, Y = -1;
        int soma = 0;
        for (int i = 0; i < N; i++) {
            X = sc.nextInt();
            X = X % 2 != 0 ? X : X + 1;
            Y = sc.nextInt();
            for (int j = 1; j <= Y; j++) {
                soma += X;
                X += 2;
            }
            System.out.println(soma);
            soma = 0;
        }
    }
}
