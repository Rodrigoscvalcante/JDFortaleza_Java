package PrimeiroPassosemJava;

import java.util.Scanner;

public class Calculosalario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salario, valorHoras, horas;
		
		
		System.out.println("Digite o valor das horas trabalhadas: ");
		valorHoras = in.nextDouble();
		
		System.out.println("Digite os meses trabalhados: ");
		horas = in.nextDouble();
		
		salario = valorHoras * horas;
		
		System.out.println("O seu salário trabalhado é: " + salario);
		
	}

}
