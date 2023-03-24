import javax.swing.JOptionPane;

public class Questao16 {
    public static void main(String[] args) {

        int num1, num2, num3, num4;

        JOptionPane.showMessageDialog(null, "Digite 3 números em ordem cresce. Depois digite um quarto número de sua preferência");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
        num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número"));

        numCrescente(num1, num2, num3, num4);

        if (num4 > num3) {
            numCrescente(num1, num2, num3, num4);
        } 
        else if (num4 > num2) {
            numCrescente(num1, num2, num4, num3);
        }
        else if (num4 > num1) {
            numCrescente(num1, num4, num2, num3);
        }
        else {
            numCrescente(num4, num1, num2, num3);
        }
    }

    public static void numCrescente(int a, int b, int c, int d) {
        JOptionPane.showMessageDialog(null, a+","+b+","+c+" e "+d);
    }
}
