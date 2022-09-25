package TesteCondicionalI;

import java.util.Scanner;

public class maiornumero3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite seu primeiro número: ");
		n1 = in.nextInt();
		
		System.out.println("Digite seu seungo número: ");
		n2 = in.nextInt();
		
		System.out.println("Digite seu terceiro número: ");
		n3 = in.nextInt();
		
		if( n1 > n2 && n1 > n3) {
			
			System.out.println(n1 + " é o maior número");
			
		}
			
			else if (n2 > n1 && n2 > n3) {
				
				System.out.println(n2 + " é o maior número");
				
			}
		

	
	else if (n3 > n1 && n3 > n2) {
		
		System.out.println(n3 + " é o maior número");
		
	}
			
			if(n1 == n2 || n2 == n3 || n3 == n1 || n3 == n2){
					
					System.out.println("Operação invalida para números iguais");
			} 
	}
}