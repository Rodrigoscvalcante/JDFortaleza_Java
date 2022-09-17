package PrimeiroPassosemJava;
import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	int nota1, nota2, nota3, nota4;
	int media, i;
	int contAluno = 0;
	
	
	for(i = 0; i < 5; i++){
		
		
        System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
        nota1 = in.nextInt();
        
 
        System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
        nota2 = in.nextInt();
        
 
        System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
        nota3 = in.nextInt();
        
       
        System.out.println("Aluno " + contAluno + ", digite sua 4ª nota");
        nota4 = in.nextInt();
        
    
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média do aluno " + contAluno + " é " + media);
        
        
        if(media > 6){
            System.out.println("Você está aprovado");
        }
            else {
            	 System.out.println("Você está reprovado");
            	
            }
        
	        }
		
		}
	}

	
	



