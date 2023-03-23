import javax.swing.JOptionPane;
import java.lang.Math;

public class Questao08 {

    public static void main(String[] args) {

        double x = 3.14, r, resultado;
        JOptionPane.showMessageDialog(null, "Vamos calcular a área de um círculo.");
        r = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do círculo"));
        resultado = (x*Math.pow(r, 2));

        JOptionPane.showMessageDialog(null, "O valor da área do círculo é "+resultado);
        }
    }