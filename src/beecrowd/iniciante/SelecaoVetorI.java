package beecrowd.iniciante;

import java.util.Scanner;

public class SelecaoVetorI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];

        int x = 0;

        for (int i = 0; i < 5; i++) {
            x = sc.nextInt();
            if (x >= 0) {
                vetor[i] = x;
            }
        }

    }
}
