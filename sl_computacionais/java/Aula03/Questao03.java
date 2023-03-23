import javax.swing.JOptionPane;

public class Questao03 {
    public static void main(String[] args) {
        int numero;
        numero = Integer
                .parseInt(JOptionPane.showInputDialog("Digite um número. Vamos verificar se ele é par ou ímpar"));
        if(numero %2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é par");
        } else {
            JOptionPane.showMessageDialog(null, "O número é impar");
        }
    }
}