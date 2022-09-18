package PrimeiroPassosemJava;

import java.util.Scanner;

public class AntecessorSucessor {
	static int antecessor;
	static int sucessor;
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int numero;
	
	System.out.println("Escolha um Número");
	numero = in.nextInt();
	
	antecessor = numero -1;
	sucessor = numero + 1;
	
	System.out.println("O antecessor do numero é: " + antecessor);
	System.out.println("O sucessor do número é: " + sucessor);
		
	}

}
