package beecrowd.iniciante;

import java.util.Scanner;

public class QuadradoCubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 0;

        int x = sc.nextInt();

        for(int i = 1; i <= x; i++){
            N = i;
            System.out.println(N + " " + N * N + " " + N * N * N);
        }
    }
}
