package beecrowd.desafioCriaScript;

import java.util.ArrayList;

public class VetorPares {
    public static void main(String[] args) {

        int[] vet = new int[7];
        ArrayList<Integer> pares = new ArrayList<>();

        vet[0] = 123;
        vet[1] = 793;
        vet[2] = 79712;
        vet[3] = 19732;
        vet[4] = 1;
        vet[5] = 1732;
        vet[6] = 812;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                pares.add(vet[i]);
            }
        }

        pares.forEach(System.out::println);
    }
}
