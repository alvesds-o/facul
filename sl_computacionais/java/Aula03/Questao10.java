import javax.swing.JOptionPane;

public class Questao10 {
    public static void main(String[] args) {

        double produto, desconto, produtoDescontoAplicado;
            JOptionPane.showMessageDialog(null, "Bem-vindo a calculadora de descontos");
            produto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do seu produto"));
            desconto = Double.parseDouble(JOptionPane.showInputDialog("Quanto você planeja dar de desconto?"));
            produtoDescontoAplicado = (produto * (desconto / 100));

            JOptionPane.showMessageDialog(null, "Você aplicou um desconto de "+desconto+"%. Seu produto passou a custar R$ "+ (produto - produtoDescontoAplicado)+" reais.");

    }
}
