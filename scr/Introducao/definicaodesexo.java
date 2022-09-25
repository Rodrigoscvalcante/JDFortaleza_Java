package TesteCondicionalI;

/**
 * 4) Faça um Programa que verifique se uma letra digitada é 
 * "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */
import java.util.Scanner;



public class definicaodesexo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite seu sexo: ");
		System.out.println("F - Feminino e M - Masculino ");
		
		String sexo = in.nextLine();
		

	
	if( sexo.equals("F" ) || sexo.equals("f") ) {
		
		System.out.println("Feminino");
	
	}
	else if ( sexo.equals("M" ) || sexo.equals("m") ){
		System.out.println("Masculino");
	}
	else {
		System.out.println("Operação Invalida");
	}
	
	
	
 	

	}

}
