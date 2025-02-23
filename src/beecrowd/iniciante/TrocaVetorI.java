package beecrowd.iniciante;

import java.util.Scanner;

public class TrocaVetorI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] N = new int[20];
        int aux = 0;

        for (int i = 0; i < 20; i++) {
            N[i] = sc.nextInt();
        }

        for (int j = 0; j < 10; j++) {
            aux = N[j];
            N[j] = N[19 - j];
            N[19 - j] = aux;
        }

        for (int z = 0; z < 20; z++) {
            System.out.println("N[" + z + "] = " + N[z]);
        }
    }
}
