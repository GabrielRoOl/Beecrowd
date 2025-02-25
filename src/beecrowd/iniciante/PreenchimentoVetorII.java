package beecrowd.iniciante;

import java.util.Scanner;

public class PreenchimentoVetorII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int z = 0;
        int[] N = new int[1000];

        N[0] = z;

        for (int i = 1; i < 1000; i++) {
            if (z != T - 1) {
                z++;
                N[i] = z;
            } else {
                z = 0;
            }
        }

        for (int j = 0; j < 1000; j++) {
            System.out.println("N[" + j + "] = " + N[j]);
        }
    }
}
