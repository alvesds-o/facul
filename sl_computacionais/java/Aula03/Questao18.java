import javax.swing.JOptionPane;

public class Questao18 {
    public static void main(String[] args) {
        double real, dolar, realConvertido;

        real = Double.parseDouble(JOptionPane.showInputDialog("Quantos reais você quer converter?"));
        dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação atual do dólar"));

        realConvertido = (real / dolar);

        JOptionPane.showMessageDialog(null, "Realizando a conversão do seu dinheiro, atualmente você possui $"+realConvertido+" dólares");
    }
}
