import javax.swing.JOptionPane;

public class UserInput {
    public static void main(String[] args) {
        int num = 0;
        int num2;
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));

            while (num <= num2) {
                JOptionPane.showMessageDialog(null," "+ num);
                num = num + 1;
            }
    }
}
