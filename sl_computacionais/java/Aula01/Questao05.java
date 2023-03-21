import javax.swing.JOptionPane;

public class Questao05 {
    public static void main(String[] args) {
        float base, altura;

        JOptionPane.showMessageDialog(null, "Cálcule a área do retângulo");
        base = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da base "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura "));
        JOptionPane.showMessageDialog(null,"O valor da área do retângulo é "+altura*base);
    }
}
