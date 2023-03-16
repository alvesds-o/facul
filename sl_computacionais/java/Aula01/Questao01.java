import javax.swing.JOptionPane;

public class Questao01 {
    public static void main(String[] args) {

        String box1 = "";
        String box2 = "";
        double cotacaoDolar = 0, real = 0, convertido = 0, carteira = 0;
        
            JOptionPane.showMessageDialog(null, "Bem-vindo ao conversor Dólar to Real\n     Clique em Ok para prosseguir");
            box1 = JOptionPane.showInputDialog(null, "Insira a cotação atual do real em relação ao dólar: ");
            cotacaoDolar = Double.parseDouble(box1);

            box2 = JOptionPane.showInputDialog(null, "Insira a quantidade de dólares: ");
            carteira = Double.parseDouble(box2);

            JOptionPane.showMessageDialog(null, "Atualmente você possui: R$ "+cotacaoDolar * carteira+" reais");

    }
}

