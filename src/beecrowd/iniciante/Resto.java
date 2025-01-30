package beecrowd.iniciante;

import java.util.Scanner;

public class Resto {
    public static void main(String args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        for(int i = 0; i < 100; i++){
            if(N % 2 ==0){
                System.out.println(i);
            }
        }
    }
}
