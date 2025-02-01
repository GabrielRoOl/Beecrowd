package beecrowd.iniciante;

import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.next();
        int qtd;
        int c = 0;
        int r = 0;
        int s = 0;
        int total = 0;
        String tipo;

        for (int i = 0; i < N; i++) {
            qtd = sc.nextInt();
            sc.next();
            tipo = sc.next();
            if (tipo.equalsIgnoreCase("C")) {
                c += qtd;
            } else if (tipo.equalsIgnoreCase("R")) {
                r += qtd;
            } else if (tipo.equalsIgnoreCase("S")) {
                s += qtd;
            }
            total += qtd;
        }
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + c);
        System.out.println("Total de ratos: " + r);
        System.out.println("Total de sapos: " + s);

        sc.close();
    }
}
