import javax.swing.JOptionPane;

public class Questao04{
    public static void main(String[] args) {
        int numero;
        JOptionPane.showMessageDialog(null, "Encontre o antecessor");

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));

        JOptionPane.showMessageDialog(null, "O antecessor do número escolhido é "+--numero);
    }
}