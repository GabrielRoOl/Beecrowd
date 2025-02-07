package beecrowd.iniciante;

public class SequenciaIJ3 {

	public static void main(String[] args) {

		int x = 7;
		for (int i = 1; i <= 9; i += 2) {
			for (int j = 3; j >= 1; j--) {
				System.out.println("I=" + i + " J=" + x);
				x--;
			}
			x += 5;

		}

	}

}
