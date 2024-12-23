package beecrowd.iniciante;
import java.util.Locale;
import java.util.Scanner;

public class Notas_Moedas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        int valor = (int) Math.round(x * 100); 
        int[] notas = {10000, 5000, 2000, 1000, 500, 200}; 
        int[] moedas = {100, 50, 25, 10, 5, 1}; 

        System.out.println("NOTAS:");

        for (int nota : notas) {
            int quantidadeNotas = valor / nota;
            valor = valor % nota;
            System.out.println(quantidadeNotas + " nota(s) de R$ " + String.format("%.2f", nota / 100.0));
        }

        System.out.println("MOEDAS:");

        for (int moeda : moedas) {
            int quantidadeMoedas = valor / moeda;
            valor = valor % moeda;
            System.out.println(quantidadeMoedas + " moeda(s) de R$ " + String.format("%.2f", moeda / 100.0));
        }

        sc.close();
    }
}
