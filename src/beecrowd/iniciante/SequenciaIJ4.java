package beecrowd.iniciante;

import java.util.Locale;

public class SequenciaIJ4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		for (double i = 0; i <= 2.0 + 0.01; i += 0.2) {
			for (double j = 1; j <= 3; j++) {
				if (i >= 2.0 - 0.01 || i == 0.0 || i == 1.0) {
					System.out.println("I=" + String.format("%.0f", i) + " J=" + String.format("%.0f", j + i));
				} else {
					System.out.println("I=" + String.format("%.1f", i) + " J=" + String.format("%.1f", j + i));
				}
			}
		}

	}

}
