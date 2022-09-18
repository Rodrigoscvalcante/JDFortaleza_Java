package PrimeiroPassosemJava;
import javax.swing.JOptionPane;
public class EntradadeDados {

	public static void main(String[] args) {
	
		double numero;
		
		numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu Número: "));
		JOptionPane.showMessageDialog(null,"Seu número é: " +numero);

	}

}
