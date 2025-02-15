package beecrowd.iniciante;

import java.util.Scanner;

public class SequenciaLogica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i = 1; i <= y; i++){
            for(int j = 1; j <= x; j++){
                if(i != y){
                    System.out.print(i);
                }
                if(j != x){
                    System.out.print(" ");
                }
                if(i == y){
                    System.out.print(i);
                }
                if(j == x){
                    System.out.println();
                }
                i++;
            }
            i--;
        }
    }
}
