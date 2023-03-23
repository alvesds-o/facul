import javax.swing.JOptionPane;

public class Questao11 {
    public static void main(String[] args) {

        double salarioBase, bonificacao, imposto, salarioBruto;

            JOptionPane.showMessageDialog(null, "Vamos calcular o seu holerite");
            salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário base"));
            bonificacao = (salarioBase * 5/100);
            imposto = ((bonificacao+salarioBase) * 7/100);
            salarioBruto =  (bonificacao+salarioBase);

            JOptionPane.showMessageDialog(null, "------------------------ Holerite ------------------------\nSalário base: R$ "+salarioBase+"\nBonificação: R$ "+(bonificacao)+"\nDescontos\nImposto: R$ "+(imposto)+"\nTotal a receber: R$ "+(salarioBruto - imposto));
    }
}
