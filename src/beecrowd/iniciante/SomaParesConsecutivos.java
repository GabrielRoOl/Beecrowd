package beecrowd.iniciante;

import java.util.Scanner;

public class SomaParesConsecutivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = -1;
        int soma = 0;
        while (x != 0) {
            x = sc.nextInt();
            if (x != 0) {
                x = x % 2 == 0 ? x : x + 1;
                for (int i = 1; i <= 5; i++) {
                    soma += x;
                    x += 2;
                }
                System.out.println(soma);
                soma = 0;
            }
        }
    }
}
