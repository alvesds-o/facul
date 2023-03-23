import java.util.concurrent.atomic.DoubleAccumulator;

import javax.swing.JOptionPane;

public class Questao17 {
    public static void main(String[] args) {
        double far, cel;

        cel = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a temperatura em grau Celsius:"));
        far = (cel * (9 / 5) + 32); 
        JOptionPane.showMessageDialog(null, "A sua temperatura convertida em Fahrenheit é: " + far + "F");
    }
}
