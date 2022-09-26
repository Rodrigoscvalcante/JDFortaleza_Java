package EstruturadeRepeticaoI;

import java.util.Scanner;

public class inteironoIntervalo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Digite seu primiero número: ");
		n1 = in.nextInt();
		System.out.println("Digite seu primiero número: ");
		n2 = in.nextInt();
		
		
		for (int i = n1+1 ; i < n2; i++) {
			
		
			System.out.print(i+",");
			
			
					
		}

	}

}
