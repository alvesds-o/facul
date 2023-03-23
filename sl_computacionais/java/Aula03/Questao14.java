import javax.swing.JOptionPane;

public class Questao14 {
    public static void main(String[] args) {

        double num1, num2;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número: "));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, num1 + " é maior que " + num2);
        } 
        else if (num1 == num2) {
            JOptionPane.showMessageDialog(null, num1+" é igual ao "+num2);
        }
        else {
            JOptionPane.showMessageDialog(null, num1+" é menor que "+num2);
            }
        }
    }