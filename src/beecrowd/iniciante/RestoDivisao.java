package beecrowd.iniciante;
	
	import java.util.Scanner;

public class RestoDivisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int maior = X > Y ? X : Y;
		int menor = X < Y ? X : Y;
		
		for(int i= menor + 1; i < maior; i++) {
			if(i % 5 == 3) {
				System.out.println(i);
			}
			if(i % 5 == 2) {
				System.out.println(i);
			}
		}

	}

}
