package EstruturadeRepeticaoI;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int result = 0;
		int n = 0;
		System.out.println("Escolha um número para tabuada: ");
		n = in.nextInt();
		
		
		for (int i = 1; i <= 10; i++) {
			
			result = i *n;
			System.out.println(i + "x" + n + "=" + result  );
			
	
			
			
		}
		
	}	
}