package beecrowd.iniciante;

import java.util.Scanner;

public class Primo {

    public static int primo(int x) {
        if (x < 2) {
            return 0;
        }
        for (int i = 2; i <= x; i++) {
            if (x % 2 == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 2; i <= N; i++) {
            int X = sc.nextInt();

            if (primo(X) == 0) {
                System.out.println(X + " nao eh primo");
            } else {
                System.out.println(X + " eh primo");
            }
        }
    }
}
