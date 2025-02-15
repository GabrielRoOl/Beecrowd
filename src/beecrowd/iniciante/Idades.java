package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = 0;

        int cont = 0, soma = 0;

        while (x >= 0) {
            x = sc.nextInt();
            if (x > 0) {
                soma += x;
                cont++;
            }
        }
        double result = (double) soma / cont;
        System.out.println(String.format("%.2f", result));
    }
}
