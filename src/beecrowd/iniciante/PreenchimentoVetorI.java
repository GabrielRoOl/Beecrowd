package beecrowd.iniciante;

import java.util.Scanner;

public class PreenchimentoVetorI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        int x = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            vetor[i] = x;
            System.out.println("N[" + i + "] = " + vetor[i]);
            x *= 2;
        }
    }
}
