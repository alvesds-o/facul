import javax.swing.JOptionPane;
import java.lang.Math;

public class Questao09 {
    public static void main(String[] args) {

        double quadrado, cubo, raiz;
        double num1, num2, num3;

        quadrado = Double.parseDouble(JOptionPane.showInputDialog("Digite o número que deseja elevar ao quadrado"));
        cubo = Double.parseDouble(JOptionPane.showInputDialog("Digite o número que deseja elevar ao cubo"));
        raiz = Double.parseDouble(JOptionPane.showInputDialog("Digite o número que deseja descobrir a raiz quadrada"));
        
        num1 = Math.pow(quadrado, 2);
        num2 = Math.pow(cubo, 3);
        num3 = Math.sqrt(raiz);

            JOptionPane.showMessageDialog(null, "Número elevado ao quadrado: "+num1+"\nNúmero elevado ao cubo: "+num2+"\nRaiz quadrada: "+num3);
    }
}
