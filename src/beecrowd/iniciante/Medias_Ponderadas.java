package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Medias_Ponderadas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        while (N > 0) {
            double r1 = sc.nextDouble();
            double r2 = sc.nextDouble();
            double r3 = sc.nextDouble();

            double mediaPonderada = ((r1 * 2) + (r2 * 3) + (r3 * 5)) / 10;

            System.out.println(String.format("%.1f", mediaPonderada));

            N--;
        }
    }
}
