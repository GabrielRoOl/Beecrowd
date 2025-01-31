package beecrowd.iniciante;

import java.util.Scanner;

public class Maior_Posicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maior = 0;
        int position = 0;
        for (int i = 1; i <= 100; i++) {
            int x = sc.nextInt();
            if (x > maior) {
                maior = x;
                position = i;
            }
        }
        System.out.println(maior + "\n" + position);
    }
}
