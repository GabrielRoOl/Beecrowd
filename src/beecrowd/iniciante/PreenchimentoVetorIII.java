package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class PreenchimentoVetorIII {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double X = sc.nextInt();
        double[] N = new double[100];

        for (int i = 0; i < 100; i++) {
            N[i] = X;
            X /= 2;
        }

        for (int j = 0; j < 100; j++) {
            System.out.println("N[" + j + "] = " + String.format("%.4f", N[j]));
        }
    }
}
