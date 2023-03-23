import javax.swing.JOptionPane;

public class Questao15 {
    public static void main(String[] args) {

        double num1, num2, num3;

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));

        if (num1 > num2 && num2 > num3) {
            maiorQue(num1, num2, num3);
        } else if (num2 > num1 && num3 > num2) {
            maiorQue(num3, num2, num1);
        } else if (num3 > num1 && num1 > num2) {
            maiorQue(num3, num1, num2);
        } else if (num2 > num3 && num1 > num3) {
            maiorQue(num2, num1, num3);
        }
    }

    public static void maiorQue(double a, double b, double c) {
        JOptionPane.showMessageDialog(null, a+">"+b+">"+c);
    }
}
