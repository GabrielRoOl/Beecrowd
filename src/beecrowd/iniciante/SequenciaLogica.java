package beecrowd.iniciante;

import java.util.Scanner;

public class SequenciaLogica {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int N = 0;

        for(int i = 1; i <= x; i++){
            for(int j = 0; j < 2; j++){
                N = i;
                System.out.println(N + " " + (N * N + j) + " " + (N * N * N + j));
            }
        }
    }
}
