import javax.swing.JOptionPane;
import java.lang.Math;

public class Questao02{

	public static void main(String[] args){

		int num1, num2, num3, num4, quad = 2;
		double soma = 0;
		JOptionPane.showMessageDialog(null, "Bem vindo ao Quadrava");
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo número: "));
		num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o terceiro número: "));
		num4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o quarto número: "));

		JOptionPane.showMessageDialog(null, "Os números selecionados foram: "+num1+", "+num2+", "+num3+", "+num4);
		soma = Math.pow(num1, quad) + Math.pow(num2, quad) + Math.pow(num3, quad) + Math.pow(num4, quad);

		JOptionPane.showMessageDialog(null, "O resultado da soma dos quadrados dos números selecionados é: "+soma);
}

}
