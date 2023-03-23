import javax.swing.JOptionPane;

public class Questao12 {
    public static void main(String[] args) {

        double salarioBase, percentualAumento, salarioAumento;

        JOptionPane.showMessageDialog(null, "Calculadora de aumento salarial");
        salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário atual do colaborador"));
        percentualAumento = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de aumento"));
        salarioAumento = ((salarioBase * percentualAumento) / 100 + salarioBase);
        
        JOptionPane.showMessageDialog(null,"O seu salário atual é: R$ "+salarioAumento+"\nvocê teve um aumento de "+percentualAumento+"%.");

    }
}
