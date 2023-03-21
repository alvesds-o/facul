import javax.swing.JOptionPane;

public class Questao06 {
    public static void main(String[] args) {
        int idade, ano = 365;
        JOptionPane.showMessageDialog(null, "Cálcule a sua idade");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
        JOptionPane.showMessageDialog(null, "Convertido em dias, você possui uma idade de "+idade * 365+" dias.");
    }
}
