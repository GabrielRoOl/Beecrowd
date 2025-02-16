package beecrowd.iniciante;

import java.util.Locale;

public class SequenciaS {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double S = 0;
        for (int i = 1; i <= 100; i++) {
            S += (double) 1 / i;
        }
        System.out.println(String.format("%.2f", S));
    }
}
