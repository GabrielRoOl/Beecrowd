package beecrowd.iniciante;

import java.util.Locale;

public class SequenciaSII {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int s = 1;
        double soma = 0;

        for (int i = 1; i <= 39; i += 2) {
            soma += (double) i / s;
            s *= 2;

        }
        System.out.println(String.format("%.2f", soma));
    }
}
