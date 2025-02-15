package beecrowd.iniciante;

import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = N - 1; i >= 1; i--) {
            N *= i;
        }
        System.out.println(N);
    }
}
