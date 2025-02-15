package beecrowd.iniciante;

import java.util.Scanner;

public class FibonacciFacil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int z = 0;
        int um = 1;

        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {

            if (i > 0)
                System.out.print(" ");

            System.out.print(z);

            int temp = z + um;
            z = um;
            um = temp;

        }
        System.out.println();
    }
}
