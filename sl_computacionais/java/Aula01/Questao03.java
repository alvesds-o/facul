import javax.swing.JOptionPane;

public class Questao03{
    public static void main(String[] args) {
        double salario = 1320, comissao = 0.05, peca = 50, venda;
        String nome;
        // Apresentação e enredo
            JOptionPane.showMessageDialog(null,"Bem-vindo a fábrica de peças JavaCar. \nVi que você deu entrada no nosso processo seletivo.");
            nome = JOptionPane.showInputDialog("Por favor, digite o seu nome");
            JOptionPane.showMessageDialog(null,
                    "Parabéns " + nome + ", você foi aprovado em nosso processo. Bem-vindo a equipe JavaCar!!");
            JOptionPane.showMessageDialog(null,"1 mês depois...");
        //Vendas
            JOptionPane.showMessageDialog(null,"Finalmente chegou ao quinto dia útil do mês, vamos aos pagamentos");
            venda = Double.parseDouble(
                    JOptionPane.showInputDialog(nome + ", informe a quantidade de peças vendidas esse mês "));
            JOptionPane.showMessageDialog(null, nome+"Você vendeu "+venda+" peças, cada peça vendida custou R$ 50,00.\n O total das suas vendas foi de"+(venda * peca)+" reais.\n Atualmente a sua taxa de comissão é fixada em 5%.\nSendo assim, seu salário esse mês será de "+comissao*(venda*peca)+" reais +"+salario+" que é o valor do seu salário fixo.");
                
        
        
                    
    }
}
