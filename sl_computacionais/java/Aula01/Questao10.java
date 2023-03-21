import javax.swing.JOptionPane;

public class Questao10 {
    public static void main(String[] args) {
        float custoFabrica, custoRevendedor = 28, imposto = 45, consumidorFinal;

        custoFabrica = Float.parseFloat(JOptionPane.showInputDialog("Digite o custo de fábrica do seu carro: "));
        JOptionPane.showMessageDialog(null, "O seu carro custou R$"+custoFabrica+" para sair da fábrica.\nAcrescidos os valores de imposto e revenda seu carro custará R$"+((custoFabrica*imposto/100)+(custoFabrica*imposto/100)*custoRevendedor/100 + custoFabrica));

    }
}
