package EstruturadeRepeticaoI;

import java.util.Scanner;

public class somadosnumeros {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double numeros=0;
		double media = 0;
		
		for (int i = 0; i < 5; i++) {
			
		System.out.println("Digite 5 numeros: ");
		numeros = in.nextInt();
		
		media = media + numeros / 5;
		
		
		}
		
		System.out.println("A média dos números é: " + media);

	}

}
