import java.util.Scanner;

public class Ola {

	public static void main(String[] args) {
		
	System.out.println("Digite seu nome: ");	
	
	Scanner leitor = new Scanner(System.in);
	
	String variavel;
	
	variavel = leitor.nextLine();
	
	System.out.println("Olá " +variavel+ " digite sua Idade: ");	
	
	
	int idade;
	idade = leitor.nextInt();
	
	System.out.println("Olá " +variavel+ " sua idade é: " +idade);
		
	}

} 
