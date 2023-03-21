import javax.swing.JOptionPane;

public class Questao09 {
 public static void main(String[] args) {
        
        float salario, aumento, aumentoReal = 3;
        salario = Float.parseFloat(JOptionPane.showInputDialog("Quanto você recebe por mês?"));
        aumento = Float.parseFloat(JOptionPane.showInputDialog(
                "Quanto de aumento você acha que deve receber? (Digite um inteiro para representar a porcentagem)"));
         JOptionPane.showMessageDialog(null,
                "Seu salário atual é de " + salario + "reais, você tentou aumentar seu salário em " + aumento
                        + "%, mas o seu aumento será de 3%, porque a vida não é um morango");
        JOptionPane.showMessageDialog(null,"O seu novo salário será R$"+((salario * aumentoReal)/100+ salario+" reais"));
    }
}
