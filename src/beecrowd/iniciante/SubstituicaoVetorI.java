package beecrowd.iniciante;

import java.util.Scanner;

public class SubstituicaoVetorI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        int x = 0;

        for (int i = 0; i < 10; i++) {
            x = sc.nextInt();
            if (x <= 0) {
                vetor[i] = 1;
            } else {
                vetor[i] = x;
            }
        }

        for (int z = 0; z < 10; z++) {
            System.out.println("X[" + z + "] = " + vetor[z]);
        }
    }
}
