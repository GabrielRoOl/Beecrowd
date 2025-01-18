package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Aumento_Salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double ajuste = 0;

        double salario = sc.nextDouble();

        String novo = "Novo salario: ";
        String reajuste = "Reajuste ganho: ";

        if (salario <= 400.0 && salario > 0.0) {
            ajuste = salario * 15 / 100;
            salario += ajuste;
            System.out.println(novo + String.format("%.2f", salario));
            System.out.println(reajuste + String.format("%.2f", ajuste));
            System.out.println("Em percentual: 15 %");
        } else if (salario > 400.00 && salario <= 800.00) {
            ajuste = salario * 12 / 100;
            salario += ajuste;
            System.out.println(novo + String.format("%.2f", salario));
            System.out.println(reajuste + String.format("%.2f", ajuste));
            System.out.println("Em percentual: 12 %");
        } else if (salario > 800.00 && salario <= 1200.00) {
            ajuste = salario * 10 / 100;
            salario += ajuste;
            System.out.println(novo + String.format("%.2f", salario));
            System.out.println(reajuste + String.format("%.2f", ajuste));
            System.out.println("Em percentual: 10 %");
        } else if (salario > 1200.00 && salario <= 2000.00) {
            ajuste = salario * 7 / 100;
            salario += ajuste;
            System.out.println(novo + String.format("%.2f", salario));
            System.out.println(reajuste + String.format("%.2f", ajuste));
            System.out.println("Em percentual: 7 %");
        } else {
            ajuste = salario * 4 / 100;
            salario += ajuste;
            System.out.println(novo + String.format("%.2f", salario));
            System.out.println(reajuste + String.format("%.2f", ajuste));
            System.out.println("Em percentual: 4 %");
        }
    }
}
