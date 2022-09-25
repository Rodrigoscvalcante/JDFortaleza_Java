package TesteCondicionalI;

import java.util.Scanner;

public class positivonegativo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1;
		
		System.out.println("Digite um valor ");
		n1 = in.nextInt();
		
		
		
		if( n1 < 0) {
			
			System.out.println(n1 + " é um número  negativo");
			
		}
			
			else if (n1 > 0 ) {
				
				System.out.println(n1 + " é um número Positivo");
				
			}
			
			else if(n1 == 0){
					
					System.out.println("zero é um número neutro");
			}
	}
}