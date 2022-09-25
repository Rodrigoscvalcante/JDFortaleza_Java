package TesteCondicionalI;

import java.util.Scanner;

public class Maiornumero {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite seu primeiro número: ");
		n1 = in.nextInt();
		
		System.out.println("Digite seu seungo número: ");
		n2 = in.nextInt();
		
		if( n1 > n2) {
			
			System.out.println(n1 + " é o maior número");
			
		}
			
			else if (n1 < n2) {
				
				System.out.println(n2 + " é o maior número");
				
			}
			
			else if(n1 == n2){
					
					System.out.println("Operação invalida para números iguais");
			}
	}
}